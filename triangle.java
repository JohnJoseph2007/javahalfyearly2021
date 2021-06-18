/*Q.1.WAP to input three angles of a triangle check and print if they form a valid triangle , if
so check and print if equilateral, isosceles or scalene triangle and print it. Otherwise print
triangle not possible.*/

import java.util.*;
class triangle {
    public static void main() {
        Scanner obj = new Scanner(System.in);
        int s1, s2, s3;
        int add = 0;
        boolean valid = false;
        System.out.println("Enter three sides of triangle");
        s1 = obj.nextInt();
        s2 = obj.nextInt();
        s3 = obj.nextInt();
        add = s1+s2+s3;
        if(add==180){
          System.out.println("Triangle is valid");
          valid = true;
        } else {
          System.out.println("Triangle is invalid");
          valid = false;
        }
        
        if(valid){
          if(s1==s2 && s2==s3 && s1==s3){
            System.out.println("Triangle is equilateral");
          } else if(s1==s2 || s2==s3 || s1==s3) {
            System.out.println("Triangle is isosceles");  
          } else {
            System.out.println("Triangle is scalene");  
          }
        } else {
          System.out.println(" ");
        }
      obj.close();
    }
}