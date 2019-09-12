package other;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OtherTest {

    @Test
    public void testDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
        System.out.println(df.format(new Date()));

    }
}
