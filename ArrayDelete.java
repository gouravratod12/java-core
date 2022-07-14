import java.util.*;

class ArrayDelete {
    public static void main(String k[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []array=new int[n+1];
        for(int index=0;index<n;index++)
        {
           array[index]=s.nextInt();

        }
        int pos=s.nextInt();
        pos=pos-1;
        for(int index=pos;index<n;index++)
        {
           
                 array[index]=array[index+1];
            
           
      
        }
        for(int index=0;index<n;index++)
        {
           System.out.print(array[index]+" ");

        }
    
    }
    
}
