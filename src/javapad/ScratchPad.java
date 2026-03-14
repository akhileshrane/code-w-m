package javapad;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;

public class ScratchPad {
    public static void main(String[] args) {

        //reference types and immutability - Integer is immutable, Point is mutable
        Integer x = 7;
        Integer y = x;

        IO.println(y);
        x = 6;
        IO.println(y);


        Integer x1 = 7;
        Integer y1 = x1;

        IO.println(y1);
        x1 = 44;
        IO.println(y1);

        Point p = new Point(x, y);
        IO.println(p);

        Point p2 = p;
        IO.println(p2);
        p.x = 5;
        p.y = 5;

        IO.println(p2);

        p = new Point(88,88);
        IO.println(p);
        IO.println(p2);

        //LocalDate is immutable
        LocalDate today = LocalDate.now();
        IO.println(today);
        today.plusDays(33);
        IO.println(today);
        today = today.plusDays(33);
        IO.println(today);


    }
}
