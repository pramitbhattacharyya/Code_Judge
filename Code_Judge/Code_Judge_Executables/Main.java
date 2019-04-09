import java.util.Scanner;
public class Main 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,k,t,x=0;
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            t=sc.nextInt();
            if(t%k==0)
                x++;
        }
        System.out.println(x);
    }
} 
