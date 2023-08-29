package Inheritance;

public class Worker {
        private String name;
        private String surname;
        private String email;
        private String phoneNumber;



    public Worker(String name, String surname, String email, String phoneNumber)
        {
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getName()
        {
            return this.name;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        public String getSurname()
        {
            return this.surname;
        }

        public void setSurname(String surname)
        {
            this.surname = surname;
        }

        public String getEmail()
        {
            return this.email;
        }

        public void setEmail()
        {
            this.email = email;
        }
        public String getPhoneNumber()
        {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void giris()
        {
            System.out.println(this.name + " " + this.surname + " Üniversiteye Giriş Yaptı.");
        }

        public void cikis()
        {
            System.out.println(this.name + " " + this.surname + " Üniversiteden çıkış Yaptı.");
        }

        public void yemekhane()
        {
            System.out.println(this.name + " " + this.surname + " Yemekhaneye Giriş yaptı.");
        }

    public void print()
    {
        System.out.println(this.getName()  + " " + this.getSurname());
        System.out.println("Mail " + this.getEmail());
        System.out.println("Telefon: " + this.getPhoneNumber());
        System.out.println();
    }

    public static void girisYapanlar(Worker[] loginUser)
    {
        for (Worker w: loginUser)
        {
            w.giris();
        }
    }
}
