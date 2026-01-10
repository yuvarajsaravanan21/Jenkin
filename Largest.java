import java.util.Scanner;

public class Largest {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int min = 1;
        int max = 50;
        System.out.println("Enter value of A :");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();
        System.out.println("Enter value of C :");
        int c = sc.nextInt();
        if(a < min || a > max ||b < min || b > max || c < min || c > max ) {
            System.out.println("Invalid : Input out of Range");
        }
        else{
            int largest = a;
            if(largest < b ) {
                largest = b;
            }
            if (largest < c ) {
                largest = c;
            }
            System.out.println("Largest : " + largest);
        }
        System.out.println("Input value " + a + "," + b + "," + c);
        sc.close();

    }
    
}
