package DateAndTime.ModernJavaTime;

/* For Better Understanding Look Date And Time Separately*/

import java.time.LocalDateTime;


public class Local_Date_Time {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println(dt.getMonth());
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());

        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());

        System.out.println("--------------------------------------------------");

        LocalDateTime set =
                LocalDateTime.of(2030,12,25,18,45);
        System.out.println(set);
        System.out.println(set.getMonth());
        System.out.println(set.getHour());

        System.out.println("--------------------------------------------------");
        /*Plus and Minus methods*/

        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("Current DateTime : "+currentDT);
        LocalDateTime newDT = currentDT.plusYears(4);
        LocalDateTime newDT2 = currentDT.plusMonths(4);
        System.out.println("new DateTime     : "+newDT);


        LocalDateTime dt2 =
                LocalDateTime.of(2028,5,18,9,25,40);

        LocalDateTime result =
                dt2.plusYears(1).minusMonths(2).plusDays(10).plusHours(3).minusMinutes(15);
        System.out.println(result);

        System.out.println("--------------------------------------------------");
        /* isBefore , isAfter , Equals Methods*/

        LocalDateTime orderTime =
                LocalDateTime.of(2026,7,12,10,30);

        LocalDateTime now =
                LocalDateTime.of(2026,7,12,11,00);

        System.out.println(orderTime.isBefore(now));
        System.out.println(now.isAfter(orderTime));

        LocalDateTime dt1 =
                LocalDateTime.of(2026,7,12,10,30);
        LocalDateTime dt3 =
                LocalDateTime.of(2026,7,12,10,30);
        System.out.println(dt1.equals(dt3));


        LocalDateTime nowTime = LocalDateTime.now();
        LocalDateTime hotdEpisodeRelease =
                LocalDateTime.of(2026,6,21,6,0);
        if (nowTime.isAfter(hotdEpisodeRelease)){
            System.out.println("Episodes Released");
        }else {
            System.out.println("Episodes Not Released Yet");
        }


    }
}
