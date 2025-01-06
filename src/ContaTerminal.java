import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        //Mensagem de solicitação de dados
        System.out.println("Obrigado por querer criar uma conta conosco. Por favor nos informe os dados abaixo.");
        
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite seu sobrenome");
        String sobrenomeCliente = sc.nextLine();
        
        
        int numeroConta = 1021;
        String agencia = "067-8";    
        double saldo = 237.48;
        
        
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$" + saldo + " já está disponível para saque");

        sc.close();
    

    }
}
