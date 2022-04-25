package lib.log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExternalLog implements LogService {

    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    public void afterPropertiesSet() {
        System.out.println("[" + dateFormat.format(new Date()) + "] - LOG [External] --- Starting");
    }

}
