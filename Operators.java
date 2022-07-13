import java.util.*;

class Operators {
    public static void main(String k[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("You are Playing a game");
        String response=sc.next();
        if(!response.equals("q") && !response.equals("Q"))
        System.out.println("You are still in the game");
        else
        System.out.println("you are not in the game");
    }   
}
