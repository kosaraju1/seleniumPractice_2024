package programs;

public class palindrome {
    public static void main(String[] args)
{
    String a= "abcdedcba";
    int i=0; int j=a.length()-1;
    while (i < j)
    {
        if(a.charAt(i) != a.charAt(j)) {
            System.out.println("not palindrome");
            break;
        }
            i = i + 1;
            j = j - 1;
        }
        System.out.println("is palindrome");
    }
}
