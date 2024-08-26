public class Banco{
    String Nome;
    int Contas;
    
    public void criar_conta(String titular, int saldo_incial){
        System.out.println("SEJA BEM VINDO "+titular+", seu saldo é "+saldo_incial+"!");
    }

    public void encontrar_conta(int numero){
        System.out.println("conta: " + numero);
    }

    public void transferir(int valor, int conta_origem, int conta_destino){
        System.out.println("Trasferindo "+valor+" para "+conta_destino+"...");
        System.out.println("Transferencia concluida");
    }
}