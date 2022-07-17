import java.util.*;

class Arraycheckprogram {
    static void mergesort(int array[],int first,int last )
{   while(first<last)
    {
        int mid=first+(last-1)/2;
        mergesort(array,first,mid);
        mergesort(array,mid+1,last);
        merge(array,first,mid,last);
       
    }   
    
}
static void merge(int array[],int first,int mid,int last)
{   
    int i,j,k;
    int n1=mid-first+1;
    int n2=last-mid;
    int L[]=new int[n1],R[]=new int[n2];//create temporary;
    for(i=0;i<n1;i++)//copying all array into the left and right....
    {
        L[i]=array[first+i];

    }
    for(j=0;j<n2;j++)
    {

        R[j]=array[mid+1+j];
    }
    //now 
    i=0;
    j=0;
    k=first;
    while(i<n1 && j<n2)
    {
        if(L[i]<=R[j])
        {
            array[k]=L[i];
            i++;

        }
        else
        {
            array[k]=R[j];
            j++;   
        }
        k++;
    }
    while(i<n1)
    {
        array[k]=L[i];
        i++;
        k++;
    }
    while(j<n1)
    {
        array[k]=R[j];
        j++;
        k++;
    }
    
}

    public static void main(String m[])
    {  
        Scanner sc=new Scanner(System.in);       
        int n=sc.nextInt();
        int array[]={};
        array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        } 
        mergesort(array,0,n-1);
        for(int p=0;p<n;p++)
        {
           System.out.print(array[p]+" ");
        } 
           

        
        
       
    
    }
}