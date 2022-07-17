
class NPTEL_swap_parameter
{   
   
    static<T> void swap(T x ,T y)
    {      
         T temp;
         temp=y; 
         y=x;
         temp=x;
         
       
    }
    public static void main(String args[])
    {
        Integer x=new Integer(99);
        Integer y=new Integer(66);
        System.out.println("x ="+x+" "+" y="+y);
        swap(x,y);
        System.out.println("x ="+x+" "+" y="+y);
    }
}