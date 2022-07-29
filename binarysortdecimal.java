import java.util.*;

class binarysortdecimal {
   
   static void print(int decimal,int n)
   {
       int binary[]=new int[100];
       int k=0;
    for(int index=0;index<n;index++)
    {
         while(decimal!=0)
         {
           binary[k++]=decimal%2;
           decimal=decimal/2;
           k++;
           System.out.print(binary[index]+" ");
           System.out.println();
         
         
       }
     
    }
  

    
    public static void main(String o[])
    {
  
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int array[]=new int[n];
           for(int index=0;index<n;index++)
           {
               array[index]=sc.nextInt();
               int decimal=array[index];
               print(decimal,n);
           }

        
         
     
     } 
  
}