public class ContaBancaria {

    int numero;
    String nome;
    double saldo;

    public void depositar (double valor) {      
        System.out.println("Depositando");    
        saldo = saldo + valor;
    } 
    public void sacar (double valor) {      
        System.out.println("Sacar");    
        saldo = saldo - valor;
    } 
    public void verificar_saldo () {      
       System.out.println(saldo);
    } 
}