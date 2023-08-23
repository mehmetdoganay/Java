package Static_code_blocks;

public class User {
    public String name;
    public static  int counter;

    public User(String name)
    {
        this.name = name;
        counter++;
    }
}
