package service;

import model.Empregado;
import model.Terceirizado;

import java.util.ArrayList;
import java.util.List;

public class EmpregadoService {

  private String nomeEmpregado;
  private Integer horasTrabalhadas;

  private Double valorHorasTrabalhadas;

  private char indicadorTerceizado;

  List<EmpregadoService> empregadoService = new ArrayList<>();

  public EmpregadoService(){}


  public EmpregadoService(String nomeEmpregado,
                          Integer horasTrabalhadas,
                          Double valorHorasTrabalhadas,
                          char indicadorTerceizado) {
    this.nomeEmpregado = nomeEmpregado;
    this.horasTrabalhadas = horasTrabalhadas;
    this.valorHorasTrabalhadas = valorHorasTrabalhadas;
    this.indicadorTerceizado = indicadorTerceizado;
  }

  public void setNomeEmpregado(String nomeEmpregado) {
    this.nomeEmpregado = nomeEmpregado;
  }

  public Integer getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(Integer horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public Double getValorHorasTrabalhadas() {
    return valorHorasTrabalhadas;
  }

  public void setValorHorasTrabalhadas(Double valorHorasTrabalhadas) {
    this.valorHorasTrabalhadas = valorHorasTrabalhadas;
  }

  public char getIndicadorTerceizado() {
    return indicadorTerceizado;
  }

  public void setIndicadorTerceizado(char indicadorTerceizado) {
    this.indicadorTerceizado = indicadorTerceizado;
  }

  public void adicionarFuncionario(String nomeEmpregado, Integer horasTrabalhadas,
                                   Double valorHorasTrabalhadas, char indicadorTerceizado){

    if (indicadorTerceizado == 'N'){
      Empregado empregado = new Empregado(nomeEmpregado, horasTrabalhadas, valorHorasTrabalhadas);
      empregado.pagamento();
      System.out.println(empregado.pagamento());
  //    this.empregadoService.add();
    } else {
      Terceirizado terceiro = new Terceirizado(nomeEmpregado, horasTrabalhadas, valorHorasTrabalhadas);
      terceiro.pagamento();
      System.out.println(terceiro.pagamento());
    }

  }

}

