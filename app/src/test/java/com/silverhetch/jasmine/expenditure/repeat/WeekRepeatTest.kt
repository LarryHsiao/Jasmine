package com.silverhetch.jasmine.expenditure.repeat

import junit.framework.Assert
import org.junit.Test
import java.util.*

/**
 * Created by mikes on 2/26/2018.
 */
class WeekRepeatTest {
    @Test
    fun next_check100() {
        val current = Calendar.getInstance()
        val repeat = WeekRepeat(current).forward()
        var repeatedDate = repeat.next()
        for (i in 1..99) {
            repeatedDate = repeat.next()
        }

        current.add(Calendar.WEEK_OF_YEAR, 100)
        Assert.assertEquals(current, repeatedDate)
    }

    @Test
    fun previous_check100() {
        val current = Calendar.getInstance()
        val repeat = WeekRepeat(current).backward()
        var repeatedDate = repeat.next()
        for (i in 1..99) {
            repeatedDate = repeat.next()
        }

        current.add(Calendar.WEEK_OF_YEAR, -100)
        Assert.assertEquals(current, repeatedDate)
    }
}