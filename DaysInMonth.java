public class DaysInMonth {
    public static void main(String[] args) {
        int month = 2; // Test Month (2 = February)
        int year = 2024; // Test Year

        // Step 1: Pehle check karo ki year Leap Year hai ya nahi
        boolean isLeapYear = false;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeapYear = true;
        }

        // Step 2: If-else ladder se days count karo
        int days;

        // February ke liye special check
        if (month == 2) {
            if (isLeapYear) {
                days = 29;
            } else {
                days = 28;
            }
        }
        // April, June, September, November mein 30 days hote hain
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        // Invalid month check
        else if (month < 1 || month > 12) {
            days = 0; 
        }
        // Baaki sabhi months mein 31 days hote hain (1, 3, 5, 7, 8, 10, 12)
        else {
            days = 31;
        }

        // Result print karo
        if (days == 0) {
            System.out.println("Invalid Month! Kripya 1 se 12 ke beech daalein.");
        } else {
            System.out.println("Year " + year + " ke Month " + month + " mein total " + days + " days hote hain.");
        }
    }
}
