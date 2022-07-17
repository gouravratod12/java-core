class NPTEL_Generic_Method_printing_diffrent_datatype<T>{
    public T t;
    void genericPrint(T t)
    {
        System.out.println(t);
    }
    public static void main(String[] k)
   {
      NPTEL_Generic_Method_printing_diffrent_datatype n=new NPTEL_Generic_Method_printing_diffrent_datatype<>();
      n.genericPrint(101);
      n.genericPrint("Joy with Java");
      n.genericPrint(3.141243);

    }   
}