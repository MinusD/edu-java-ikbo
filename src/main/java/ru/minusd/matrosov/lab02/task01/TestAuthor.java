package lab02.task01;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Artur", "Artur@mail.ru", 'M');
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        a.setEmail("AA@mail.ru");
        System.out.println(a.getGender());
        System.out.println(a.toString());

    }
}
