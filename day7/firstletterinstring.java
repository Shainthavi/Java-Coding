import java.util.Scanner;
public class firstletterinstring {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        String[] words=str.split(" ");
        for(String word: words)
        {
            System.out.print(word.charAt(0)+" ");
        }
    }
}
