import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor a largura do retangulo (base) em cm :");
        double base = ler.nextDouble();

        System.out.println("Digite a altura do retangulo em cm: ");
                double altura = ler.nextDouble();

        double area = base*altura;
        double perimetro = (base+altura)/2;

        System.out.println("A area do retangulo com base de "+base+"cm" +" e altura de " +altura+"cm"
        + " é de : " +area+"cm");
        System.out.println("O perimetro do retangulo com base de "+base+"cm" +" e altura de " +altura+"cm"
        +" é de : "+perimetro+"cm");

        ler.close();


    }
}
