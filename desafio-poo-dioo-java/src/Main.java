import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" curso Java");
        curso1.setDescricao(" descrição curso Java");
        curso1.setCargaHoraria( 8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo(" curso Js");
        curso2.setDescricao(" descrição curso Js");
        curso2.setCargaHoraria( 4);
        

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVyctor = new Dev();
        devVyctor.setNome("Vyctor");
        devVyctor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos escritos: " + devVyctor.getConteudosInscritos());
        devVyctor.progredir();
        devVyctor.progredir();
        devVyctor.progredir();
        System.out.println("Conteudos escritos: " + devVyctor.getConteudosInscritos());
        System.out.println("================");
        System.out.println("Conteudos concluidos Vyctor: " + devVyctor.getConteudosConcluidos());
        System.out.println("Exp: " + devVyctor.calcularTotalXp());
        System.out.println("================");
        
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos escritos: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("================");
        System.out.println("Conteudos escritos: " + devPedro.getConteudosInscritos());
        System.out.println("================");
        System.out.println("Conteudos concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("Exp: " + devPedro.calcularTotalXp());
        System.out.println("================");

    }
}
