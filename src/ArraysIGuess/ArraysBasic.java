package ArraysIGuess;

import java.util.Arrays;

public class ArraysBasic {

    public static void main(String[] args) {
        boxes[] boxOfBoxes = new boxes[5];
        for (int x = 0; x < 5; x++) {
            boxOfBoxes[x] = new boxes((int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000));
            System.out.println(boxOfBoxes[x]);
        }
        System.out.println();

        Arrays.sort(boxOfBoxes);

        for (boxes x : boxOfBoxes)
            System.out.println(x);
    }
}

class boxes implements Comparable {
    int length;
    int width;
    int height;

    public boxes(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public String toString() {
        return length + " " + width + " " + height + " " + length * width * height;
    }

    public int compareTo(Object obj) {
        boxes b = (boxes) obj;
        if (length * width * height < b.length * b.width * b.height)
            return -1;
        if (length * width * height == b.width * b.width * b.height)
            return 0;
        return 1;
    }
}