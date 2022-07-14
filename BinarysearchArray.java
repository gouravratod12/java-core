import java.util.*;

class BinarysearchArray {
    public static void main(String d[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int index;
        for(index=0;index<n;index++)
        {
            array[index]=sc.nextInt();
        }
        int key=sc.nextInt();
    //I method of binary search
        int l=0;
        int u=n-1;
        while(l<u)
        {   
            int mid=((l+u)/2);
            if(array[mid]==key)
            {
                System.out.println(array[mid]+" index at " +(mid+1));
                break;
            }
            else if(array[mid]<key)
            {
                l=mid+1;
            }
            else if(array[mid]>key)
            {
                u=mid-1;
            }

        }
        //II  method long method for binary search....
        /*for(index=0;index<n;index++)
        {
            int mid=((index+n)/2);
            if(array[mid]==key)
            {
               System.out.println(array[mid]+" index at  "+(index+1));
            }
            else if(index<mid){
                     if(key==array[index])
                     {
                        System.out.println(array[index]+" index at  "+(index+1));
                     }
                       
            }
            else if(index>mid)
            {
                if(key==array[index])
                {
                   System.out.println(array[index]+" index at  "+(index+1));
                }
                else
                {
                       System.out.println("no found");
                }

            }*/
           
    
    
        }

    }
    

