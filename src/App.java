import menu.AppMenu;
import service.EmpregadoService;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // while : verifica - faz
        // do...while: faz - verifica

        Scanner keyboardScanner = new Scanner(System.in);
        EmpregadoService empregadoService = new EmpregadoService();

        do {
            AppMenu.show();
            int option = keyboardScanner.nextInt();

            if(option == 0)
                break;

            switch (option) {
                case 1 -> empregadoService.cadastrar();
                case 2 -> empregadoService.exibirTodos();
                default -> System.out.println("Digite uma opcao valida!");
            }

        } while(true);

    }

}