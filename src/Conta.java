public class Conta {
    int agencia;
    int numeroConta =1;
    double saldo;
    Cliente cliente;

    private static int AgenciaPadrao=1;
    private static int sequencial = 1;
    public Conta(Cliente cliente){
        this.agencia = AgenciaPadrao;
        this.numeroConta=sequencial++;
        this.cliente = cliente;
    }

    public void depositar(double valor){
        this.saldo +=valor;
    }

    public void sacar(double valor){
        this.saldo -=valor;
    }

    public void transferir(Conta contaD , double valor){
        this.sacar(valor);
        contaD.depositar(valor);
    }

    public void ImprimirExtrato(){
        System.out.println(cliente.nomeCliente);
        System.out.println("Agencia - " + agencia);
        System.out.println("Numero Conta - " + numeroConta);
        System.out.println("Saldo R$"+ saldo );
    }
}
