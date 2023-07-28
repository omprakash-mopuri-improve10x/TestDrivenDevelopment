package omprakash.tdd.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDate {

    public static String getDisplayDate(long timeStampInMillis) {
        Date date = new Date(timeStampInMillis);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");
        return simpleDateFormat.format(date);
    }

    public class InvalidTimestampException extends Exception {
    }
}
