
    class NPTEL_varargsmethodDemo3 {
        static void varargsMethod3(object ...obj)
        {
            //System.out.println("number of arguements " +v.length+" length");
            for(object o: obj)
            {
                System.out.print(" "+o);
                System.out.println();
           
            }
        }
        public static void main(String args[])
        {
            //for test
           
            varargsMethod3(1,"string",2.3,true);//pass one values
            varargsMethod3();//pass 4 values
            varargsMethod3(.5,25,135,45,55);//passed no arguements to method
    
        }
        
    }
     