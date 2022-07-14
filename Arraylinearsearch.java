import java.util.*;

class Arraylinearsearch {
    
   
    public static void main(String k[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []array=new int[n];
    for(int index=0;index<n;index++)
    {
       array[index]=s.nextInt();

    }
    int key=s.nextInt();

    
    for(int index=0;index<n;index++)
    {
       if(key==array[index])
       {
          System.out.println(key+"  index at  " +(index+1));
       }
        
    }   
    
   
   
  }
    
}
