import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

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

        //Chamei 
        int numeroConta = random.nextInt(9000);
        int agencia = random.nextInt(9000);    
        double saldo = random.nextDouble();

        

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "-1, conta " + numeroConta + " e seu saldo " + (saldo * 100) + " já está disponível para saque");

        sc.close();
    

    }
}
