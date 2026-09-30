package ifdm_project;

public class Info {
    private int id;
    private int ano;
    private int rankingEstado;
    private int rankingNacional;
    private double valor;
    private Cidade cidade;
    private Tipo tipo;

    public Info() {
    }

    public Info(int ano, int rankingEstado, int rankingNacional, double valor, Cidade cidade, Tipo tipo) {
        this.ano = ano;
        this.rankingEstado = rankingEstado;
        this.rankingNacional = rankingNacional;
        this.valor = valor;
        this.cidade = cidade;
        this.tipo = tipo;
    }

    public Info(int id, int ano, int rankingEstado, int rankingNacional, double valor, Cidade cidade, Tipo tipo) {
        this.id = id;
        this.ano = ano;
        this.rankingEstado = rankingEstado;
        this.rankingNacional = rankingNacional;
        this.valor = valor;
        this.cidade = cidade;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getRankingEstado() {
        return rankingEstado;
    }

    public void setRankingEstado(int rankingEstado) {
        this.rankingEstado = rankingEstado;
    }

    public int getRankingNacional() {
        return rankingNacional;
    }

    public void setRankingNacional(int rankingNacional) {
        this.rankingNacional = rankingNacional;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}