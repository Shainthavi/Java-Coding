public class addevenposition {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        if(i%2==0)
        {
            sum+=arr[i];
        }
        }
         System.out.print(sum);
    }
}
