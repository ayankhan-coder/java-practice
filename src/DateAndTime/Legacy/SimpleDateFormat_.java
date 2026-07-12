package DateAndTime.Legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class SimpleDateFormat_ {
    public static void main(String[] args) {
        java.util.Date d = new java.util.Date();

        SimpleDateFormat sf1 = new SimpleDateFormat();
        System.out.println(sf1.format(d));      // Format Method

        SimpleDateFormat sf2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sf2.format(d));

        SimpleDateFormat sf3 = new SimpleDateFormat("dd/MMM/yyy, hh:mm a");
        System.out.println(sf3.format(new Date()));

        SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
        System.out.println(sf.format(d));

        SimpleDateFormat sf4 = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(sf4.format(d));

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sf5 = new SimpleDateFormat("EEE dd-MMM-yyyy, hh:mm a");
        System.out.println(cal.getTime());
        System.out.println(sf5.format(cal.getTime()));

//----------------------------------------------------------------------------------------
        Date da = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = "10/12/2030";
        try {

            System.out.println(sdf.parse(date));    // Parse Method
        }catch (ParseException e){
            System.out.println(e);
        }

        System.out.println("----------------------");
        Calendar calendar = Calendar.getInstance();
        String dat = "20/05/2055";
        try {
            System.out.println(sdf.parse(dat));
        }catch (ParseException e){
            System.out.println(e);
        }
//------------------------------------------------------------------------------------

    }
}
