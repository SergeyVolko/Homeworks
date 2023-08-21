package pro.sky.java.course2.homework2;

public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String name, int magicPower, int transDist, int mind, int wisdom,
                     int wit, int creation) {
        super(name, magicPower, transDist);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public void descriptionStudent() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.getDescription())
                .append("Ум: ").append(mind).append(System.lineSeparator())
                .append("Мудрость: ").append(wisdom).append(System.lineSeparator())
                .append("Остроумие: ").append(wit).append(System.lineSeparator())
                .append("Творчество: ").append(creation).append(System.lineSeparator());
        System.out.print(builder);
    }

    public void comparison(Kogtevran dist) {
        int res = this.mind + this.wisdom + this.wit + this.creation
                - dist.mind - dist.wisdom - dist.wit - dist.creation;
        super.compareStudent(res, this.getName(), dist.getName(),
                "Когтевранец", "Когтевранцы");
    }
}
