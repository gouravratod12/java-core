//program to handle array of integers
 class GenericClass<T>{
  
    private T x;
    public GenericClass(T t){
        x=t;
    }
    public void printData()
    {
        System.out.println(x);
    }
}
class NPTEL_GenericClass {
   
    public static void main(String m[])
    {
        GenericClass<String> a=new GenericClass<String>("java");
        a.printData();
        GenericClass<Integer> b=new GenericClass<Integer>(123);
        b.printData();
        GenericClass<Double> c=new GenericClass<Double>(3.14);
        c.printData();
        

    }
}
