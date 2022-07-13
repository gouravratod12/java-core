import java.util.*;

class Array_reversalalgoritham {
    

       static  void arrayrotate(int array[],int d)
       {
        int n=array.length;
        if(d==0)
        return;
            d=d%n;
            reverse(0,d-1,array);
            reverse(d,n-1,array);
            reverse(0,n-1,array);
       }
      static void reverse(int start,int end,int array[])
       {
         int temp;
         
         
            while(start<end)
            {
                temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;


            }
        
       }

    public static void main(String g[])
    {  
       //Array_reversalalgoritham r=new Array_reversalalgoritham();
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int array[]=new int [n];
       for(int index=0;index<n;index++)
       {
          array[index]=sc.nextInt();

       }
       int d=sc.nextInt();
       arrayrotate(array,d);
       for(int index=0;index<n;index++)
       {
         System.out.print(array[index]+",");
       }

    }
}
   
   