import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();
        for (int i = startNumber; i<= endNumber; i++) {
            /*if (i % 3==0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            } */
            System.out.println(i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" :
                    i % 5 == 0 ? "Buzz" :
                            i % 3 == 0 ? "Fizz" : Integer.toString(i));
            }
        }
    }