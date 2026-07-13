package DateAndTime.ModernJavaTime;

import java.time.LocalTime;

public class Local_Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        System.out.println("--------------------------------------------------");

        LocalTime t = LocalTime.of(5,15);      //settingTime
        LocalTime t1 = LocalTime.of(5,15,12);
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t.getHour());
        System.out.println(t.getMinute());

        System.out.println("--------------------------------------------------");
        /*Plus and Minus methods*/

        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.plusHours(2).plusMinutes(15).plusSeconds(12);//PlusMethod
        System.out.println(newTime);
        System.out.println(newTime.getHour());

        LocalTime currentTime2 = LocalTime.now();
        LocalTime newTime2 = currentTime2.minusHours(2).minusMinutes(15).minusSeconds(10);//MinusMethod
        System.out.println(newTime2);
        System.out.println(newTime2.getHour());

        LocalTime t3 = LocalTime.of(18,20,10);
        LocalTime result = t3.plusHours(2)
                .minusMinutes(30)
                .plusSeconds(15);
        System.out.println(result);

        System.out.println("--------------------------------------------------");
        /* isBefore , isAfter , Equals Methods*/

       LocalTime officeStart = LocalTime.of(9,0,0);
       LocalTime now = LocalTime.now();
        System.out.println(now.isBefore(officeStart));

        LocalTime now2 = LocalTime.of(10, 15);
        LocalTime officeStart2 = LocalTime.of(9, 0);
        System.out.println(now2.isAfter(officeStart2));

        LocalTime t4 = LocalTime.of(8,30);
        LocalTime t5 = LocalTime.of(8,30);
        System.out.println(t4.equals(t5));

        LocalTime hotdReleaseTime = LocalTime.of(6,0);
        LocalTime nowTime = LocalTime.now();
        if (hotdReleaseTime.isBefore(nowTime)){
            System.out.println("Episode Released");
        }else {
            System.out.println("Episode Has not released yet");
        }


        System.out.println("--------------------------------------------------");
        /*With methods*/

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.withHour(9));
        System.out.println(localTime.withMinute(12));
        System.out.println(localTime.withSecond(20));

    }
}
