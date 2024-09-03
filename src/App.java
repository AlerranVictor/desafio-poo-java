import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp 1");
        bootcamp.setDescricao("Descrição bootcamp 1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("--");
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println(dev1.calcularTotalXp());

        System.out.println("--------");

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("--");
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println(dev2.calcularTotalXp());
    }
}
