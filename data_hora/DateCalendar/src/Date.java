import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;


public class Date {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        java.util.Date x1 = new java.util.Date();
        java.util.Date x2 = new java.util.Date(System.currentTimeMillis());
        java.util.Date x3 = new java.util.Date(0L);
        java.util.Date x4 = new java.util.Date(1000L * 60L * 60L * 5L);

        java.util.Date y1 = sdf1.parse("25/06/2018");
        java.util.Date y2 = sdf2.parse("25/06/2018 15:42:07");
        java.util.Date y3 = java.util.Date.from(Instant.parse("2018-06-25T15:42:07Z"));


        System.out.println("---------------");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println("---------------");
        System.out.println(sdf2.format(x1));
        System.out.println(sdf2.format(x2));
        System.out.println(sdf2.format(x3));
        System.out.println(sdf2.format(x4));
        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println(sdf2.format(y3));
        System.out.println("---------------");
        System.out.println(sdf3.format(x1));
        System.out.println(sdf3.format(x2));
        System.out.println(sdf3.format(x3));
        System.out.println(sdf3.format(x4));
        System.out.println(sdf3.format(y1));
        System.out.println(sdf3.format(y2));
        System.out.println(sdf3.format(y3));


    }
}