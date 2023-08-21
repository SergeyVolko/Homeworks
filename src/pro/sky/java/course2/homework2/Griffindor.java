package pro.sky.java.course2.homework2;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magicPower, int transDist, int nobility, int honor, int bravery) {
        super(name, magicPower, transDist);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void descriptionStudent() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.getDescription())
                .append("Благородство: ").append(nobility).append(System.lineSeparator())
                .append("Честь: ").append(honor).append(System.lineSeparator())
                .append("Храбрость: ").append(bravery).append(System.lineSeparator());
        System.out.print(builder);
    }


    public void comparison(Griffindor dist) {
        int res = this.bravery + this.honor + this.nobility
                - dist.nobility - dist.honor - dist.bravery;
        super.compareStudent(res, this.getName(), dist.getName(),
                "Гриффиндорец", "Гриффиндорцы");
    }
}
