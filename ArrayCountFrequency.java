import java.util.*;


class ArrayCountFrequency {
    public static void main(String m[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []array=new int[20];
    for(int index=0;index<n;index++)
    {
        array[index]=sc.nextInt();
    }
    int j,count=0;
    for(int index=0;index<n;index++)
    {
        for(j=0;j<n;j++)
        {
            if(array[index]==array[j] && index!=j)
            {  
                count++;
                array[j]=array[j+1];
                
            }
        }
        if(count==0 )
        {
            System.out.println(array[index]+"  "+count);
        }
        count=0;
    }
    
   }
}
