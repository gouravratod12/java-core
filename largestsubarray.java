import java.util.*;



class largestsubarray {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int sum=0;
        int min=0;
        for(int index=0;index<n;index++)
        {
            array[index]=sc.nextInt();
            sum+=array[index];
            min=array[0];
            if(min>=array[index])
            {
               min=array[index];
            }
            else{
                System.out.print(array[index]+" ");
            }

        }
        
        System.out.println(sum-min);
    }
    
}
