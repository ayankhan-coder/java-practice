package DateTime;/*Legacy/old Date and Time API refers to the original date/time classes that existed
before Java 8. These classes are still available for backward compatibility, but they
have several design problems, which is why Java 8 introduced the java.time API.
 */

import java.util.Date;

public class OldDateAndTime {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d);

        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getSeconds());




    }
}
