# Violação do LSP

## Conceito
O **Princípio de Substituição de Liskov (LSP)** estabelece que objetos de subtipos devem poder substituir objetos do supertipo sem alterar a correção do programa.

## Exemplo de Violação

### Contrato do Supertipo (`Pedido`)
Método `aplicarFrete(double valorFrete)` garante que:
- `valorFinal` nunca diminui em relação ao `valorBruto`
- Se `valorFrete > 0`, ele é adicionado ao `valorFinal`

### Comportamento do Subtipo (`PedidoComFreteGratis`)
- Sobrescreve `aplicarFrete()` ignorando o `valorFrete` passado
- Força o frete a ser sempre `$0.0`

### Impacto no Cliente (`ProcessadorDePagamento`)
O cliente espera o comportamento do supertipo:
- Ao chamar `aplicarFrete(10.0)`, espera que `valorFinal` aumente em `$10.0`
- Com `PedidoComFreteGratis`, o valor permanece inalterado
- Pode gerar `IllegalStateException` ou comportamento inesperado
- **Resultado:** quebra do contrato de comportamento e violação do LSP
