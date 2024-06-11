import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Digite um numero inteiro nao negativo: ");
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();
        
        if (number < 0) {
            System.out.println("Numero invalido, tente de novo: ");   
        }
        double squareRoot = Math.sqrt(number);
        System.out.println("A raiz quadrada do numero: " + number + " e " + squareRoot);

    }
    
}