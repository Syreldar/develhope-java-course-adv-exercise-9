public class VehicleTester
{
    public static void main(String[] args)
    {
        Car car = new Car(4, 4, 25000.00);
        Boat boat = new Boat(45.0, 2000);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();

        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
