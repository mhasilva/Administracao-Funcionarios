import model.Empregado;
import model.Terceirizado;
import service.EmpregadoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Empregado> empregados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Valor p/ hora: ");
            double valorPorHora = scanner.nextDouble();
            System.out.print("Horas trabalhadas:");
            int horasTrabalhadas = scanner.nextInt();

            System.out.print("Eh terceirizado? (s/n): ");
            boolean ehTerceirizado = scanner.next().equalsIgnoreCase("s");
            double custoAdicional;

            if(ehTerceirizado) {
                System.out.print("Custo Adicional: ");
                custoAdicional = scanner.nextDouble();
                empregados.add(new Terceirizado(nome, horasTrabalhadas, valorPorHora, custoAdicional));
            } else {
                empregados.add(new Empregado(nome, horasTrabalhadas, valorPorHora));
            }

            System.out.println("-------------------");
        }

    }


}