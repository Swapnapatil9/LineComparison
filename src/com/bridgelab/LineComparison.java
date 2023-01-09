package com.bridgelab;

public class LineComparison {
    static int x1;
    static int y1;
    static int x2;
    static int y2;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
    x1=5;
    y1=6;

    x2=2;
    y2=2;

    Integer length1=(int)Math.sqrt( (Math.pow((x1-x2),2)+Math.pow((y1-y2),2)) );
        System.out.println("Length of the line: "+length1);

        x1=5;
        y1=6;

        x2=2;
        y2=2;

        Integer length2=(int)Math.sqrt( (Math.pow((x1-x2),2)+Math.pow((y1-y2),2)) );
        System.out.println("Length of the line: "+length2);

        System.out.println(length1.compareTo(length2));
        System.out.println(length1.equals(length2));
    }
}
