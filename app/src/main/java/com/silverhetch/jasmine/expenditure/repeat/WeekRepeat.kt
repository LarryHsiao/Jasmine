package com.silverhetch.jasmine.expenditure.repeat

import java.util.*

/**
 * Created by mikes on 2/26/2018.
 */
class WeekRepeat(val startDate: Calendar = Calendar.getInstance()) : Repeat {
    override fun forward(): Iterator<Calendar> = object : Iterator<Calendar> {
        val current = Calendar.getInstance()

        init {
            current.time = startDate.time
        }

        override fun hasNext(): Boolean = true

        override fun next(): Calendar {
            current.add(Calendar.WEEK_OF_YEAR, 1)
            val output = Calendar.getInstance()
            output.time = current.time;
            return output
        }
    }

    override fun backward(): Iterator<Calendar> = object : Iterator<Calendar> {
        val current = Calendar.getInstance()

        init {
            current.time = startDate.time
        }

        override fun hasNext(): Boolean = true

        override fun next(): Calendar {
            current.add(Calendar.WEEK_OF_YEAR, -1)
            val output = Calendar.getInstance()
            output.time = current.time
            return output
        }
    }
}