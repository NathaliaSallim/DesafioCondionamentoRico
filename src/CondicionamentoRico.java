import java.util.Scanner;

public class CondicionamentoRico {
    public static void main(String[] args) {
    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();
    int novoSaldo;

    /*TODO: Criar as condições necessárias para impressão da saída, 
    vide tabela de exemplos.*/
    if(saldoTotal >= valorSaque) {
       novoSaldo = saldoTotal - valorSaque;
       System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
    }
    else {
        System.out.println("Saldo insuficiente. Saque não realizado!");
    }

    }
}
