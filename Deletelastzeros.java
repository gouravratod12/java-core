import java.util.*;


class Deletelastzeros{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a={};
        a=new int[50];
       
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
      
      
        for(int i=0;i<n;i++)
        {
            
          for(int j=0;j<n;j++)
          {
           
            if(a[i]==a[j])
            {
              for(int k=j;k<n;k++)
             {
            
               a[k]=a[k+1];
            
              }
             }
                
          } 
            
             System.out.print(a[i]+" ");
            
         }   
        }
            
          
    }

    
  



