package com.company;
import java.awt.Color;
//Mahathi Athreya 3B

public class ConditionalExercises {

    public static void main(String[] args) {
        double wages = totalWages(45, 12.5);
        System.out.println("Wages for 45 hours at $12.50 " + wages);
        wages = totalWages(30, 10);
        System.out.println("Wages for 30 hours at $10.00 " + wages);

        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2004 " + isLeapYear(2004));
        System.out.println("2003 " + isLeapYear(2003));
        System.out.println("2100 " + isLeapYear(2100));

        System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
        System.out.println("1/2/2011 is later than 1/2/2010 " + isLater(1,2,2011, 1,2,2010));
        System.out.println("1/2/2010 is later than 3/2/2010 " + isLater(1,2,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
        System.out.println("1/2/2010 is later than 1/3/2011 " + isLater(1,2,2010, 1,3,2010));
        System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));

        System.out.println("Best match 2 3 4 " + bestMatch(2,3,4));
        System.out.println("Best match 4 3 3 " + bestMatch(4,3,3));
        System.out.println("Best match 3 8 4 " + bestMatch(3,8,4));
        System.out.println("Best match 4 3 4 " + bestMatch(4,3,4));
        System.out.println("Best match 2 4 4 " + bestMatch(2,4,4));
        System.out.println("Best match 8 8 4 " + bestMatch(8,8,4));
        System.out.println("Best match 4 4 4 " + bestMatch(4,4,4));

        System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
        System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
        System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
        System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
        System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
        System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));


    }
    public static double totalWages(double hours, double rate) {
        double wages;
        if (hours<=40) {
            wages = hours*rate;
        }
        else {
            wages = (40 * rate) + ((hours - 40) * (1.5 * rate));
        }
        return wages;
    }
    /* Wages for 45 hours at $12.50 593.75
    Wages for 30 hours at $10.00 300.0 */
    public static boolean isLeapYear(int year){
        if (year%400==0 && year%100==0) {
            return true;
        }
        else if (year%400==0 && year%100!=0) {
            return true;
        }
        else if (year%400!=0 && year%100==0) {
            return false;
        }
        else if (year%4==0) {
            return true;
        }
        return false;
    }
    /* 2000 true
    2004 true
    2003 false
    2100 false */
    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2) {
        if (year1>year2) {
            return true;
        }
        if (year1==year2 && month1>month2) {
            return true;
        }
        if (year1==year2 && month1==month2 && day1>day2) {
            return true;
        }
        else {
            return false;
        }
    }
    /* 1/2/2010 is later than 1/2/2011 false
    1/2/2011 is later than 1/2/2010 true
    1/2/2010 is later than 3/2/2010 false
    3/2/2010 is later than 1/2/2010 true
    1/3/2010 is later than 1/2/2010 true
    1/2/2010 is later than 1/3/2011 false
    1/2/2010 is later than 1/2/2010 false */
    public static Color bestMatch(int r, int g, int b) {
        if (r>g && r>b) {
            return Color.red;
        }
        else if (g>r && g>b) {
            return Color.green;
        }
        else if (b>r && b>g) {
            return Color.blue;
        }
        else if (r==b && r==g) {
            return Color.gray;
        }
        else if (r==g && r>b) {
            return Color.yellow;
        }
        else if (r==b && r>g) {
            return Color.magenta;
        }
        else if (g==b && g>r) {
            return Color.cyan;
        }
        return Color.black;
    }
    /* Best match 2 3 4 java.awt.Color[r=0,g=0,b=255]
    Best match 4 3 3 java.awt.Color[r=255,g=0,b=0]
    Best match 3 8 4 java.awt.Color[r=0,g=255,b=0]
    Best match 4 3 4 java.awt.Color[r=255,g=0,b=255]
    Best match 2 4 4 java.awt.Color[r=0,g=255,b=255]
    Best match 8 8 4 java.awt.Color[r=255,g=255,b=0]
    Best match 4 4 4 java.awt.Color[r=128,g=128,b=128] */
    public static int findBestFit(int size1, int size2, int space) {
        int x = 0;
        int y = size1 + size2;
        if (y <= space) {
            x=3;
        }
        else if (y > space && size1 > size2 && size1 < space) {
            x=1;
        }
        else if (y > space && size2>space  && size1 < space) {
            x=1;
        }
        else if (y > space && size2 > size1 && size2 < space) {
            x=2;
        }
        else if (y > space && size1 > space && size2 < space) {
            x=2;
        }
        else if (y > space && size1 > space && size2 > space) {
            x=0;
        }
        return x;
    }
    /* Find Best fit 2 3 6 is 3
    Find Best fit 4 3 6 is 1
    Find Best fit 3 4 6 is 2
    Find Best fit 2 3 1 is 0
    Find Best fit 6 3 4 is 2
    Find Best fit 3 6 4 is 1
     */
}
