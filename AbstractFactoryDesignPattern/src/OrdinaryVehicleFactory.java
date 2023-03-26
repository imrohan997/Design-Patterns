public class OrdinaryVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicle) {
        switch (vehicle) {
            case "OrdinaryVehicle1":
                return new OrdinaryVehicle1();
            case "OrdinaryVehicle2":
                return new OrdinaryVehicle2();
            default:
                return null;
        }
    }
}
