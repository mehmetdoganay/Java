import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int kilo;
            double boy, indeks;

            System.out.printf("Lütfen boyunuzu giriniz (m): ");
            boy = input.nextDouble();

            System.out.printf("Lütfen kilonuzu giriniz (kg): ");
            kilo = input.nextInt();

            indeks = kilo/(boy*boy);

            System.out.printf("İndeksiniz: " + indeks);

            if(indeks < 18.4)
            {
                System.out.printf("Zayıf. Kişinin boyuna oranla ağırlığının yetersiz olduğunu ifade eden bu değer ile karşılaşılması durumunda kişinin diyetisyen eşliğinde sağlıklı bir şekilde kilo alması önerilir.");
            }
            else if (indeks >18.5 && indeks < 24.9) {
                System.out.printf("Normal. Bu değer aralığı kişinin ideal kiloda olduğunu gösterir. Bu değere sahip olan kişilerin düzenli, dengeli ve sağlıklı beslenmeye devam etmeleri önerilir.");
            }
            else if (indeks >25 && indeks < 29.9) {
                System.out.printf("Fazla Kilolu. Kişinin boyuna oranla kilosunun fazla olduğunu gösteren bu değer aralığında kişinin uygun diyet ile fazla kilolarından kurtulması önerilir.");
            }
            else if (indeks >30 && indeks < 34.9) {
                System.out.printf("Şişman. Birinci derece obez kategorisinde değerlendiren değer aralığında, kişinin kilosunun sağlık açısından risk oluşturabilecek düzeyde olduğu anlaşılır. Bu kişilerin diyetisyen yardımıyla kilo vermesi önerilir.");
            }
            else if (indeks >35 && indeks < 44.9) {
                System.out.printf("Şişman. İkinci derece obez olarak tanımlanan bu değerlere sahip olan kişilerde kalp ve damar hastalıkları bakımından risk artar. Kişinin kilo vermek için diyetisyene başvurması önerilir.");
            }
            else {
                System.out.printf("Aşırı Şişman. Üçüncü derece obez kategorisinde olan bu kişilerde hastalık gelişme riski çok yüksektir. Hekim ve diyetisyen eşliğinde kilo verilmesi önerilir.");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.printf("Lütfen sayısal bir değer giriniz.");
        }



    }
}
