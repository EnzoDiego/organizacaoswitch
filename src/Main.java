import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String opcao;

        System.out.println("Digite uma opção:");
        opcao = scanner.nextLine().toLowerCase();


        switch (opcao) {
            case "cadastrar":
                System.out.println("Cadastro selecionado");
                break;

            case "consultar":
                System.out.println("Consulta selecionada");
                break;

            case "excluir":
                System.out.println("Exclusão selecionada");
                break;

            case "sair":
                System.out.println("Programa encerrado");
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}