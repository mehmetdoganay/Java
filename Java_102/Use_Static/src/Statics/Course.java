package Statics;

public class Course {
    public  String name;
    public  String code;
    public  int note;

    public Course(String name, String code, int note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void calcAvarage(double[] notes)
    {
        int total = 0;
        for (double n : notes)
        {
            total += n;
        }
        double avarage = total / notes.length;
        System.out.println(avarage);
    }
}
