public class VehicleExample {

    public static void main(String[] args){
        Vehicle vehicle = new Bus();
        Bus bus = (Bus)vehicle;

        bus.run();
        bus.checkFare();
    }
}
