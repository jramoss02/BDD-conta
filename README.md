# Conta Bancária

Este é um projeto Java que implementa uma classe simples chamada `Conta`, representando uma conta bancária com funcionalidades básicas.

## Funcionalidades

### 1. Configuração da Conta

- **Cliente Especial com Saldo Negativado**
  - `clienteEspecialComSaldoNegativado(Integer saldoNegativado)`: Configura um cliente especial com saldo negativo.

- **Cliente Comum com Saldo Negativado**
  - `um_cliente_comum_com_saldo_negativado_de_reais(Integer saldoNegativado)`: Configura um cliente comum com saldo negativo.

- **Cliente Especial com Saldo**
  - `um_cliente_especial_com_saldo_de_reais(Integer saldo)`: Configura um cliente especial com saldo positivo.

- **Cliente Comum com Saldo Atual**
  - `um_cliente_comum_com_saldo_atual_de_reais(Integer saldo)`: Configura um cliente comum com saldo.

### 2. Operações Bancárias

- **Solicitação de Saque**
  - `solicita_saque_de_reais(Integer valorSaque)`: Processa a solicitação de saque.

- **Realização de Saque**
  - `sacar(int valor)`: Realiza o saque da conta.

### 3. Verificações

- **Verificação de Saque Efetuado**
  - `saque_deve_ser_efetuado_e_o_saldo_atualizado_para_reais(Integer novoSaldo)`: Verifica se o saque foi efetuado com sucesso e o saldo foi atualizado.

- **Verificação de Saque Negado**
  - `saque_negado_pois_o_cliente_n_o_tem_saldo_suficiente()`: Verifica se o saque é negado devido ao saldo insuficiente.

### 4. Execução e resultado dos Testes

> Primeiro teste
![print1](https://github.com/jramoss02/BDD-conta/assets/77749469/6571cf04-1ac9-4a58-b86a-31330c4270ee)
- Feito após a criação do arquivo de testes.

> Segundo teste
![print2](https://github.com/jramoss02/BDD-conta/assets/77749469/ac600f41-5cda-4a3b-bfa7-215f993d8e4e)
- Primeira vez rodando o teste utilizando JUnit, a partir desse ponto, utilizei as sugestões para desenvolver o resto da aplicação.

> Teste final
![print3](https://github.com/jramoss02/BDD-conta/assets/77749469/be0ec9ca-efd5-4e4f-b4f0-3a50fc37b7b1)
- Realizado após todas as implementações das sugestões.

