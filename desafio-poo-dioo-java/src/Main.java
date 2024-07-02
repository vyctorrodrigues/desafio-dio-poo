import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" curso Java");
        curso1.setDescricao(" descrição curso Java");
        curso1.setCargaHoraria( 8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo(" curso Js");
        curso2.setDescricao(" descrição curso Js");
        curso2.setCargaHoraria( 4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
