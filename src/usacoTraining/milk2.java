/*
ID: devdeep1
TASK: milk2
LANG: JAVA
 */

package usacoTraining;

import java.io.*;
import java.util.Scanner;

public class milk2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("/Users/devdeeprajpal/IdeaProjects/1stSemCS3/src/usacoTraining/milk2.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter("/Users/devdeeprajpal/IdeaProjects/1stSemCS3/src/usacoTraining/milk2.out"));

        int vals = Integer.parseInt(in.nextLine());
        int[] start = new int[vals];
        int[] end = new int[vals];

        for (int x = 0; x < vals; x++) {
            String[] temp = in.nextLine().split(" ");
            start[x] = Integer.parseInt(temp[0]);
            end[x] = Integer.parseInt(temp[1]);
        }
        sort(start, end);
        out.write(longestTime(start, end, vals) + " ");
        out.write(longestGap(start, end, vals) + "");
        out.newLine();
        out.write("Debug");
        out.newLine();
        for (int x = 0; x < vals; x++) {
            out.write("" + start[x] + " " + end[x]);
            out.newLine();
        }
        out.close();
        in.close();

    }

    private static int longestTime(int[] start, int[] end, int numOf) {
        int longestTime = 0;
        for (int x = 0; x < numOf; x++) {
            int e = x;
            for (int y = 0; y < numOf - 1; y++) {
                int ref = x;
                if (end[ref] + 500 < start[y + 1]) {
                    e = y;
                    ref++;
                }

            }
            if (longestTime < end[e] - start[x])
                longestTime = end[e] - start[x];
        }
        return longestTime;
    }

    private static int longestGap(int[] start, int[] end, int numOf) {
        int longestTime = 0;
        boolean notAtEnd = true;
        for (int x = 0; x < start.length; x++) {
            boolean notLongEnough = true;
            int e = x;
            while (!notLongEnough) {
            }
        }

        return longestTime;
    }


    private static void sort(int arr[], int notSort[]) {
        int n = arr.length;

        for (int x = 0; x < n - 1; x++) {
            int min = x;
            for (int y = x + 1; y < n; y++)
                if (arr[y] < arr[min])
                    min = y;

            int temp = arr[min];
            int temp2 = notSort[min];
            arr[min] = arr[x];
            notSort[min] = notSort[x];
            arr[x] = temp;
            notSort[x] = temp2;
        }
    }

}