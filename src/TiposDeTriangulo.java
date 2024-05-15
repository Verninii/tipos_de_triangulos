import java.util.Scanner;

public class TiposDeTriangulo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o valor do primeiro lado? ");
        double lado1 = leitor.nextDouble();

        System.out.print("Qual o valor do segundo lado? ");
        double lado2 = leitor.nextDouble();

        System.out.print("Qual o valor do terceiro lado? ");
        double lado3 = leitor.nextDouble();

        double soma1 = lado1 + lado2;
        double soma2 = lado2 + lado3;
        double soma3 = lado3 + lado1;

        if (soma1 > lado3 && soma2 > lado1 && soma3 > lado2){
            if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
                System.out.println(" Este é um triângulo escaleno");
            } else if (lado1 == lado2 && lado2 != lado3) {
                System.out.println("Este é um triângulo isósceles");
            } else if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Este é um triângulo equilátero");
            }
        } else {
            System.out.println("Esta estrutura não é um triângulo");
        }

    }
}
