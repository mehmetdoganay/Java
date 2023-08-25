package RelationshipsBetweenClasses;

import java.security.cert.CertPath;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Mehmet","Doğanay","001","Tekirdağ",90);
        Student st2 = new Student("Elif","Asd","002","Eskişehir",-75);
        Student st3 = new Student("Ahmet","bsga","003","New York",123);

        Insturctor teacher1 = new Insturctor("Polat","Alemdar","Edebiyat");

        Course mat = new Course("Matematik","MAT",teacher1);

        // Course has a Intructor (Sınıfın bir Öğretmeni vardır.)
        // Composition
        System.out.println(mat.getInstructor().getName());
        System.out.println(mat.getInstructor().getSurname());
        System.out.println(mat.getInstructor().getDepartment());

        //Student[] stu = {st1,st2,st3};
        //System.out.println("Ortalama: " + mat.calcAvarage(stu));

        //st1.setNote(st1.getNote());
        //st2.setNote(st2.getNote());
        //st3.setNote(st3.getNote());
        //st1.print();
        //st2.print();
        //st3.print();

    }
}
