import java.util.*;
class HelloWorld{
     public static void main(String args[])
     {
        System.out.println("Hello World");
        Scanner obj = new Scanner(System.in);
        int n1, n2;
        char ch;
        System.out.println("Df");
        System.out.println("Enter the two numbers");
        n1 = obj.nextInt();
        System.out.println("DS");
        n2 = obj.nextInt();
        System.out.println("Enter either 'y' or 'n'");
        ch = obj.next().charAt(0);
        if(ch=='y')
        {
            System.out.println("ORIGINAL VALUE " +n1+", "+n2);
            int n;
            n=n1;
            n1=n2;
            n2=n;
            System.out.println("SWAPPED VALUE " +n1+", "+n2);
        }
        else if(ch=='n')
        {
            System.out.println("ORIGINAL VALUE " +n1+", "+n2);
            n1=n1+n2;
            n2=n1-n2;
            n1=n1-n2;
            System.out.println("SWAPPED VALUE " +n1+", "+n2);
        }
        else
            System.out.println("Invalid character detected");

        obj.close();
     }
}