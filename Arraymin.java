import java.util.Scanner;

class Arraymin {

    public static void main(String ...g)
    {   
       
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int array[]=new int[n+1];
        int index;
        for(index=0;index<n;index++)
        {
            array[index]=s.nextInt();
        }
        int min=array[index];
        for(index=0;index<n;index++)
        {
            if(array[index]<min)
            {
                array[index]=min;
            }
        }
        System.out.println("min : "+min);

    }
    
}
