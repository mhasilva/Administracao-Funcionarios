package service;

import menu.EmpregadoMenu;
import model.Empregado;
import model.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpregadoService {

  private List<Empregado> empregados = new ArrayList<>();

  // CRUD = 1. Read 2. Create 3. Delete 4. Update
  public void exibirTodos() {
    EmpregadoMenu.exibirLista(empregados);
  }

  public void cadastrar() {
    Empregado empregadoParaCadastrar = EmpregadoMenu.inserir();
    empregados.add(empregadoParaCadastrar);
  }

  public void buscarPeloNome() {
    String textoParaBuscar = EmpregadoMenu.pedirTextoParaBuscar();
    List<Empregado> encontradosNaBusca = new ArrayList<>();

    for(Empregado empregado : empregados) {
      if (empregado.getNome().contains(textoParaBuscar))
        encontradosNaBusca.add(empregado);
    }

    EmpregadoMenu.exibirLista(encontradosNaBusca);
  }

}

