public class Teacher {
    String name;
    String mqno;
    String branch;

    Teacher(String name,String mqno,String branch){
        this.name = name;
        this.mqno = mqno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Telefon numarası: " + this.mqno);
        System.out.println("Bölümü: " + this.branch);
    }
}
