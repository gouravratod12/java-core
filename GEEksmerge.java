import java.util.*;

class GEEksmerge {
   
   
   public static void main(String p[])
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int arr1[]=new int[n];
       for(int i=0;i<n;i++)
       {
          arr1[i]=s.nextInt();
       }
       int m=s.nextInt();
       int arr2[]=new int[m];
       for(int i=0;i<m;i++)
       {
          arr2[i]=s.nextInt();
       }
       int k=n-1,j=0,temp;
       while(k>=0 && j<n)
       {
        if(arr1[k]>arr2[j])
        {
            temp=arr1[k];
            arr1[k]=arr2[j];
            arr2[j]=temp;
           
        }
        k--;
        j++;
      

    }
   
    Arrays.sort(arr1);
    Arrays.sort(arr2);
  
   
    for(int i=0;i<m+n;i++)
   {
      if(i<n)
      System.out.print(arr1[i]+" ");
      else
      {
       
      System.out.print(arr2[i-n]+" ");
      }

  }


       


    }
    
    
}
