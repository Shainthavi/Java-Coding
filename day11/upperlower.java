import java.util.*;
public class upperlower {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
            {
                System.out.print(Character.toUpperCase(c[i]));
            }
            else
            {
                System.out.print(Character.toLowerCase(c[i]));
            }
        }
    }
}
