package pro.sky.java.course2.homework3;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
