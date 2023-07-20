public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mehmet","0545 555 55 55","FZK");
        Teacher t2 = new Teacher("Mahmut","0545 555 55 56","TRH");
        Teacher t3 = new Teacher("Hasan","0545 555 55 57","MAT");

        Course tarih = new Course("Tarih","101","TRH");
        Course fizik = new Course("Fizik","101","FZK");
        Course mat = new Course("Matematik","101","MAT");
        tarih.addTeacher(t2);
        fizik.addTeacher(t1);
        mat.addTeacher(t3);

        Student s1 = new Student("Ali","556","4",tarih,fizik,mat);
        Student s2 = new Student("Kemal","442","4",tarih,fizik,mat);
        Student s3 = new Student("Mustafa","542","4",tarih,fizik,mat);
        Student s4 = new Student("Ayse","864","2",tarih,fizik,mat);
        s1.addBulkVerbalGrade(66,70,90);
        s1.addBulkExamNote(32,44,66);
        s1.calcAvarage();
        s2.addBulkVerbalGrade(66,60,90);
        s2.addBulkExamNote(44,63,77);
        s2.calcAvarage();
        s3.addBulkVerbalGrade(90,85,75);
        s3.addBulkExamNote(11,53,78);
        s3.calcAvarage();
        s4.addBulkVerbalGrade(70,80,65);
        s4.addBulkExamNote(66,44,22);
        s4.calcAvarage();
    }

}
