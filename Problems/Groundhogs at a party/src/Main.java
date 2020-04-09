import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        boolean b = scanner.nextBoolean();
        System.out.println(
                (a<=20&&a>=10&&b==false)||(a<=25&&a>=15&&b==true)
        );
    }
}