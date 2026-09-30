package ifdm_project;

public class Cidade {
    
    private int id;
    private String nome;
    private int codIbge;
    private Estado estado;

    public Cidade() {
    }

    public Cidade(int id, String nome, int codIbge, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.codIbge = codIbge;
        this.estado = estado;
    }

    public Cidade(String nome, int codIbge, Estado estado) {
        this.nome = nome;
        this.codIbge = codIbge;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(int codIbge) {
        this.codIbge = codIbge;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}

