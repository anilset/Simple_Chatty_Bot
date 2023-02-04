import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int [] elementsNumber = new int[scanner.nextInt()];
        for (int i = 0; i < elementsNumber.length; i++) {
            elementsNumber[i] = scanner.nextInt();
            if (elementsNumber[i] % 6 == 0) {
                sum += elementsNumber[i];
            } else {
                sum += 0;
            }
        } System.out.println(sum); // start coding here
    }
}