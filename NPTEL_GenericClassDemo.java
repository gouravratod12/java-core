class GenericArray<T>{
    T a[];
    GenericArray(T x){
        a=x;
    }
    T getData(int i)
    {
        return a[i];
    }
 static void printData(T b)
    {
        for(int i=0;i<b.length();i++)
        {
            System.out.println(b.getData(i)+" ");
            System.out.println();
        }
    }
static void reverseArray(T b)
    {
        int front=0,rear=b.length;
        T temp;
        while(front<rear)
        {
            temp=b[rear];
            b[rear]=a[front];
            a[front]=temp;
            front++;
            rear--;
        }
    }
}

class NPTEL_GenericClassDemo {
   
    public static void main(String args[])
    {
        Integer x[]={10,20,30,40,50};
        GenericArray<Integer> aInt=new GenericArray<Integer>(x);
        printData(aInt);
        reverseArray(aInt);
        printData(aInt);
    }
}
