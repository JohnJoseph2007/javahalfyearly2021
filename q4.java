/*

Input name and annual pay of an employee , calculate the tax as per the following:-
Print all the details.

<=100000 --> 0%
100001-500000 --> 10%
500001-800000 --> 20%
>800000 --> 30%

*/

import java.util.*;
class q4 {
    public static void main(String[] args) {
        String name;
        double annualpay=0.0;
        double tax=0.0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter name");
        name = obj.nextLine();
        System.out.println("Enter Annual Pay");
        annualpay = obj.nextDouble();
        if(annualpay<=100000){
            tax=(0/100)*annualpay;
        } else if(annualpay>100000 && annualpay<=500000) {
            tax=annualpay/10;
        } else if(annualpay>500000 && annualpay<=800000) {
            tax=annualpay/5;
        } else if(annualpay>800000){
            tax=annualpay*0.3;
        }
        System.out.println("Name : " + name);
        System.out.println("Annual Pay : " + annualpay);
        System.out.println("Tax : " + tax);
        obj.close();
    }
}
