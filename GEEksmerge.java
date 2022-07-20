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
      /*  
    int i, k;
  for (i = 0; i < n; i++) {
    // take first element from arr1 
    // compare it with first element of second array
    // if condition match, then swap
    if (arr1[i] > arr2[0]) {
      long temp = arr1[i];
      arr1[i] = arr2[0];
      arr2[0] = temp;
    }

    // then sort the second array
    // put the element in its correct position
    // so that next cycle can swap elements correctly
    long first = arr2[0];
    // insertion sort is used here
    for (k = 1; k < m && arr2[k] < first; k++) {
      arr2[k - 1] = arr2[k];
    }
    arr2[k - 1] = first;
  } */

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
