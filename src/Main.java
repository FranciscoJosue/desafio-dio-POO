import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Iniciando em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Iniciando em Python");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devJosue = new Dev();
        devJosue.setNome("Josue");
        devJosue.inscriverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Josue" + devJosue.getConteudosInscritos());
        devJosue.progredir();
        devJosue.progredir();
        devJosue.progredir();
        System.out.println("Conteudos inscritos Josue" + devJosue.getConteudosInscritos());
        System.out.println("Conteudos concluidos Josue" + devJosue.getConteudosConcluidos());
        System.out.println("XP; " + devJosue.calcularXP() );

        System.out.println("-------------------------------------------------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.inscriverBootcamp(bootcamp);
        devMaria.setNome(("Maria"));
        System.out.println("Conteudos inscritos Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("XP; " + devMaria.calcularXP() );
        System.out.println("Conteudos inscritos Josue" + devJosue.getConteudosInscritos());
        System.out.println("Conteudos concluidos Maria" + devMaria.getConteudosConcluidos());
        devMaria.progredir();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Conteudos concluidos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("XP; " + devMaria.calcularXP() );


    }
}