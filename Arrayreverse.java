import java.util.*;

class Arrayreverse {
    public static void main(String k[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []array=new int[n];
    for(int index=0;index<n;index++)
    {
       array[index]=s.nextInt();

    }
    int temp=0;
    for(int index=0;index<n/2;index++)
    {
       temp=array[n-index-1];
       array[n-index-1]=array[index];
       array[index]=temp;
       
    }
    for(int index=0;index<n;index++)
    {
       System.out.print(array[index]+" ");

    }
   
  }

    
}
