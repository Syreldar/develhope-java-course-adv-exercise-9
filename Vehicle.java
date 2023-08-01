public abstract class Vehicle
{
    protected String type;
    protected int numberOfWheels;

    public void showVehicleDetails()
    {
        System.out.printf("Type: %s, Number of Wheels: %d\n", type, numberOfWheels);
    }

    public abstract void doVehicleSound();
}
