public class VehileFactoryFactory {

    public VehicleFactory vehicleFactory(String factory) {
        switch (factory) {
            case "LuxuryVehicleFactory" :
                return new LuxuryVehicleFactory();
            case "OrdinaryVehicleFactory" :
                return new OrdinaryVehicleFactory();
            default:
                return null;
        }
    }
}
