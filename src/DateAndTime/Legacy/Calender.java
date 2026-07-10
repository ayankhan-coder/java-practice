/*util.Calendar usually refers to java.util.Calendar, a class in Java
used to represent and manipulate dates and times. Before Java 8, it was the standard API
for date/time operations,but today it's largely replaced by the newer java.time API.
 */

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

        System.out.println(cal.getTime());
        cal.roll(Calendar.MONTH,1);  //Roll Method change only specific field
        cal.roll(Calendar.YEAR,5);
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
