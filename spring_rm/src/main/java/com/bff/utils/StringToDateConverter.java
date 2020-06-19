package com.bff.utils;



import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转换为日期
 */
public class StringToDateConverter implements Converter<String, Date> {


    /**
     *
     * @param s 传递进来的参数
     * @return
     */
    @Override
    public Date convert(String s) {
        if(s == null){
            throw new RuntimeException("请你传递数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //把字符串转换日期
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换出错");
        }

    }
}
