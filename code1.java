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
		int L[]=new int[N],max=0,k=0;
		int W=0;
	    max=L[0];
		for(index=0;index<N;index++)
		{
			     S[index]=sc.nextInt();
		         T[index]=sc.nextInt();
		    
		         L[k]=Math.abs(S[index]-T[index]);
		         k++;
				
				   if(L[index]>=max)
				  {
					 max=L[index];
					 if(S[index]>T[index])
					 {
						W=1;
					 }
					 else
					 {
						W=2;
					 }
					 
					 
				  }
				  
				
		
			  
			   
	
			}
			System.out.print(W+" "+max);
		
	}
}
