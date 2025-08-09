public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 9, 12, 14, 19, 20};

        for (int num : numbers) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
