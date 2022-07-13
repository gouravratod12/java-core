import java.util.*;

class Arrayinsertion {
    public static void main(String k[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];
        for(int index=0;index<n;index++)
        {
            array[index]=sc.nextInt();

        }
        int position=sc.nextInt();
        position=position-1;
        int key=sc.nextInt();
        for(int index=0;index<n;index++)
        {
            if(index==position)
            {
                array[index]=key;
            }

        }
        for(int index=0;index<n;index++)
        {
            System.out.print(array[index]+" ");

        }
    }
    
}
