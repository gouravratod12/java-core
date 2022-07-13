import java.util.*;

class Mathfile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double x,y,z;
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.abs(y));
        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println("result is:" +z);
        sc.close();

    }
    
}
