import java.util.*;

class BinarysearchArray {
    int binarysearch(int array[],int lower,int upper,int key)
    {
       int mid=((lower+upper)/2); 
        if (array[mid]==key)
           return mid;
       else if(array[mid]>key)
          return binarysearch(array,lower,mid-1,key);
       else if(array[mid]<key)
          return binarysearch(array,mid+1,upper,key);
       
       else
           return 0;
    
            
        
    }
      

    public static void main(String d[])
    {
        BinarysearchArray ob=new BinarysearchArray();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n+1];
        int index;
        for(index=0;index<n;index++)
        {
            array[index]=sc.nextInt();
        }
        int key=sc.nextInt();
    //I method of binary search
    /* 
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

        }*/
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
           //III method using recursion
           int lower=0;
           int upper=n;
           int check=ob.binarysearch(array,lower,upper,key);
           if(array[check]==key)
             System.out.println(array[check]+" index at " +(check+1));
           else
              System.out.println("element not found");
          
         
          
    
        }

    }
    

