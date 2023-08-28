package pro.sky.java.course2.homework3;

public abstract class Transport implements ServiceAction {
    private  String modelName;
    private  int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Двигателя нет");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Прицепа нет");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
