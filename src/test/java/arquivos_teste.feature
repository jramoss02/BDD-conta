#Author: 02.jrsramos@gmail.com
#Keywords Summary: Junit, Cucumber
#Feature: Cliente faz saque de dinheiro Como um cliente,
#  eu gostaria de sacar dinheiro em caixa eletronico,
#  para que eu n�o tenha que esperar em uma fila do banco
#  @tag1
#  Scenario: Cliente especial com saldo negativo
#    Given Um cliente especial com saldo atual de -200 reais
#    When for solicitado um saque no valor de 100 reais
#    Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
#    And check more outcomes
#  @tag2
#  Scenario Outline: Cliente comum com saldo negativo
#    Given Um cliente comum com saldo atual de -200 reais
#    When solicitado um saque de 200 reais
#    Then n�o deve efetuar o saque e e deve retornar a mensagem Saldo insuficiente
@tag
Feature: Cliente faz saque de dinheiro Como um cliente,
  eu gostaria de sacar dinheiro em caixa eletronico,
  para que eu nao tenha que esperar em uma fila do banco

  @tag1
  Scenario: Cliente especial com saldo negativo
    Given Um cliente especial com saldo atual de -200 reais
    When for solicitado um saque no valor de 100 reais
    Then deve efetuar o saque e atualizar o saldo da conta para -300 reais

  @tag2
  Scenario Outline: Cliente comum com saldo negativo
    Given Um cliente comum com saldo atual de -200 reais
    When solicitado um saque de 200 reais
    Then nao deve efetuar o saque e e deve retornar a mensagem Saldo insuficiente