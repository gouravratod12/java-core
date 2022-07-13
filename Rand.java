import java.util.Random;

class Rand {
    public static void main(String g[])
    {  
        Random r=new Random();
        int x=r.nextInt(6)+1;
        System.out.println(x);
        double y=r.nextDouble();
        System.out.println(y);
        boolean z=r.nextBoolean();
        System.out.println(z);
        

    }
    
}
