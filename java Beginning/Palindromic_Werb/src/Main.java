public class Main {
    static void isPalindrome1(String str)
    {
        StringBuilder rev = new StringBuilder();

        for(int i = str.length() - 1 ; i >= 0; i--)
        {
            rev.append(str.charAt(i));
        }
        if(rev.toString().equals(str))
        {
            System.out.println("Palindromic.");
        }else {
            System.out.println("Not Palindromic");
        }
    }

    static void isPalindrome2(String str)
    {
        boolean isEqual = true;

        for(int i = 0; i < str.length() ; i++)
        {
                int j = str.length() -i -1;
                if(str.charAt(j) != str.charAt(i))
                {
                    isEqual = false;
                    break;
                }
        }
        if(isEqual)
        {
            System.out.println("Palindromic.");
        }
        else {
            System.out.println("Not Palindromic");
        }
    }
    public static void main(String[] args) {
        String value1 = "kavak";
        isPalindrome1(value1);
        String value2 = "aasaa";
        isPalindrome2(value2);
    }
}
