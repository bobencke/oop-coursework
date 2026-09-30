package ifdm_project;

public class Estado {
    
    private int id;
    private String nome;
    private String sigla;
    
    public Estado() {
    }

    public Estado(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    

    @Override
    public String toString() {
        return nome;
    }

}

