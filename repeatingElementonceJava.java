import java.util.*;
class repeatingElementonceJava
{
    public static void main(String ...args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int array[]={};
     array=new int[n];
     for(int index=0;index<n;index++)
     {
        array[index]=sc.nextInt();
     }
     int count=0;
     for(int i=0;i<n;i++)
     {
      for(int j=i+1;j<n;j++)
      {
         if(array[i]==array[j]){
            count++;
      
         } 
         
      }
      if(count==0)
      {
         System.out.print(array[i]+",")
      }
      else
      {
         count=0;
      }
      
   
     }


   }
}
