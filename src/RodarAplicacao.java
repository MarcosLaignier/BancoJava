import javax.swing.*;

public class RodarAplicacao {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNomeCliente(JOptionPane.showInputDialog("Digite o nome do portador da conta"));

        ContaCorrente cc = new ContaCorrente(cliente);
        cc.depositar(100);
        cc.sacar(30);
        cc.ImprimirExtrato();
        System.out.println("----------------------------");
        cliente.setNomeCliente(JOptionPane.showInputDialog("Digite o nome do portador da conta"));

        ContaPoupanca cp = new ContaPoupanca(cliente);
        cp.ImprimirExtrato();

        System.out.println("----------------------");
        cc.transferir(cp, 30);
        System.out.println("Transferencia realizada da conta " + cc.numeroConta + " para a conta " + cp.numeroConta);
        cc.ImprimirExtrato();
        System.out.println("----------------------");
        cp.ImprimirExtrato();
    }
}
