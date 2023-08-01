public class Car extends Vehicle
{
    private final int numberOfDoors;
    private final double carPrice;

    public Car(int wheels, int doors, double price)
    {
        this.type = "Car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    @Override
    public void showVehicleDetails()
    {
        super.showVehicleDetails();
        System.out.printf("Number of Doors: %d, Price; %.2f\n", numberOfDoors, carPrice);
    }

    @Override
    public void doVehicleSound()
    {
        System.out.println("Vroom, vroom!");
    }
}
