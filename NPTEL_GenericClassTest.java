class Student
{
    String name;
    float marks;
    Student(String name,float marks)
    {
        this.name=name;
        this.marks=marks;
    }
}

class GenericClass<T>{
    T object;
    GenericClass(T object){
        this.object=object;
    }
    public T getObject()
    {
        return this.object;
    }

}

class NPTEL_GenericClassTest {
    public static void main(String k[])
    {
        GenericClass<Integer> iobj=new GenericClass<Integer>(15);
        System.out.println(iobj.getObject());
        GenericClass<String> sobj=new GenericClass<String>("Java");
        System.out.println(sobj.getObject());
        GenericClass<Double> tobj=new GenericClass<Double>(3.14);
        System.out.println(tobj.getObject());

    }
    
}
