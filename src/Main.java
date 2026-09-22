import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("janeiro");
                break;

            case 2:
                System.out.println("fevereiro");
                break;

            case 3:
                System.out.println("março");
                break;

            case 4:
                System.out.println("abril");
                break;

            case 5:
                System.out.println("maio");
                break;

            case 6:
                System.out.println("junho");
                break;

            case 7 :
                System.out.println("julho");
                break;

            default:
                System.out.println("Mês inválido");
        }
    }
}