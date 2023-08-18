import java.util.Scanner;
public class EvenOrOdd {

    public static void main(String[] args) {
        int n1;
        int n2;
        double resto;
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o 1º numero ");
        n1 = scanner.nextInt();
        System.out.println("Digite o 2º numero ");
        n2 = scanner.nextInt();
        
        resto = (n1 + n2);
        
        if (resto % 2 == 0) {
            System.out.print("O resto da soma deste número é um número par...");
        }
        else {
            System.out.print("O resto da soma deste número é um número ímpar...");
        }

        
        
    }
}

    

