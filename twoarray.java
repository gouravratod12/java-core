import java.util.*;

class twoarray{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String[][] cars={{"mers","maruti","desire"},
                         {"woven","ema","tuzare"},
                         {"sporty","100k","meda"}
                        };
        for(int i=0;i<cars.length;i++)
        {  System.out.println();
            for(int j=0;j<cars[i].length;j++)
            {
                System.out.print(cars[i][j]+ " ");
            }
        }
    }
}