public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 16, 11, 20};

        for (int number : arr) {
            if (number % 5 == 0) {
                System.out.println("Първото число, което се дели на 5 е: " + number);
                break;
            }
        }
    }
}
