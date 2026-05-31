
public class Car
{
    private int numberOfFrontSeats;
    private int numberOfBackSeats;

    public Car(int frontSeats, int backSeats)
    {
        numberOfFrontSeats = frontSeats;
        numberOfBackSeats = backSeats;
    }

    public int seats()
    {
        int totalSeats;

        totalSeats = numberOfFrontSeats;
        totalSeats += numberOfBackSeats;

        return totalSeats;
    }
}


