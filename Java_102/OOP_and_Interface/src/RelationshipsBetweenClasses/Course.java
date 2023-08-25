package RelationshipsBetweenClasses;

public class Course {
    private Insturctor Instructor; //
    private String courseName;
    private String code;



    public Course(String courseName, String code, Insturctor Instructor)
    {
        this.courseName = courseName;
        this.code = code;
        this.Instructor = Instructor;
    }

    public String getCourseName()
    {
        return this.courseName;
    }

    public void setCourseName()
    {
        this.courseName = courseName;
    }

    public String getCode()
    {
        return this.code;
    }

    public void setCode()
    {
        this.code = code;
    }

    public Insturctor getInstructor() {
        return Instructor;
    }

    public void setInstructor(Insturctor instructor) {
        Instructor = instructor;
    }

    //Course sınıfı Student sınıfını kullanıyorr Student sınıfına ait değerler kullanılıyor.
    // Course uses a Student. Denebilir. Course sınıfı Student sınıfına bağlı.
    public double calcAvarage(Student[] note)
    {
        double avg = 0;
        for (Student n : note)
        {
             avg += n.getNote();
        }
        return avg/ note.length;
    }

    public void printCourse()
    {
        System.out.println("Kurs name: " + courseName);
        System.out.println("Kurse kod: " + code);
    }
}
