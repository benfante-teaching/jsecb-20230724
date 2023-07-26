package com.corsojava.esercizi.alarmclock;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlarmClockTest {
    @Test
    public void testAlarmClockOnWeekDayNoVacation() {
        assertEquals("7:00", AlarmClock.alarmClock(1, false));
    }
    @Test
    public void testAlarmClockOnWeekendNoVacation() {
       assertEquals("10:00", AlarmClock.alarmClock(0, false));
    }
    @Test
    public void testAlarmClockOnVacationWeekend() {
        assertEquals("off", AlarmClock.alarmClock(0, true));
    }

    @Test
    public void testSundayIsInTheWeekend() {
        assertEquals(true, AlarmClock.isWeekend(0));
    }
}