public class Student {
    String name;
    String stNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    Student(String name, String stNo,String classes, Course c1, Course c2, Course c3)
    {
        this.name = name;
        this.stNo = stNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

     void calcAvarage()
    {
        this.avarage = ((this.c1.note + this.c2.note + this.c3.note)/3.0) * 0.8 + ((this.c1.verbalGrade + this.c2.verbalGrade + this.c3.verbalGrade)/3.0) * 0.2;
        if(this.avarage >= 55)
        {
            System.out.println();
            System.out.println("---------- Ögrenci Geçti----------");
            this.isPass = true;
        }
        else
        {
            System.out.println();
            System.out.println("---------- Ögrenci Kaldı----------");
            this.isPass = false;
        }
        printNote();
    }

    void addBulkVerbalGrade(int verbalGradeC1 ,int verbalGradeC2, int verbalGradeC3)
    {
        if(verbalGradeC1 >= 0 && verbalGradeC1 <= 100)
        {
            c1.verbalGrade = verbalGradeC1;
        }
        else
        {
            System.out.println("Sözlü Notu aralığı doğru değil");
        }
        if(verbalGradeC2 >= 0 && verbalGradeC2 <= 100)
        {
            c2.verbalGrade = verbalGradeC2;
        }
        else
        {
            System.out.println("Sözlü Notu aralığı doğru değil");
        }
        if(verbalGradeC3 >= 0 && verbalGradeC3 <= 100)
        {
            c3.verbalGrade = verbalGradeC3;
        }
        else
        {
            System.out.println("Sözlü Notu aralığı doğru değil");
        }
    }
    void addBulkExamNote(int note1, int note2, int note3 )
    {
        if(note1 >= 0 && note1 <= 100 )
        {
            c1.note = note1;
        }
        else {
            System.out.println("Not aralığı doğru değil");
        }
        if(note2 >= 0 && note2 <= 100 )
        {
            c2.note = note2;
        }
        else {
            System.out.println("Not aralığı doğru değil");
        }
        if( note3 >= 0 && note3 <= 100)
        {
            c3.note = note3;
        }
        else {
            System.out.println("Not aralığı doğru değil");
        }
    }

    void printNote()
    {

        System.out.println("  -------- "+"Ögrenci "+ this.name+" --------");
        System.out.println("    ------ "+"Ders "+ this.c1.name+" ------");
        System.out.println(" Sınav Notu:  " + this.c1.note + "\t Sözlü Notu:  " + this.c1.verbalGrade );
        System.out.println();
        System.out.println("    ------ "+"Ders "+ this.c2.name+" ------");
        System.out.println(" Sınav Notu:  " + this.c2.note + "\t Sözlü Notu:  " + this.c2.verbalGrade );
        System.out.println();
        System.out.println("    ------ "+"Ders "+ this.c3.name+" ------");
        System.out.println(" Sınav Notu:  " + this.c3.note + "\t Sözlü Notu:  " + this.c3.verbalGrade );
        System.out.println("Ortalama: " + this.avarage);
        System.out.println();
        System.out.println("***************************************");
    }


}
