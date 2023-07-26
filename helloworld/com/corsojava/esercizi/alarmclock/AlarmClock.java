package com.corsojava.esercizi.alarmclock;

public class AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (AlarmClock.isWeekend(day)) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (isWeekend(day)) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    static boolean isWeekend(int day) {
        return day == 0 || day == 6;
    }

    public static void main(String[] args) {
        System.out.println(alarmClock(1, false)); // -> "7:00"
    }
}