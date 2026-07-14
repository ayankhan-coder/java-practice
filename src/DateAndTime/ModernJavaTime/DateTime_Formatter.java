package DateAndTime.ModernJavaTime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime_Formatter {
    public static void main(String[] args) {
        System.out.println("------------------------Date Format--------------------");

        LocalDate date = LocalDate.now();
        System.out.println("Default DateFormat  : "+date);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.print("With FormatPatterns : ");
        System.out.println(date.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE dd-MMMM-yyyy");
        System.out.println(date.format(dtf2));

        LocalDate d = LocalDate.of(2030,5,10);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yy E");
        System.out.println(d.format(dtf3));

        System.out.println("------------------------Time Format--------------------");

        LocalTime time = LocalTime.now();
        System.out.println("Default TimeFormat  : "+ time);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.print("With FormatPattern  : ");
        System.out.println(time.format(dtf1));

        LocalTime time1 = LocalTime.of(6,45);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("a HH:mm");
        System.out.println(time1.format(formatter));

        System.out.println("----------------------DateTime Format--------------------");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Default DateTimeFormat       : "+ldt);
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yyyy, hh:mm:ss a");
        System.out.print("With DateTime Format pattern : ");
        System.out.println(ldt.format(dtf4));

        LocalDateTime ldt2 = LocalDateTime.of(date,time);//IMPORTANT
        System.out.println(ldt2);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss a dd-MMMM-yy");
        System.out.println(ldt2.format(formatter1));


        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@ PARSING METHOD Very Important @@@@@@@@@@@@@@@@@@@@@@@@@@@");

        String myDate = "10/06/2008";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(myDate,dateTimeFormatter);
        System.out.println(localDate);


       String myTime = "06:30 AM";
       DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("hh:mm a",Locale.ENGLISH);
       LocalTime localTime = LocalTime.parse(myTime,dateTimeFormatter1);
        System.out.println(localTime);

       String myDateTime = "10/12/2025 07:30 AM";
       DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a",Locale.ENGLISH);
        LocalDateTime localDateTime = LocalDateTime.parse(myDateTime,dtf5);
        System.out.println(localDateTime);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        System.out.println(localDateTime.format(myFormatter));

    }
}
