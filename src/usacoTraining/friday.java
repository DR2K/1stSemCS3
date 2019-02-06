package usacoTraining;
/*
ID: devdeep1
TASK: friday
LANG: JAVA
 */

import java.io.*;

public class friday {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("milk2.in"));
        BufferedWriter output = new BufferedWriter(new FileWriter("friday.out"));

        int yrEnd = Integer.parseInt(input.readLine());
        int[] daysOfWeek = new int[7];
        int d = 0;
        int[] end = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] lEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int y = 1900; y < yrEnd + 1900; y++) {
            for (int m = 0; m < 12; m++) {
                daysOfWeek[(d + 12) % 7] += 1;
                if (leapQuestionMark(y))
                    d += lEnd[m];
                else
                    d += end[m];
            }
        }

        String out = daysOfWeek[5] + " " + daysOfWeek[6] + " ";
        for (int x = 0; x < daysOfWeek.length - 2; x++)
            out = out + daysOfWeek[x] + " ";
        out = out.substring(0, out.length() - 1);
        output.write(out);
        output.newLine();
        output.close();
        input.close();

    }

    public static boolean leapQuestionMark(int yr) {
        if (yr % 4 != 0)
            return false;
        else if (yr % 100 != 0)
            return true;
        else
            return yr % 400 == 0;
    }
}
