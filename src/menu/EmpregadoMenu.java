package menu;

import model.Empregado;
import model.Terceirizado;

import java.util.List;
import java.util.Scanner;

public class EmpregadoMenu {

    private static final Scanner scanner = new Scanner(System.in);

    public static Empregado inserir() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Valor p/ hora: ");
        double valorPorHora = scanner.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Eh terceirizado? (s/n): ");
        boolean ehTerceirizado = scanner.next().equalsIgnoreCase("s");
        scanner.nextLine();

        double custoAdicional;

        if(ehTerceirizado) {
            System.out.print("Custo Adicional: ");
            custoAdicional = scanner.nextDouble();
            scanner.nextLine();

            return new Terceirizado(nome, horasTrabalhadas, valorPorHora, custoAdicional);
        }

        return new Empregado(nome, horasTrabalhadas, valorPorHora);
    }

    public static void exibirLista(List<Empregado> empregados) {
        // Para cada empregado em empregados
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println("#" + (i+1) + " : " + empregados.get(i));
        }
    }

    public static String pedirTextoParaBuscar() {
        System.out.println("Digite um texto para buscar: ");
        String textoParaBuscar = scanner.next();

        return textoParaBuscar;
    }

}
