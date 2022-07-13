import java.util.*;
class  Elementonceinarray
{
    public static void main(String ...args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int array[]={};
     array=new int[n];
     for(int index=0;index<array.length;index++)
     {
        array[index]=sc.nextInt();
     }
     int count=0;
     for(int i=0;i<n;i++)
     {
      for(int j=0;j<n;j++)
      {
         if(array[i]==array[j] && i!=j ){
            count++;

            }       
      
      } 
         if(count==0)
         {
            System.out.println(array[i]);
         }
         count=0;
        }
         
         
    }
      
   }



