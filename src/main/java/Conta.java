import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Author: José Ramos (210232)
 * Classe que representa uma conta para cenários de saque.
 */
public class Conta {

    /** O saldo atual da conta. */
    private int saldo;

    /** Indica se o cliente é especial. */
    private boolean isEspecial;

    /** Mensagem de erro durante o saque. */
    private String mensagemErro;

    /**
     * Inicializa uma nova instância da classe Conta para um cliente especial.
     * @param saldoInicial O saldo inicial da conta.
     */
    @Given("Um cliente especial com saldo atual de {int} reais")
    public void umClienteEspecialComSaldoAtualDeReais(int saldoInicial) {
        saldo = saldoInicial;
        isEspecial = true;
    }

    /**
     * Inicializa uma nova instância da classe Conta para um cliente comum.
     * @param saldoInicial O saldo inicial da conta.
     */
    @Given("Um cliente comum com saldo atual de {int} reais")
    public void umClienteComumComSaldoAtualDeReais(int saldoInicial) {
        saldo = saldoInicial;
        isEspecial = false;
    }

    /**
     * Processa uma solicitação de saque na conta.
     * @param valorSaque O valor a ser sacado.
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void forSolicitadoUmSaqueNoValorDeReais(int valorSaque) {
        try {
            verificarSaldo(valorSaque);
            realizarSaque(valorSaque);
        } catch (RuntimeException e) {
            mensagemErro = e.getMessage();
        }
    }

    /**
     * Processa uma solicitação de saque na conta.
     * @param valorSaque O valor a ser sacado.
     */
    @When("solicitado um saque de {int} reais")
    public void solicitadoUmSaqueDeReais(int valorSaque) {
        try {
            verificarSaldo(valorSaque);
            realizarSaque(valorSaque);
        } catch (RuntimeException e) {
            mensagemErro = e.getMessage();
        }
    }

    /**
     * Verifica se o saque foi efetuado e atualiza o saldo da conta.
     * @param novoSaldo O novo saldo da conta após o saque.
     */
    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deveEfetuarOSaqueEAtualizarOSaldoDaContaParaReais(int novoSaldo) {
        assertEquals(novoSaldo, saldo);
    }

    /**
     * Verifica se o saque não foi efetuado e retorna a mensagem de saldo insuficiente.
     */
    @Then("nao deve efetuar o saque e e deve retornar a mensagem Saldo insuficiente")
    public void naoDeveEfetuarOSaqueEDeveRetornarAMensagemSaldoInsuficiente() {
        assertTrue(mensagemErro.contains("Saldo Insuficiente"));
        assertEquals(-200, saldo);
    }

    /**
     * Verifica o saldo da conta para determinar se o saque é possível.
     * @param valor O valor do saque.
     */
    private void verificarSaldo(int valor) {
        if (valor > saldo && !isEspecial) {
            throw new RuntimeException("Saldo Insuficiente");
        }
    }

    /**
     * Realiza o saque na conta.
     * @param valor O valor do saque.
     */
    private void realizarSaque(int valor) {
        saldo -= valor;
    }
}
