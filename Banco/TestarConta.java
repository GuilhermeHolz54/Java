package Banco;

public class TestarConta {

    public static void main(String[] args) {
        System.out.println("=== Testes da ContaBancaria ===\n");

        ContaBancaria c1 = new ContaBancaria(100.0, 300.0);
        System.out.println("Teste 1 — Estado inicial da conta");
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Limite: " + c1.getLimite());
        System.out.println("Total disponível: " + c1.getSaldoComLimite());
        System.out.println();

        ContaBancaria c2 = new ContaBancaria(50.0, 200.0);
        System.out.println("Teste 2 — Depósito válido (R$200)");
        try {
            c2.depositar(200.0);
            System.out.println("Depósito realizado com sucesso!");
        } catch (ContaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Saldo: " + c2.getSaldo());
        System.out.println();

        ContaBancaria c3 = new ContaBancaria(100.0, 100.0);
        System.out.println("Teste 3 — Depósito inválido (R$1500)");
        try {
            c3.depositar(1500.0);
            System.out.println("Depósito realizado (não era pra acontecer).");
        } catch (ContaException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
        System.out.println("Saldo: " + c3.getSaldo());
        System.out.println();

        ContaBancaria c4 = new ContaBancaria(400.0, 200.0);
        System.out.println("Teste 4 — Saque válido (R$300)");
        try {
            c4.sacar(300.0);
            System.out.println("Saque realizado com sucesso!");
        } catch (ContaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Saldo: " + c4.getSaldo());
        System.out.println();

        ContaBancaria c5 = new ContaBancaria(1000.0, 500.0);
        System.out.println("Teste 5 — Saque inválido (R$600)");
        try {
            c5.sacar(600.0);
            System.out.println("Saque realizado (não era pra acontecer).");
        } catch (ContaException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
        System.out.println("Saldo: " + c5.getSaldo());
        System.out.println();

        ContaBancaria c6 = new ContaBancaria(50.0, 30.0);
        System.out.println("Teste 6 — Saque inválido (R$100)");
        try {
            c6.sacar(100.0);
            System.out.println("Saque realizado (não era pra acontecer).");
        } catch (ContaException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
        System.out.println("Saldo: " + c6.getSaldo());
        System.out.println();

        ContaBancaria c7 = new ContaBancaria(0.0, 100.0);
        System.out.println("Teste 7 — Depósito e depois saque");
        try {
            c7.depositar(400.0);
            System.out.println("Depósito realizado com sucesso!");
            c7.sacar(300.0);
            System.out.println("Saque realizado com sucesso!");
        } catch (ContaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Saldo final: " + c7.getSaldo());
        System.out.println("\n=== Fim dos testes ===");
    }
}
