


    class NPTEL_varargsmethodDemo2 {
        static void varargsMethod1(int ...v)
        {
            System.out.println("number of arguements " +v.length+" length");
            for(int i:v)
            {
                System.out.print(i+" ");
                System.out.println();
           
            }
        }
        public static void main(String args[])
        {
            //for test
           
            varargsMethod1(5);//pass one values
            varargsMethod1(1,2,3,4);//pass 4 values
            varargsMethod1();//passed no arguements to method
    
        }
        
    }
     

