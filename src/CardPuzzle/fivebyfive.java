package CardPuzzle;

import java.awt.*;
import java.applet.*;
import java.util.Random;
import javax.swing.*;


public class fivebyfive extends Panel {

    Rectangle r11, r12, r13, r14, r15, r21, r22, r23, r24, r25, r31, r32, r33, r34, r35, r41, r42, r43, r44, r45, r51, r52, r53, r54, r55;
    boolean scramble[];
    String matrix[][];
    Random rnd;
    int blankR;
    int blankC;
    int playLevel;

    public void init() {
        r11 = new Rectangle(100, 100, 120, 120);
        r12 = new Rectangle(220, 100, 120, 120);
        r13 = new Rectangle(340, 100, 120, 120);
        r14 = new Rectangle(460, 100, 120, 120);
        r15 = new Rectangle(580, 100, 120, 120);

        r21 = new Rectangle(100, 220, 120, 120);
        r22 = new Rectangle(220, 220, 120, 120);
        r23 = new Rectangle(340, 220, 120, 120);
        r24 = new Rectangle(460, 220, 120, 120);
        r25 = new Rectangle(580, 220, 120, 120);

        r31 = new Rectangle(100, 340, 120, 120);
        r32 = new Rectangle(220, 340, 120, 120);
        r33 = new Rectangle(340, 340, 120, 120);
        r34 = new Rectangle(460, 340, 120, 120);
        r35 = new Rectangle(580, 340, 120, 120);

        r41 = new Rectangle(100, 460, 120, 120);
        r42 = new Rectangle(220, 460, 120, 120);
        r43 = new Rectangle(340, 460, 120, 120);
        r44 = new Rectangle(460, 460, 120, 120);
        r45 = new Rectangle(580, 460, 120, 120);


        r51 = new Rectangle(100, 580, 120, 120);
        r52 = new Rectangle(220, 580, 120, 120);
        r53 = new Rectangle(340, 580, 120, 120);
        r54 = new Rectangle(460, 580, 120, 120);
        r55 = new Rectangle(580, 580, 120, 120);

        matrix = new String[7][7];
        scramble = new boolean[26];
        for (int k = 1; k <= 25; k++)
            scramble[k] = false;
        rnd = new Random();

        for (int r = 0; r <= 6; r++)
            for (int c = 0; c <= 6; c++)
                matrix[r][c] = "#";

        for (int r = 1; r <= 5; r++)
            for (int c = 1; c <= 5; c++) {
                matrix[r][c] = getLetter();
                if (matrix[r][c].equals("Y")) {
                    blankR = r;
                    blankC = c;
                }
            }
    }


    public String getLetter() {
        String letter = "";
        boolean Done = false;
        while (!Done) {
            int rndNum = rnd.nextInt(25) + 1;
            if (scramble[rndNum] == false) {
                letter = String.valueOf((char) (rndNum + 64));
                scramble[rndNum] = true;
                Done = true;
            }
        }
        return letter;
    }


    public void paint(Graphics g) {
        drawGrid(g);
        drawLetter(g, matrix[1][1], 100, 100);
        drawLetter(g, matrix[1][2], 220, 100);
        drawLetter(g, matrix[1][3], 340, 100);
        drawLetter(g, matrix[1][4], 460, 100);
        drawLetter(g, matrix[1][5], 580, 100);

        drawLetter(g, matrix[2][1], 100, 220);
        drawLetter(g, matrix[2][2], 220, 220);
        drawLetter(g, matrix[2][3], 340, 220);
        drawLetter(g, matrix[2][4], 460, 220);
        drawLetter(g, matrix[2][5], 580, 220);

        drawLetter(g, matrix[3][1], 100, 340);
        drawLetter(g, matrix[3][2], 220, 340);
        drawLetter(g, matrix[3][3], 340, 340);
        drawLetter(g, matrix[3][4], 460, 340);
        drawLetter(g, matrix[3][5], 580, 340);

        drawLetter(g, matrix[4][1], 100, 460);
        drawLetter(g, matrix[4][2], 220, 460);
        drawLetter(g, matrix[4][3], 340, 460);
        drawLetter(g, matrix[4][4], 460, 460);
        drawLetter(g, matrix[4][5], 580, 460);

        drawLetter(g, matrix[5][1], 100, 580);
        drawLetter(g, matrix[5][2], 220, 580);
        drawLetter(g, matrix[5][3], 340, 580);
        drawLetter(g, matrix[5][4], 460, 580);
        drawLetter(g, matrix[5][5], 580, 580);
    }


