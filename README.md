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

### 4. Métodos Auxiliares

- **Verificação de Cliente Especial**
  - `check_more_outcomes()`: Verifica se o cliente é especial.

- **Verificação de Saque Não Efetuado**
  - `não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_de_saldo_insuficiente()`: Verifica se o saque não foi efetuado e retorna a mensagem de saldo insuficiente.

### 5. Execução de Testes

Execute os testes para garantir o correto funcionamento das funcionalidades.
