package br.com.dio.desafio;



public class Curso extends Conteudo{
    //atributo

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return getTitulo() + getDescricao() + cargaHoraria;
    }
}
