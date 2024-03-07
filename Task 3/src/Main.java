public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 9, 12, 15, 20};

        System.out.println("Элементы массива, кратные 3:");

        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}
