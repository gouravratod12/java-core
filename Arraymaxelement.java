import java.util.Scanner;

class Arraymaxelement {
    
    public static void main(String g[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n+1];
        int index;
        for(index=0;index<n;index++)
        {
            array[index]=sc.nextInt();

        }
        int max=array[index];
        for(index=0;index<n;index++)
        {
            if(array[index]>=max)
            {
                max=array[index];
            }

        }
        System.out.println("max in array :" +max);

    }
    
}
