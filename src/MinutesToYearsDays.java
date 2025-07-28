public class MinutesToYearsDays {
    public static void main(String[] args) {

        long minutes = 1000000;
// конвериране на минути в години
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;

        long totalDays = minutes / (minutesInHour * hoursInDay);
        long years = totalDays / daysInYear;
        long days = totalDays % daysInYear;

        System.out.println(minutes + " minutes is about " + years + " years and " + days + " days.");
    }
}
