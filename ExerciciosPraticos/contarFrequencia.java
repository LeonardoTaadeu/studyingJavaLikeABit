import java.util.Scanner;

public class contarFrequencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        System.out.println("Qual palavra voce gostaria de visitar nesse texto: ");
        String consulta = scanner.nextLine();
    }
}