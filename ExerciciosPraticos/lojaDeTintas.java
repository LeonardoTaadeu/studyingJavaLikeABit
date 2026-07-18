import java.util.Scanner;

public class lojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho da Area a ser pintada: ");
        double areaPintada = scanner.nextDouble();

        double litrosNecessarios = areaPintada/12;

        double latasNecessarias = litrosNecessarios/18;

        double qntdLatas = Math.ceil(latasNecessarias);

        double precoTotal = qntdLatas * 80;

        System.out.println("Para uma parede de area " + areaPintada + "m² voce vai precisar de " + qntdLatas + " latas com o custo de R$" + precoTotal);
    }
}