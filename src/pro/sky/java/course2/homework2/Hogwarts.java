package pro.sky.java.course2.homework2;

public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transDist;


    public Hogwarts(String name, int magicPower, int transDist) {
        this.name = name;
        this.magicPower = magicPower;
        this.transDist = transDist;
    }

    public abstract void descriptionStudent();

    public String getName() {
        return name;
    }

    public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Имя: ").append(name).append(System.lineSeparator())
                .append("Магическая сила: ").append(magicPower).append(System.lineSeparator())
                .append("Трансгрессирность: ").append(transDist).append(System.lineSeparator());
        return description.toString();
    }

    public void comparisonAll(Hogwarts dist) {
        String templateMagic = "%s обладает большей мощностью магии чем %s%n";
        String templateTrans = "%s обладает большей дистанцией трансгресии чем %s%n";
        String equalMagic = "%s и %s обладают одинаковой магической мощью%n";
        String equalTrans = "%s и %s обладают одинаковой дистанцией трансгресии%n";
        if (this.magicPower > dist.magicPower) {
            System.out.printf(templateMagic, this.name, dist.name);
        } else if (this.magicPower == dist.magicPower) {
            System.out.printf(equalMagic, this.name, dist.name);
        } else {
            System.out.printf(templateMagic, dist.name, this.name);
        }

        if (this.transDist > dist.transDist) {
            System.out.printf(templateTrans, this.name, dist.name);
        } else if (this.transDist == dist.transDist) {
            System.out.printf(equalTrans, this.name, dist.name);
        } else {
            System.out.printf(templateTrans, dist.name, this.name);
        }
    }

    public void compareStudent(int res, String firstName, String secondName,
                               String nameFaculty, String nameManyFaculty) {
        if (res > 0) {
            System.out.printf("%s лучший %s, чем %s%n", firstName, nameFaculty, secondName);
        } else if (res == 0) {
            System.out.printf("%s и %s одинаковые по силе %s%n", firstName, secondName, nameManyFaculty);
        } else {
            System.out.printf("%s лучший %s, чем %s%n", secondName, nameFaculty, firstName);
        }
    }
}
