package TestComponents;


import org.apache.log4j.Logger;

        // Log4j için kullanılan sınıf.
public class Log {
    private static Logger Log = Logger.getLogger(Log.class.getName());

    public static void info (String message) {
        Log.info(message);
    }

}
