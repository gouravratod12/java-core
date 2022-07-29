import java.util.*;




class givensumpairs {
    public static void main(String k[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int array[]=new int[n];
        for(int index=0;index<n;index++)
        {
            array[index]=sc.nextInt();

        }
        Arrays.sort(array);
        int givensum=sc.nextInt();
        int l=0,r=n-1;
        while(l<r)
        {
            if(array[l]+array[r]>givensum)
            {
                r--;
            }
            else if(array[l]+array[r]<givensum)
            {
                l++;
            }
            else 
            {
                if(array[l]+array[r]==givensum)
                {
                System.out.println("{"+array[l]+","+array[r]+"}");
                l++;
                }            
                else
                {
                System.out.println("not available");
                }
        }
        }

    }
    
}
