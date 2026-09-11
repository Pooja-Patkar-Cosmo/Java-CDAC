

public class Date {
    private int day;
    private int month;
    private int year;

    // Default constructor initialized to a default valid date
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2026;
    }

    // Helper method: Checks if a year is a leap year.
    // Concept: A year is a leap year if divisible by 4, 
    // UNLESS it is divisible by 100 (except when also divisible by 400).
    private boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // Helper method: Returns the maximum number of days in a given month of a year.
    private int getDaysInMonth(int m, int y) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(y) ? 29 : 28;
            default:
                return 31;
        }
    }

    // Setter / Mutator with full validation matching your logic
    public void setDate(int dd, int mm, int yy) {
        this.year = yy;

        // Month validation
        if (mm < 1 || mm > 12) {
            this.month = 1;
        } else {
            this.month = mm;
        }

        // Day validation based on validated month and year
        int maxDays = getDaysInMonth(this.month, this.year);
        if (dd < 1 || dd > maxDays) {
            this.day = 1;
        } else {
            this.day = dd;
        }
    }

    // Add days logic: advances days while handling month and year rollovers
    public void addDays(int days) {
        if (days <= 0) return;

        this.day += days;

        // While loop rolls over months/years if added days cross month boundaries
        while (this.day > getDaysInMonth(this.month, this.year)) {
            this.day -= getDaysInMonth(this.month, this.year);
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    // Add months logic: handles year rollover if month > 12
    public void addMonths(int months) {
        if (months <= 0) return;

        this.month += months;
        while (this.month > 12) {
            this.month -= 12;
            this.year++;
        }

        // Cap day count if the current day exceeds new month's max days (e.g. Jan 31 + 1 month -> Feb 28/29)
        int maxDays = getDaysInMonth(this.month, this.year);
        if (this.day > maxDays) {
            this.day = maxDays;
        }
    }

    // Add years logic
    public void addYears(int years) {
        if (years <= 0) return;
        this.year += years;

        // Adjust Feb 29 to Feb 28 if target year is not a leap year
        if (this.month == 2 && this.day == 29 && !isLeapYear(this.year)) {
            this.day = 28;
        }
    }

    // Display method
    public void display() {
        System.out.println("Current Date: " + day + "/" + month + "/" + year);
    }

    // Getters / Accessors
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
