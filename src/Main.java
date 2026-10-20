import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, seja Bem-vindo");

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String CPF = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite seu altura:");
        double altura = scanner.nextDouble();

        // professor aqui meu cod não estava lendo o estado civil ele pulava direto para as respostas, dai eu vi com //
        // char gpt e ele mnd colocar esse scaner.nextLine, mas nao entendi o por que de não estar lendo. //

        scanner.nextLine();
        System.out.println("Digite seu estado civil:");
        String estadoCivil = scanner.nextLine();

        System.out.println("Seu nome completo é: " + nomeCompleto + "\n" +
                              "Seu CPF é: " + CPF + "\n" +
                              "Sua idade é: " + idade + "\n"+
                              "Seu peso é: " + peso + "\n" +
                              "Sua altura é: " + altura + "\n" +
                              "Seu estado civil é: " + estadoCivil);
    }
}