//variable list of arguements
/*1.using an array
 * 2.usinfg an ellipse
 * 3.using object class
 */
class NPTEL_varargsmethodDemo {
    static void varargsMethod1(int v[])
    {
        System.out.println("number of arguements " +v.length+" length");
        for(int x:v)
        {
            System.out.print(x+" ");
            System.out.println();
       
        }
    }
    public static void main(String args[])
    {
        //for test
        int x[]={1,3,5,7};
        int y[]={2,4};
        int z[]={};
        varargsMethod1(x);//pass 4 values
        varargsMethod1(y);//pass 2 values
        varargsMethod1(z);//passed no arguements to method

    }
    
}
