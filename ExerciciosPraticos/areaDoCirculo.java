import java.util.Scanner;

public class areaDoCirculo {
    public static void main(String[] args) {
        //A área de um círculo é dada por  π*r^2, em que r é o raio do círculo
        
        Scanner scanner = new Scanner(System.in);

        double numeroPi = 3.1415926;

        System.out.println("Qual o raio do circulo: ");
        double raioCirculo = scanner.nextDouble();

        double raioAoQuadrado = raioCirculo * raioCirculo;

        double AreaCirculo = numeroPi * raioAoQuadrado;

        System.out.printf("Para um circulo de Raio " + raioCirculo + ", a sua area eh %.1f%n",AreaCirculo);
    }
}