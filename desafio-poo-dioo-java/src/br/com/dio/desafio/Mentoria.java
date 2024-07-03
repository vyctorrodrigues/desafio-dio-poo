package br.com.dio.desafio;

import java.time.LocalDate;
//tudo que tem em conteudo tem em mentoria mas nem tudo que tem em mentoria tem em conteudo
public class Mentoria extends Conteudo {
    //atributo
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }  
}
