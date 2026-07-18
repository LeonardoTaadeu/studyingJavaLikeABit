import java.util.Scanner;

public class descobrindoSuaIdadeEm2027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em que ano voce nasceu: ");
        int ano = scanner.nextInt();

        int descobrirIdade = 2027 - ano;

        System.out.println("Em 2027 voce vai fazer " + descobrirIdade + "!");
    }
}