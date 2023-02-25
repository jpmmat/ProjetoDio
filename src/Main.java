import desafioDio.dominio.Bootcamp;
import desafioDio.dominio.Curso;
import desafioDio.dominio.Dev;
import desafioDio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
       // System.out.println("Hello, World!");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        
      

        Curso curso2 = new Curso();
        curso2.setTitulo("Cuso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(10);
        
        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("Descrição Mentoria JS");
        mentoria2.setData(LocalDate.now());
        System.out.println(mentoria2);
        */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudoConcluidos());
        System.out.println("XP de João é: " + devJoao.calcularTotalXp());
        System.out.println("----------------");
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudoInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudoConcluidos());
        System.out.println("XP de Camila é: " + devCamila.calcularTotalXp());

    }








}


