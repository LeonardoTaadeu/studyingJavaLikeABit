import java.util.Scanner;

public class OlaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome jovem Padawan: ");
        String nome = scanner.nextLine();

        System.out.println("Ola meu querido, " + nome + " Padawan.");
    }
}