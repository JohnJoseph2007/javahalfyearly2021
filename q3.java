/*

Q.3. WAP to input the number of hours worked and rate per hour, calculate the wages as per
the following table:- Print all the details.
Hours worked (nh) | first 120 hours | next 80 hours | next 100 hours |
rate per hour (rh)|       rh        |     1.5*rh    |      2*rh      | 

*/

import java.util.*;
class q3 {
    public static void main(String[] args) {
        double nh, rh, wages;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of hours worked");
        nh = obj.nextDouble();
        System.out.println("Enter rate per hour");
        rh = obj.nextDouble();
        if(nh<=120) {
            wages = nh*rh;
        } else if(nh<=200 && nh>120) {
            wages = (rh*120)+(nh-120)*(1.5*rh);
        } else {
            wages = (rh*120)+((rh*1.5)*200)+((nh-200)*(rh*2));
        }

        System.out.println("Number of hours worked = " + nh);
        System.out.println("Rate per hour = " + rh);
        System.out.println("Wages = " + wages);
        obj.close();
    }
}
