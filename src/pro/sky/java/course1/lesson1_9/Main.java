package pro.sky.java.course1.lesson1_9;

public class Main {
    public static void main(String[] args) {
        Author dostoevskyFedor = new Author("Федор", "Достоевский");
        Author tolstoyAlexey = new Author("Толстой", "Алексей");
        Book demons = new Book("Бесы", dostoevskyFedor, 1854);
        Book petr = new Book("Петр первый", tolstoyAlexey, 1904);
        petr.setYear(1913);
    }
}
