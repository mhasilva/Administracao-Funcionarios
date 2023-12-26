package model;

public class Empregado {

    protected String nome;
    protected Integer hora;
    protected Double valorPorHora;

    public Empregado(){}

    public Empregado(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.hora = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return hora;
    }

    public void setHoras(Integer horas) {
        this.hora = horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }


    public Double pagamento(){
        return this.hora * this.valorPorHora;

    }

    @Override
    public String toString() {
        return "Contracao = 'Normal'"+
                ", nome='" + nome + "'" +
                ", hora=" + hora +
                ", valorPorHora=" + valorPorHora +
                ", pagamento=" + pagamento();
    }
}

