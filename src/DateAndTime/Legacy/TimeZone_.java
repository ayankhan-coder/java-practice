package DateAndTime.Legacy;

import java.util.Calendar;
import java.util.TimeZone;
public class TimeZone_ {
    public static void main(String[] args) {

        Calendar india = Calendar.getInstance();//By Default india
        System.out.print("India Time - ");
        System.out.print(india.get(Calendar.HOUR_OF_DAY)+":");
        System.out.print(india.get(Calendar.MINUTE)+":");
        System.out.println(india.get(Calendar.SECOND));
        System.out.println(india.getTimeZone().getID());

        System.out.println("---------------------------------------");

        TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
        Calendar japan = Calendar.getInstance(tokyo);
        System.out.print("Japan Time - ");
        System.out.print(japan.get(Calendar.HOUR_OF_DAY)+":");
        System.out.print(japan.get(Calendar.MINUTE)+":");
        System.out.println(japan.get(Calendar.SECOND));
        System.out.println(japan.getTimeZone().getID());

        System.out.println("---------------------------------------");

        Calendar singapore = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.print("Singapore Time - ");
        System.out.print(singapore.get(Calendar.HOUR_OF_DAY)+":");
        System.out.print(singapore.get(Calendar.MINUTE)+":");
        System.out.println(singapore.get(Calendar.SECOND));
        System.out.println(singapore.getTimeZone().getID());

        System.out.println("---------------------------------------");
        System.out.println("Some other Methods-----");
        System.out.println(tokyo.getDisplayName());
        System.out.println(tokyo.getRawOffset());
        System.out.println(tokyo.getID());


    }
}
