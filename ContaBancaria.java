public class ContaBancaria {

    int numero;
    String nome;
    double saldo;

    public void depositar (double valor) {      
        System.out.println("Depositando");    
        saldo = saldo + valor;
    } 
    public void sacar (double valor) {
        if(saldo >= valor){
            System.out.println("Sacando...");    
            saldo = saldo - valor;
            System.out.println("Saldo realizado com sucesso!");
        }else{
            System.out.println("Saldo insulficiente");
        }
    } 
    public void verificar_saldo () {      
       System.out.println(saldo);
    } 
}