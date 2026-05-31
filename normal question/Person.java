

abstract class Person
{
    private String name;
    private int yearOfBirth;
    private Address address;

    Person(String name, int yearOfBirth)
    {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void setYearOfBirth(int newYearOfBirth)
    {
        yearOfBirth = newYearOfBirth;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    public void setAddress(String street, String town, String postCode)
    {
        address = new Address(street, town, postCode);
    }

    public Address getAddress()
    {
        return address;
    }

    public String toString()    
    {
        return "Name: " + name + "\n" +
               "Year of birth: " + yearOfBirth + "\n";
    }
}


