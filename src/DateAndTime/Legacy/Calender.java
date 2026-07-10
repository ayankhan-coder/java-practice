package DateAndTime.Legacy;

import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();//GregorianCalendar
        cal.set(Calendar.YEAR,2030);   //Set Methods change the year,date etc.
        cal.set(Calendar.DATE,25);
        cal.set(Calendar.MONTH,Calendar.FEBRUARY);

        cal.add(Calendar.MONTH,1);   // Add Method add extra value, More powerful than SetMethod
        cal.add(Calendar.YEAR,4);
        System.out.println(cal.getTime());

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("______________________");
        System.out.println(cal.getTime());

    }
}
