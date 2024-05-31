package com.example.m3l20_beastie;

import com.example.m3l20_beastie.entity.Car;
import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public static void main(String[] args) {

        Car car = new Car(1L, "BMW", "7 series");
        System.out.println(car);

        String line1 = "Yura"; //
        String line2 = new String("Yura1111111");
        String line3 = "We don't need no education";
        String line4 = "We don't need no education";
        String line5 = null;
        String line6 = " ";

//        System.out.println(StringUtils.equals(line1, line2));
        String difference = StringUtils.difference(line1, line2);
        System.out.println(difference);
        System.out.println(StringUtils.abbreviate(line3, 10)); // УМЕСТИТЬ В 6 ЗНАКОВ
        System.out.println(StringUtils.center(line3, 100)); // НАПРИМЕР ДЛЯ ПЕЧАТИ ЧЕКОВ
        System.out.println(StringUtils.chop(line1)); // СРЕЗАЕТ ПОСЛЕДНИЙ ЗНАК
        System.out.println(StringUtils.countMatches(line3, "ee"));
        System.out.println(StringUtils.left(line3, 6));
        System.out.println(StringUtils.right(line3, 6));
        System.out.println(StringUtils.rotate(line3, -26)); // ПРОВЕРНУТЬ СТРОКУ

        System.out.println(line6.isEmpty());
        System.out.println(line6.isBlank());

        System.out.println(StringUtils.isEmpty(line6));

        System.out.println(StringUtils.replaceEach(line3, new String[]{"e", "d"}, new String[]{"!", "+"}));

    }
}
