import java.util.*;

class Array_leftrotate {
    
    public static void main(String k[])
    {   
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]={};
        array=new int [n];
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        int limit=sc.nextInt();
        int temp[]={};
        temp=new int[n];
        int count=0;
        for(int i=limit;i<array.length;i++)
        {
            temp[count]=array[i];
            count++;
        }
        for(int i=0;i<limit;i++)
        {
            temp[count]=array[i];
            count++;

        }
        for(int i=0;i<n;i++)
        {
            array[i]=temp[i];
        }
        for(int i=0;i<n;i++)
        {
           System.out.print(array[i]+",");
        }
        
    }
    
}
