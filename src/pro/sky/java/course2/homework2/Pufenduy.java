package pro.sky.java.course2.homework2;

public class Pufenduy extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Pufenduy(String name, int magicPower, int transDist, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transDist);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void descriptionStudent() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.getDescription())
                .append("Трудолюбивость: ").append(industriousness).append(System.lineSeparator())
                .append("Верность: ").append(loyalty).append(System.lineSeparator())
                .append("Честность: ").append(honesty).append(System.lineSeparator());
        System.out.print(builder);
    }

    public void comparison(Pufenduy dist) {
        int res = this.industriousness + this.loyalty + this.honesty
                - dist.industriousness - dist.loyalty - dist.honesty;
        super.compareStudent(res, this.getName(), dist.getName(),
                "Пуфендуец", "Пуфендуйцы");
    }
}
