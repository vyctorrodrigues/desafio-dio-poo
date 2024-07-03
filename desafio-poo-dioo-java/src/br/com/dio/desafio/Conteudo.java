package br.com.dio.desafio;

public abstract class Conteudo {
    //atributo Constante = final
    //o static quer dizer que vou ter acesso ao atibuto mesmo fora da classe

    protected static final double XP_PADRAO = 10d;
    
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
