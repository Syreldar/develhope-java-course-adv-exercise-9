public class Boat extends Vehicle
{
    private final double maxKnotsSpeed;
    private final int boatKilosWeight;

    public Boat(double maxSpeed, int weight)
    {
        this.type = "Boat";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    @Override
    public void doVehicleSound()
    {
        System.out.println("Whoo, whoo! (Don't know what sound a boat is supposed to make)");
    }

    public String getBoatWeightAndSpeed()
    {
        return String.format("Boat weight: %d kg, Maximum speed: %.2f knots", boatKilosWeight, maxKnotsSpeed);
    }
}
