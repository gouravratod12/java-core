import java.util.*;

class Array {
    public static void main(String k[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]={};
        s=new String[n];
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.nextLine();
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }

    }
    
}
