import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

       //TODO: Conhecer e importar a classe Scanner 

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        //Exibir as mensagens para o nosso usuário 
        //Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da Conta:");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        String saldoTexto = scanner.nextLine().replace(",", "."); 
        saldo = Double.parseDouble(saldoTexto);

        //Exibir a mensagem conta criada 
        String mensagem = "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo R$ ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque.");

        System.out.println("\n" + mensagem);

        scanner.close();
    }
}
