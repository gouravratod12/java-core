import java.util.*;

class Arrayoddeven {
    public static void main(String k[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []array=new int[n];
        for(int index=0;index<n;index++)
        {
           array[index]=s.nextInt();

        }
        /*int ecount=0;
        int ocount=0;*/
        for(int index=0;index<n;index++)
        {
           if(array[index]%2==0)
           {
            System.out.print(+array[index]+" ");
           // ecount++;

           }
           /*else{
            ocount++;
           }*/
      
      }
    
    }
    
}
