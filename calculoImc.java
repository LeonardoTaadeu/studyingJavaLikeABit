import java.util.Scanner;

public class calculoImc {
    public static void main(String[] args) {
        //O Indice de Massa Corporal (IMC) eh calculado dividindo o peso (em kg) pela altura ao quadrado (em m)
        //Para um peso de ...... e altura de ......., o IMC calculado eh de ........
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual eh o seu peso: ");
        float peso = scanner.nextFloat();

        System.out.println("Qual eh a sua altura: ");
        float altura = scanner.nextFloat();

        float alturaQuadrado = altura * altura;

        float imc = peso / alturaQuadrado;

        System.out.printf("Para um peso de " + peso + " e altura de " + altura + ", o IMC calculado eh de %.2f%n",imc);
    }
}