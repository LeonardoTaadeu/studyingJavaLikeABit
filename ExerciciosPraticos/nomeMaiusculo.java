import java.util.Scanner;

public class nomeMaiusculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();

        String nomeMaiusculo = nome.toUpperCase();

        System.out.println(nomeMaiusculo);
    }
}