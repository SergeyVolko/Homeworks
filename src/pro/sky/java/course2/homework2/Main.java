package pro.sky.java.course2.homework2;

public class Main {
    public static void main(String[] args) {
        Griffindor harry =
                new Griffindor("Гарри Потер", 10, 12, 4, 3, 0);
        Griffindor hermiona =
                new Griffindor("Гермиона Греинджер", 8, 10, 6, 4, 1);
        Griffindor ron =
                new Griffindor("Рон Уизли", 14, 13, 7, 8, 7);
        harry.comparison(hermiona);
        harry.comparison(ron);
        hermiona.comparison(ron);
        harry.descriptionStudent();
        Slizerin darko = new Slizerin("Дарко Малфой", 1, 3, 6, 8, 7,
                        12, 8);
        Slizerin grehem = new Slizerin("Грэхэм Монтегю", 4, 7, 2, 9,
                3, 5, 2);
        Slizerin gregory = new Slizerin("Грегори Гойл", 6, 11, 8, 6,
                7, 8, 5);
        darko.comparison(grehem);
        grehem.comparison(darko);
        Pufenduy zaharia = new Pufenduy("Захария Смит", 22, 12, 1,
                3, 7);
        Pufenduy sedric = new Pufenduy("Седрик Диггори", 10, 17, 5,
                8, 2);
        Pufenduy jastin = new Pufenduy("Джастин Финч-Флетчли", 5, 34, 2,
                2, 1);
        jastin.comparison(sedric);
        sedric.comparison(jastin);
        Kogtevran chjou =
                new Kogtevran("Чжоу Чанг", 23, 5, 9, 3, 7, 9);
        Kogtevran padma =
                new Kogtevran("Падма Патил", 11, 12, 10, 0, 6, 8);
        Kogtevran marcus =
                new Kogtevran("Маркус Белби", 11, 12, 10, 0, 6, 8);
        marcus.comparison(padma);

        Hogwarts[] hogwarts = {
          harry,
          hermiona,
          ron,
          darko,
          grehem,
          gregory,
          zaharia,
          sedric,
          jastin,
          chjou,
          padma,
          marcus
        };
        hogwarts[0].comparisonAll(hogwarts[8]);
        System.out.println("===============================");
        for (Hogwarts hogwart : hogwarts) {
            hogwart.descriptionStudent();
            System.out.println("===============================");
        }
    }
}
