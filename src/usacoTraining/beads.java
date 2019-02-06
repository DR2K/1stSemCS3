package usacoTraining;
/*
ID: devdeep1
TASK: beads
LANG: JAVA
 */

import java.io.*;

public class beads {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("beads.in"));
        BufferedWriter output = new BufferedWriter(new FileWriter("beads.out"));
        int l = Integer.parseInt(input.readLine());
        String beads = input.readLine();
        int max = 0;
        for (int x = 0; x < l; x++) {
            int b = calcBeads(beads.substring(x) + beads.substring(0, x));
            if (b > max)
                max = b;
        }
        output.write(String.valueOf(max));
        output.newLine();
        output.close();
        input.close();
    }

    public static int calcBeads(String beads) {
        char[] beadsArr = beads.toCharArray();
        int count = 1;
        char prevColor = beadsArr[0];
        boolean noSwitch = false;
        for (int ind = 1; ind < beadsArr.length; ind++) {
            if (beadsArr[ind] == 'w') {
                count++;
            } else {
                if (prevColor == 'w' || prevColor == beadsArr[ind]) {
                    prevColor = beadsArr[ind];
                    count++;
                } else {
                    if (noSwitch)
                        break;
                    else {
                        noSwitch = true;
                        count++;
                        prevColor = beadsArr[ind];

                    }
                }
            }
        }
        return count;
    }

}
