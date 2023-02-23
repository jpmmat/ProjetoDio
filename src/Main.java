import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

        Curso curso1 = new Curso();
        curso1.setTitulo("Cuso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Cuso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(10);
        
        System.out.println(curso2);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());
        
        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("Descrição Mentoria JS");
        mentoria2.setData(LocalDate.now());
        
        System.out.println(mentoria2);





    }








}