    public void drawGrid(Graphics g) {
        g.drawRect(100, 100, 600, 600);

        //vertical
        g.drawLine(220, 100, 220, 700);
        g.drawLine(340, 100, 340, 700);
        g.drawLine(460, 100, 460, 700);
        g.drawLine(580, 100, 580, 700);

        //horiz
        g.drawLine(100, 220, 700, 220);
        g.drawLine(100, 340, 700, 340);
        g.drawLine(100, 460, 700, 460);
        g.drawLine(100, 580, 700, 580);
    }


    public void drawLetter(Graphics g, String letter, int x, int y) {
        int offSetX = x + 4;
        int offSetY = y + 110;
        g.setFont(new Font("Arial", Font.BOLD, 120));
        if (letter.equals("Y")) {
            g.setColor(Color.white);
            g.fillRect(x + 1, y + 1, 119, 119);
        } else {
            g.setColor(Color.black);
            g.drawString(letter, offSetX, offSetY);
        }
    }


    public boolean mouseDown(Event e, int x, int y) {
        if (r11.inside(x, y) && okSquare(1, 1))
            swap(1, 1);
        else if (r12.inside(x, y) && okSquare(1, 2))
            swap(1, 2);
        else if (r13.inside(x, y) && okSquare(1, 3))
            swap(1, 3);
        else if (r14.inside(x, y) && okSquare(1, 4))
            swap(1, 4);
        else if (r15.inside(x, y) && okSquare(1, 5))
            swap(1, 5);
        else if (r21.inside(x, y) && okSquare(2, 1))
            swap(2, 1);
        else if (r22.inside(x, y) && okSquare(2, 2))
            swap(2, 2);
        else if (r23.inside(x, y) && okSquare(2, 3))
            swap(2, 3);
        else if (r24.inside(x, y) && okSquare(2, 4))
            swap(2, 4);
        else if (r25.inside(x, y) && okSquare(2, 5))
            swap(2, 5);
        else if (r31.inside(x, y) && okSquare(3, 1))
            swap(3, 1);
        else if (r32.inside(x, y) && okSquare(3, 2))
            swap(3, 2);
        else if (r33.inside(x, y) && okSquare(3, 3))
            swap(3, 3);
        else if (r34.inside(x, y) && okSquare(3, 4))
            swap(3, 4);
        else if (r35.inside(x, y) && okSquare(3, 5))
            swap(3, 5);
        else if (r41.inside(x, y) && okSquare(4, 1))
            swap(4, 1);
        else if (r42.inside(x, y) && okSquare(4, 2))
            swap(4, 2);
        else if (r43.inside(x, y) && okSquare(4, 3))
            swap(4, 3);
        else if (r44.inside(x, y) && okSquare(4, 4))
            swap(4, 4);
        else if (r45.inside(x, y) && okSquare(4, 5))
            swap(4, 5);
        else if (r51.inside(x, y) && okSquare(5, 1))
            swap(5, 1);
        else if (r52.inside(x, y) && okSquare(5, 2))
            swap(5, 2);
        else if (r53.inside(x, y) && okSquare(5, 3))
            swap(5, 3);
        else if (r54.inside(x, y) && okSquare(5, 4))
            swap(5, 4);
        else if (r55.inside(x, y) && okSquare(5, 5))
            swap(5, 5);
        return true;
    }


    public boolean okSquare(int r, int c) {
        boolean temp = false;
        if (matrix[r - 1][c].equals("Y"))
            temp = true;
        else if (matrix[r + 1][c].equals("Y"))
            temp = true;
        else if (matrix[r][c - 1].equals("Y"))
            temp = true;
        else if (matrix[r][c + 1].equals("Y"))
            temp = true;
        return temp;
    }


    public void swap(int r, int c) {
        matrix[blankR][blankC] = matrix[r][c];
        matrix[r][c] = "Y";
        blankR = r;
        blankC = c;
        repaint();
    }


    public void update(Graphics g) {
        paint(g);
    }


}




	
	
