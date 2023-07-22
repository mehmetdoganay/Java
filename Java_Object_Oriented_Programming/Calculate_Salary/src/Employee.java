import java.util.Locale;
import java.time.LocalDate;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary,int workHours,int hireYear)
    {
        this.name = name;
        this.salary = salary; // maaş
        this.workHours = workHours; // haftalık çalışma saati
        this.hireYear = hireYear; // girdiği yıl
    }

    public int tax(int salary)
    {
        int salaryTax = (this.salary/100)*3;
        if(this.salary >= 1000)
        {
            return salaryTax;
        }
        else
            return 0;

    }

    public int bonus(int bonus)
    {
        if(this.workHours > 40)
        {
            bonus = this.workHours - 40;
            return bonus * 30;
        }
        else
        {
            return  0;
        }
    }
    LocalDate date = LocalDate.now();
    int  year = date.getYear();
    public int raiseSalary(int salary)
    {
        LocalDate date = LocalDate.now();
        int  year = date.getYear();
        int raise  ;

        if(year-this.hireYear < 10)
        {
            raise = (this.salary / 100)*5;
            return raise ;
        }
        else if (year-this.hireYear > 9 && year-this.hireYear < 20 )
        {
            raise =(this.salary / 100)*10;
            return raise ;
        }
        else
        {
            raise = (this.salary / 100)*15;
            return raise ;
        }
    }

    void print()
    {
        System.out.println("*********************************");
        System.out.println();
        System.out.println("Adı: \t" + this.name );
        System.out.println("Maaşı: \t" + this.salary);
        System.out.println("Çalışma Saati: \t" + this.workHours);
        System.out.println("Başlangıç Yılı: \t" + this.hireYear);
        System.out.println("Vergi: \t" + tax(salary) + " ₺");
        System.out.println("Bonus: \t" + bonus(workHours) + " ₺");
        System.out.println("Maaş Artışı: \t" + raiseSalary(salary) + " ₺");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: \t" + ((this.salary-tax(salary)) + bonus(workHours)) + " ₺");
        System.out.println("Toplam Maaş: \t" + (this.salary + raiseSalary(salary) + bonus(workHours)));
        System.out.println("*********************************");
    }
}
