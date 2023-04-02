public class Main {
    public static void main(String[] args) {
        VehileFactoryFactory factory = new VehileFactoryFactory();
        VehicleFactory vehicleFactory = factory.vehicleFactory("LuxuryVehicleFactory");
        vehicleFactory.getVehicle("LuxuryVehicle2").average();

    }
}