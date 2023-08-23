public class Main {
    public static void main(String[] args) {
       Course mat = new Course("Matematik","01",77);
       Course fizik = new Course("Fizik","02",52);
       Course kimya = new Course("kimya","03",83);

       double[] avarage = {mat.note, fizik.note, kimya.note};
       Course.calcAvarage(avarage);
    }
}
