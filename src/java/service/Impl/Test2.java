package service.Impl;

import domain.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
       String str="2018-07-14T16:24:00+08:00";
       str=str.replaceAll("T"," ").split("\\+")[0];

        System.out.println(str);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date=  f.parse(str);
            System.out.println(date);
            System.out.println("ok");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
