import java.util.*;

class Array_righrotate {
 
    public static void main(String ...k)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]={};
        array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        } 
        int count=0;
         int limit=sc.nextInt();
         limit=n-limit;
         int temp[]={};
         temp=new int[n];
         for(int i=limit;i<n;i++)
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
            System.out.print(array[i]+ ",");
         }



    }

}
