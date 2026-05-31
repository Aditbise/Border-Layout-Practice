
class Staff extends Person
{
    private String room;

    Staff()
    {
        super("(unknown name)", 0000);
        room = "(unknown room)";
    }

    Staff(String name, int yearOfBirth, String roomNumber)
    {
        super(name, yearOfBirth);
        room = roomNumber;
    }

    public void setRoom(String newRoom)
    {
        room = newRoom;
    }

    public String getRoom()
    {
        return room;
    }

    public String toString()    
    {
        return super.toString() +
               "Staff member\n" +
               "Room: " + room + "\n";
    }

}


