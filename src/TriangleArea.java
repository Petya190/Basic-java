public class TriangleArea {
    public static void main(String[] args) {
        // страни на триъгълника
        double a = 8;
        double b = 5;
        double c = 6;


        double s  = (a + b + c) / 2;


        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));


        System.out.printf("Площта на триъгълника е: %.2f\n", area);
    }
}
