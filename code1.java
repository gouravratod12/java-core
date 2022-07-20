/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class code1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here=sc.next
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int S[]=new int[N];
		int T[]=new int[N];
		int index=0;
		for(index=0;index<N;index++)
		{
		    S[index]=sc.nextInt();
		    T[index]=sc.nextInt();
		}
		int L[]=new int[N],max=0,k=0;
		int W=0;
		for(index=0;index<N;index++)
		{
		     
		     if(S[index]>T[index])
		     {
		         L[k]=S[index]-T[index];
		         W++;
		         k++;
		     }
		     else
		     {
		         L[k]=T[index]-S[index];
		         W++;
		         k++;
		         
		     }
		    
		     
		      
		}
		max=L[0];
		
		for(index=1;index<N;index++)
		{
		   
		    if(L[index]>max)
		    {
		        max=L[index];
		    }
		   
		    
		}
		System.out.println((index-W)+" "+max);
		
	}
}
