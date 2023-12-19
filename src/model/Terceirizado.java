package model;

public class Terceirizado extends Empregado{

    private Double despesaAdicional;


    public Terceirizado() {
    }

    public Terceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public Double pagamento(){
        Double pagamentoBase = super.pagamento();

        double bonus = despesaAdicional * 1.10;
        return bonus + pagamentoBase;

    }

}

