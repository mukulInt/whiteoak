package com.whiteoakindia.whiteoak.common.utils;

import com.whiteoakindia.whiteoak.contact.enums.DateFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatUtils {


    public static String getDateInFrontEndFormat(LocalDateTime dateTime){

        return dateTime.format(DateTimeFormatter.ofPattern(DateFormat.FRONT_END.getValue())).toUpperCase();
    }
}
