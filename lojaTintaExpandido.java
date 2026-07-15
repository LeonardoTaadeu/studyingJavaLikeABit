import java.util.Scanner;

public class lojaTintaExpandido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho da area a ser pintada: ");
        double areaParaPintar = scanner.nextDouble();

        double litrosNecessarios = areaParaPintar/12; //1 litro cobre 12 metros 

        double qntdLatasNecessarias = Math.ceil(litrosNecessarios/18); //1 lata tem 18 litros
        double precoLatas = qntdLatasNecessarias*80;

        double qntdGaloesNecessarios = Math.ceil(litrosNecessarios/3.6);
        double precoGaloes = qntdGaloesNecessarios*25;

        //pintando com tinta e galao
        double qntdLatasParaAmbos = litrosNecessarios/18;
        double qntdGaloesParaAmbos = qntdLatasParaAmbos % 3.6;
        
        

        System.out.println("Comprando apenas latas, voce vai gastar um total de R$" + precoLatas);
        System.out.println("Comprando apenas galoes, voce vai gastar um total de R$" + precoGaloes);
        System.out.println(qntdLatasParaAmbos);
        System.out.println(qntdGaloesParaAmbos);
    }
}