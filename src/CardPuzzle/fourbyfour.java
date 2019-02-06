package CardPuzzle;

import java.awt.*;
import java.applet.*;
import java.util.Random;
import javax.swing.*;


public class fourbyfour extends Panel {

    Rectangle r11, r12, r13, r14, r21, r22, r23, r24, r31, r32, r33, r34, r41, r42, r43, r44;
    boolean scramble[];
    String matrix[][];
    Random rnd;
    int blankR;
    int blankC;
    int playLevel;


    public void init() {
        r11 = new Rectangle(100, 100, 150, 150);
        r12 = new Rectangle(250, 100, 150, 150);
        r13 = new Rectangle(400, 100, 150, 150);
        r14 = new Rectangle(550, 100, 150, 150);

        r21 = new Rectangle(100, 250, 150, 150);
        r22 = new Rectangle(250, 250, 150, 150);
        r23 = new Rectangle(400, 250, 150, 150);
        r24 = new Rectangle(550, 250, 150, 150);

        r31 = new Rectangle(100, 400, 150, 150);
        r32 = new Rectangle(250, 400, 150, 150);
        r33 = new Rectangle(400, 400, 150, 150);
        r34 = new Rectangle(550, 400, 150, 150);

        r41 = new Rectangle(100, 550, 150, 150);
        r42 = new Rectangle(250, 550, 150, 150);
        r43 = new Rectangle(400, 550, 150, 150);
        r44 = new Rectangle(550, 550, 150, 150);

        matrix = new String[6][6];
        scramble = new boolean[17];
        for (int k = 1; k <= 16; k++)
            scramble[k] = false;
        rnd = new Random();

        for (int r = 0; r <= 5; r++)
            for (int c = 0; c <= 5; c++)
                matrix[r][c] = "#";

        for (int r = 1; r <= 4; r++)
            for (int c = 1; c <= 4; c++) {
                matrix[r][c] = getLetter();
                if (matrix[r][c].equals("P")) {
                    blankR = r;
                    blankC = c;
                }
            }
    }


    public String getLetter() {
        String letter = "";
        boolean Done = false;
        while (!Done) {
            int rndNum = rnd.nextInt(16) + 1;
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
        drawLetter(g, matrix[1][2], 250, 100);
        drawLetter(g, matrix[1][3], 400, 100);
        drawLetter(g, matrix[1][4], 550, 100);

        drawLetter(g, matrix[2][1], 100, 250);
        drawLetter(g, matrix[2][2], 250, 250);
        drawLetter(g, matrix[2][3], 400, 250);
        drawLetter(g, matrix[2][4], 550, 250);

        drawLetter(g, matrix[3][1], 100, 400);
        drawLetter(g, matrix[3][2], 250, 400);
        drawLetter(g, matrix[3][3], 400, 400);
        drawLetter(g, matrix[3][4], 550, 400);

        drawLetter(g, matrix[4][1], 100, 550);
        drawLetter(g, matrix[4][2], 250, 550);
        drawLetter(g, matrix[4][3], 400, 550);
        drawLetter(g, matrix[4][4], 550, 550);
    }


    public void drawGrid(Graphics g) {
        g.drawRect(100, 100, 600, 600);

        //vertical
        g.drawLine(250, 100, 250, 700);
        g.drawLine(550, 100, 550, 700);
        g.drawLine(400, 100, 400, 700);

        //horiz
        g.drawLine(100, 250, 700, 250);
        g.drawLine(100, 400, 700, 400);
        g.drawLine(100, 550, 700, 550);
    }


    public void drawLetter(Graphics g, String letter, int x, int y) {
        int offSetX = x + 20;
        int offSetY = y + 130;
        g.setFont(new Font("Arial", Font.BOLD, 150));
        if (letter.equals("P")) {
            g.setColor(Color.white);
            g.fillRect(x + 1, y + 1, 149, 149);
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
        else if (r21.inside(x, y) && okSquare(2, 1))
            swap(2, 1);
        else if (r22.inside(x, y) && okSquare(2, 2))
            swap(2, 2);
        else if (r23.inside(x, y) && okSquare(2, 3))
            swap(2, 3);
        else if (r24.inside(x, y) && okSquare(2, 4))
            swap(2, 4);
        else if (r31.inside(x, y) && okSquare(3, 1))
            swap(3, 1);
        else if (r32.inside(x, y) && okSquare(3, 2))
            swap(3, 2);
        else if (r33.inside(x, y) && okSquare(3, 3))
            swap(3, 3);
        else if (r34.inside(x, y) && okSquare(3, 4))
            swap(3, 4);
        else if (r41.inside(x, y) && okSquare(4, 1))
            swap(4, 1);
        else if (r42.inside(x, y) && okSquare(4, 2))
            swap(4, 2);
        else if (r43.inside(x, y) && okSquare(4, 3))
            swap(4, 3);
        else if (r44.inside(x, y) && okSquare(4, 4))
            swap(4, 4);
        return true;
    }


    public boolean okSquare(int r, int c) {
        boolean temp = false;
        if (matrix[r - 1][c].equals("P"))
            temp = true;
        else if (matrix[r + 1][c].equals("P"))
            temp = true;
        else if (matrix[r][c - 1].equals("P"))
            temp = true;
        else if (matrix[r][c + 1].equals("P"))
            temp = true;
        return temp;
    }


    public void swap(int r, int c) {
        matrix[blankR][blankC] = matrix[r][c];
        matrix[r][c] = "P";
        blankR = r;
        blankC = c;
        repaint();
    }


    public void update(Graphics g) {
        paint(g);
    }


}




	
	
