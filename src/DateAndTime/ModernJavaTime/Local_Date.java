package DateAndTime.ModernJavaTime;


import java.time.LocalDate;

public class Local_Date {
    public static void main(String[] args) {


        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate birthday = LocalDate.of(2008,6,10);
        System.out.println(birthday);

        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfWeek());

        System.out.println("--------------------------------------------------------------------");
        /*plus and minus methods*/

        LocalDate tomorrow = d.plusDays(1);
        System.out.println(tomorrow.getDayOfWeek());

        LocalDate nextMonth = d.plusMonths(1);
        System.out.println(nextMonth.getMonth());
        System.out.println(nextMonth.getDayOfWeek());

        LocalDate nextYear = d.plusYears(4);
        System.out.println(nextYear);
        System.out.println(nextYear.getDayOfWeek());

        LocalDate yest = d.minusDays(1);
        System.out.println(yest.getDayOfWeek());
        LocalDate lastMonth = d.minusMonths(1);
        System.out.println(lastMonth.getMonth());

        System.out.println("--------------------------------------------------------------------");

        /* isBefore , isAfter , isEquals Methods*/

        LocalDate exam = LocalDate.of(2027,12,20);
        LocalDate tod = LocalDate.now();
        System.out.println(tod.isBefore(exam));

        System.out.println(exam.isAfter(tod));
        System.out.println(exam.equals(tod));

        LocalDate expiry = LocalDate.of(2022,6,10);
        if (tod.isAfter(expiry)){
            System.out.println("Medicine expired");
        }else {
            System.out.println("Medicine can be used");
        }

        LocalDate toxicMovie = LocalDate.of(2026,8,28);
        if (tod.isBefore(toxicMovie)){
            System.out.println("Movie not released");
        }else {
            System.out.println("Movie released");
        }

        System.out.println(tod.isEqual(toxicMovie));


    }
}
