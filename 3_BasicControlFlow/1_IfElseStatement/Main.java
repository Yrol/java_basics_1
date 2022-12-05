public class Main {

    public static void main(String[] main) {
        boolean b = true;

        if (!b) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        // change boolean value
        if ((b = false)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int testScore = 76;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("grade=" + grade);

        // Exam type example
        int hoursOfDay = 10;
        if (hoursOfDay < 11)
            System.out.println("Morning");
        else if (hoursOfDay < 17)
            System.out.println("Evening");
        else
            System.out.println("Day");
        // hoursOfDay++;

        // Order of the IF statement is important: will execute statement 1 although
        // we've condition to evaluate (hoursOfDay < 11)
        if (hoursOfDay < 17) { // statement 1
            System.out.println("Afternoon");
        } else if (hoursOfDay < 11) { // statement 2
            System.out.println("Morning");
        } else { // statement 3
            System.out.println("Evening");
        }
    }
}
