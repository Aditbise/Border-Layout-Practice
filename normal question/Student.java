
class Student extends Person
{
    private String SID;    

    public Student()
    {
        super("(unknown name)", 0000);
        SID = "(unknown ID)";
    }

    public Student(String name, int yearOfBirth, String studentID)
    {
        super(name, yearOfBirth);
        SID = studentID;
    }

    public String getStudentID()
    {
        return SID;
    }

    public String toString()    
    {
        return super.toString() +
               "Student\n" +
               "Student ID: " + SID + "\n";
    }
}


