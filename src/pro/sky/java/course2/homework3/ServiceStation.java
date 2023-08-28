package pro.sky.java.course2.homework3;

public class ServiceStation {

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public void check(Car car) {
        check((Bicycle) car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        check((Car) truck);
        truck.checkTrailer();
    }
}
