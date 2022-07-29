import java.util.*;
`

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
		int n=sc.nextInt();
		int array[]=new int[n+1];
		int sum=0;
		int answer=0;
	
		for(int index=1;index<=n;index++)
		{
		     
		   array[index]=sc.nextInt();
		   if(array[index]==0)
		   {
			  sum=0;
		   }
		   else
		   {
			  sum++;
			  answer+=sum;

		   }
		   
		}
		System.out.println(answer);
        
	}
  }
}