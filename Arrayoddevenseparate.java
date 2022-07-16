import java.util.*;

class Arrayoddevenseparate {
    public static void main(String k[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []array=new int[n];
        int []even=new int[n];
        int []odd=new int[n];
        for(int index=0;index<n;index++)
        {
           array[index]=s.nextInt();

        }
        int ecount=0;
        int ocount=0;
        for(int index=0;index<n;index++)
        {
           if(array[index]%2==0)
           {
              even[ecount]=array[index];
             ecount++;

           }
           else{
            odd[ocount]=array[index];
            ocount++;
           }
      
      }
      for(int index=0;index<ecount;index++)
      {
        System.out.print(even[index]+" ");
        
      }
      for(int index=0;index<ocount;index++)
      {
        System.out.print(odd[index]+" ");
        
      }

    
    }
    
}
