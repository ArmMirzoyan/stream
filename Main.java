import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Students john = new Students("Vardan P.", 20);
        Students sarah = new Students("Sara M.", 21);
        Students charles = new Students("Lusine B.", 22);
        Students mary = new Students("Lilith T.", 18);
        Students arman = new Students("Arman A.", 19);
        Students vazgen = new Students("Vazgen S.", 17);
        List<Students> students = Arrays.asList(john, sarah, charles, mary, arman, vazgen);

        List<Students> studentsWithAgeMoreThan18 = students
                .stream()
                .filter(s -> s.getAge() > 18)
                .collect(Collectors.toList());

        List<Students> charlesWithAgeMoreThan18 = students
                .stream()
                .filter(s -> s.getAge() > 18 && s.getName().startsWith("Charles"))
                .collect(Collectors.toList());

        List<Students> filtered = students
                .stream()
                .filter(s -> s.getName().length() > 4)
                .collect(Collectors.toList());

        List<Students> longnames = students.stream()
                .filter(s -> s.getName().length() > 8 && s.getName().length() < 11)
                .collect(Collectors.toList());

        String Students = students
                .stream().map(s -> s.getName().toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println("studentsWithAgeMoreThan18");
        studentsWithAgeMoreThan18.forEach(System.out::println);
        System.out.println("charlesWithAgeMoreThan18");
        charlesWithAgeMoreThan18.forEach(System.out::println);
        System.out.println("filtered");
        filtered.forEach(System.out::println);
        System.out.println("longnames");
        longnames.forEach(System.out::println);
    }
}
