package pro.sky.java.course2.homework2;

public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, int magicPower, int transDist, int cunning,
                    int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transDist);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public void descriptionStudent() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.getDescription())
                .append("Хитрость: ").append(cunning).append(System.lineSeparator())
                .append("Решительность: ").append(determination).append(System.lineSeparator())
                .append("Амбициозность: ").append(ambition).append(System.lineSeparator())
                .append("Находчивость : ").append(resourcefulness).append(System.lineSeparator())
                .append("Жажда власти : ").append(lustForPower).append(System.lineSeparator());
        System.out.print(builder);
    }

    public void comparison(Slizerin dist) {
        int res = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower
                - dist.cunning - dist.determination - dist.ambition - dist.resourcefulness - dist.lustForPower;
        super.compareStudent(res, this.getName(), dist.getName(),
                "Слизеринец", "Слизеринцы");
    }
}
