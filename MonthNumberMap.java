package com.company;

import java.util.HashMap;
import java.util.Map;

public class MonthNumberMap {

    public static int MonthNumber(String month) {
        Map<String, Integer> map = new HashMap<>();
        map.put("январь", 1);
        map.put("февраль", 2);
        map.put("март", 3);
        map.put("апрель", 4);
        map.put("май", 5);
        map.put("июнь", 6);
        map.put("июль", 7);
        map.put("август", 8);
        map.put("сентябрь", 9);
        map.put("октябрь", 10);
        map.put("ноябрь", 11);
        map.put("декабрь", 12);

        month = month.toLowerCase();
        int a = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (month.equals(entry.getKey())) {
                a = entry.getValue();

            }
        }
        return a;

    }
}

