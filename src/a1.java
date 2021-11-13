import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int i= sc.nextInt();
        String s= Integer.toBinaryString(i);
        System.out.println("The unsigned integer in base 2 of "+i+" is: "+s);
        String a = Integer.toOctalString(i);
        System.out.println("The unsigned integer in base 8 of "+i+" is: "+a);
        String b = Integer.toHexString(i);
        System.out.println("The unsigned integer in base 16 of "+i+" is: "+b);
    }
}
