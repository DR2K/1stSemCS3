/*
ID: devdeep1
TASK: ride
LANG: JAVA
 */
package usacoTraining;

import java.io.*;

public class ride {
    public static void main(String[] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new FileReader("milk2.in"));
        BufferedWriter output = new BufferedWriter(new FileWriter("ride.out"));
        String cometVal = input.readLine();
        String humanVal = input.readLine();
        int comet = 1;
        int human = 1;
        for (char x: cometVal.toCharArray())
            comet*=(int)x;
        for (char x: humanVal.toCharArray())
            human*=(int)x;
        if (comet%47==human%47)
            output.write("GO");
        else
            output.write("STAY");
        output.close();
    }
}
