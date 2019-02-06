package misc;/*
ID: devdeep1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

public class ride
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
 //       StringTokenizer st = new StringTokenizer(f.readLine());
        String comet = f.readLine();
        String human = f.readLine();

        int cometCount = 1;
        int humanCount = 1;

        for (char x : comet.toCharArray())
        {
            cometCount *= (int)x-64;
        }
        for (char x : human.toCharArray())
        {
            humanCount *= (int)x-64;
        }
        if(cometCount%47==humanCount%47)
            out.println("GO");
        else
            out.println("STAY");
        
        out.close();
        f.close();
    }
}