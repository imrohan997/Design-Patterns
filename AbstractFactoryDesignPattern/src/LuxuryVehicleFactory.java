public class LuxuryVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicle) {
        switch (vehicle) {
            case "LuxuryVehicle1":
                return new LuxuryVehicle1();
            case "LuxuryVehicle2":
                return new LuxuryVehicle2();
            default:
                return null;
        }
    }
}
