
class NPTEL_static_generic_method {
 
    static<T> void genericPrint(T t)
    {
        System.out.println(t.getClass().getName()+":"+t);

    }
    public static void  main(String []args)
    {
        genericPrint(101);
        genericPrint("joy with java");
        genericPrint(1.472871);
    }
}
