import java.util.*;

class Arrayevenfirstrotate {
public static void main(String k[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []array=new int[n];
    for(int index=0;index<n;index++)
    {
       array[index]=s.nextInt();

    }
    int count=0;
    int last=0;
    for(int index=0;index<n;index++)
    {
       
        
       if(array[index]%2==0)
       {              
         array[count]=array[index];

         count++;

       }
       else
       {  
           last=index;
          array[n-index-1]=array[last];
          
       }
       
       
       
    }
    for(int index=0;index<n;index++)
    {
       System.out.print(array[index]+" ");

    }
   
  }
}