import java.util.Scanner;
public class count {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch = s.toCharArray();
        int upper = 0;
        int lower = 0;
        int vowels = 0;
        int num = 0;
        int space=0;
        int other = 0;
        for (int i=0;i<s.length();i++) 
        {
            if (Character.isUpperCase(ch[i])) 
            {
                upper++;
            }
            else if (Character.isLowerCase(ch[i])) 
            {
                lower++;
            }
            else if (Character.isDigit(ch[i]))
            {
                num++;
            }
            else if (Character.isSpace(ch[i]))
            {
                space++;
            }
            else 
            {
                other++;
            }
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Space:" +space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
} 