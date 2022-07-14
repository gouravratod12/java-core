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
    int number,count=0;
    number=sc.nextInt();
    for(int index=0;index<n;index++)
    {
        if(number==array[index])
        {
            count++;
        }
        
       
    }
    System.out.println(number+"="+count);
    
   }
}
