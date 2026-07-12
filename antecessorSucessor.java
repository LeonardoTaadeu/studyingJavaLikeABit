import java.util.Scanner;

public class antecessorSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero positivo inteiro qualquer: ");
        int numeroInteiroPositivo = scanner.nextInt();

        int sucessor = numeroInteiroPositivo + 1;
        int antecessor = numeroInteiroPositivo - 1;

        System.out.println("O numero que voce escolheu foi o " + numeroInteiroPositivo + "!");
        System.out.println("O sucessor do " + numeroInteiroPositivo + " eh o " + sucessor);
        System.out.println("O antecessor do " + numeroInteiroPositivo + " eh o " + antecessor);
    }
}