public class Elha {
    public static void main(String[] args) {
        int height = 7; //височина на елхата
        // използване for цикъл за повтаряшо действие

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //височина на стъблото
        for (int i = 0; i < height / 3; i++) {
            for (int j = 1; j < height; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
