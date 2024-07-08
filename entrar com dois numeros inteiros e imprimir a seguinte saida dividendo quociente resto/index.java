import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.println("Digite o divisor: ");
        int divisor = sc.nextInt();

        int resto = dividendo % divisor;

        int quociente = dividendo / divisor;

        System.out.println("Dividendo: " + dividendo + "\nDivisor: " + divisor + "\nQuociente: " + quociente + "\nResto: " + resto);
    }
}