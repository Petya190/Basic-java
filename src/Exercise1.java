public class Exercise1 {
    public static void main(String[] args) {

        int[] numbers = {4, 9, 2, 7, 5};
        int largest = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }


        System.out.println("The largest number is: " + largest);
    }
}
