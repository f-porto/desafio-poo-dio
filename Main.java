import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var course1 = new Course("curso java", "descrição curso java", 8);
        var course2 = new Course("curso js", "descrição curso js", 4);
        var mentorship = new Mentorship("mentoria de java", "descrição mentoria java", LocalDate.now());

        var bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer", LocalDate.now());
        bootcamp.contents().add(course1);
        bootcamp.contents().add(course2);
        bootcamp.contents().add(mentorship);

        Dev devCamila = new Dev("Camila");
        devCamila.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.subscribedContents());
        devCamila.progress();
        devCamila.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.subscribedContents());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.finishedContents());
        System.out.println("XP:" + devCamila.computeXP());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.subscribedContents());
        devJoao.progress();
        devJoao.progress();
        devJoao.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.subscribedContents());
        System.out.println("Conteúdos Concluidos João:" + devJoao.finishedContents());
        System.out.println("XP:" + devJoao.computeXP());
    }
}
