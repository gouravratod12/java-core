import java.util.Scanner;

class Arrayinsertionsort {

    static void insertionsort(int array[])
    {
        int temp,j;
        int number=array.length;
        for(int index=1;index<number;index++)
        {
            temp=array[index];
            for( j=index-1;j>=0;j--)
            {
                  if(array[j]<=temp)
                  {
                    array[j+1]=array[j];
                  }
                  

            }
            array[j+1]=temp;
            for(int p=0;p<number;p++)
           {
            System.out.print(array[p]+" ");
            }
         System.out.println("\n");
        }
        
     

    }

    public static void main(String k[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int []array=new int[number];
        for(int index=0;index<number;index++)
        {
            array[index]=sc.nextInt();
        }
        insertionsort(array);
      /*  for(int index=0;index<number;index++)
        {
            System.out.print(array[index]+" ");
        }*/

    }
    
}
