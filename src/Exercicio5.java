import java.util.Scanner;

public class Exercicio5
{
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = leitor.nextDouble();

        double fahrenheit = (celsius*9/5) + 32;

        System.out.println(celsius +" Em graus fahrenheit é :  "+fahrenheit);

        leitor.close();
    }
}
