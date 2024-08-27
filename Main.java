import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Banco meu_banco = new Banco();
        ContaBancaria conta1 = new ContaBancaria();

        meu_banco.Nome = "Banco do Brasil";
        System.out.print("Qual nome do titular: ");
        String t = sc.nextLine();
        meu_banco.criar_conta(t, 1500);
        conta1.nome = t;
        conta1.saldo = 1500;
        conta1.verificar_saldo();

        sc.close();
    }
}
