
class NPTEL_SWAPWITHOBJECT {
      String Name;
      float marks;
      NPTEL_SWAPWITHOBJECT(String Name,float marks)
      {
        this.Name=Name;
        this.marks=marks;
      }   
}
class swaptest{
    
   public static void swap(object x,object y)
    {
        object t;
        t=x;
        x=y;
        y=t;
    }
    public static void main(String arga[])
    {
        object p1= new NPTEL_SWAPWITHOBJECT("sumit",99.5);
        Double p2=new Double("Rahul",66.5);
        System.out.println("p ="+p1+" "+"y= "+p2);
        swap(p1,p2);
        System.out.println("p ="+p1+" "+"y= "+p2);


    }
}