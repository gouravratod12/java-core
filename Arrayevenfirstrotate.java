import java.util.*;


class Arrayevenfirstrotate {

   static void replace(int array[])
   {
      int temp;
      int number=array.length;
      for(int index=0;index<number;index++)
      {
         for(int j=index+1;j<number;j++)
         {
            if(index>=0 && j>=0 && array[index]%2==0 && array[j]%2!=0)
            {
                 temp=array[index];
                 array[index]=array[j];
                 array[j]=array[index];
                 //change sign
                 array[j]=-array[j];
                 break;
            }
            else if(index>=0 && j>=0 && array[index]%2!=0 && array[j]%2==0)
            {
               temp=array[index];
               array[index]=array[j];
               array[j]=array[index];
               //change sign
               array[j]=-array[j];
               break;
            }
         }

      }   
           for(int index=0;index<number;index++)
           {
              array[index]=Math.abs(array[index]);
              System.out.print(array[index]+" ");
           }

      
   }
public static void main(String k[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []array=new int[n];
    for(int index=0;index<n;index++)
    {
       array[index]=s.nextInt();

    }
    replace(array);
    /*IInd method 
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
   */
  }
}