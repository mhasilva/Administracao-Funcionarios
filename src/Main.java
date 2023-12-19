import service.EmpregadoService;

public class Main {
    public static void main(String[] args) {


        EmpregadoService empregadoService = new EmpregadoService();
        System.out.println("Hello world!");

        empregadoService.adicionarFuncionario("Mario",
                10,
                100.0,
                'S');

    }


}