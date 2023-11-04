
package datetimedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        Date d=new Date();
        //SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");
        String str=sdf.format(d);
        
        System.out.println(str);
    }
}
    
