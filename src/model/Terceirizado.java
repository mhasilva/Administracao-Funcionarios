package model;

public class Terceirizado extends Empregado{

    private Double horaAdicinal;


    public Terceirizado() {
    }

    public Terceirizado(String nome, Integer horas, Double valorPorHora, Double horaAdicinal) {
        super(nome, horas, valorPorHora);
        this.horaAdicinal = horaAdicinal;
    }

    @Override
    public Double pagamento(){
        Double valorPagamento = super.pagamento();
        return valorPagamento * horaAdicinal + valorPagamento;
    }

}

