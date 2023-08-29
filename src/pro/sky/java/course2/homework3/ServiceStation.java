package pro.sky.java.course2.homework3;

public class ServiceStation {

    public void check(Bicycle bicycle) {
        checkWheels(bicycle);
    }

    public void check(Car car) {
        checkWheels(car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        check((Car) truck);
        truck.checkTrailer();
    }

    private void checkWheels(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}
