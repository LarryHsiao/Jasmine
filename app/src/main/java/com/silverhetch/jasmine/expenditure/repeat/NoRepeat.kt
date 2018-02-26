package com.silverhetch.jasmine.expenditure.repeat

import java.util.*

/**
 * Created by mikes on 2/26/2018.
 */
class NoRepeat : Repeat {
    override fun forward(): Iterator<Calendar> {
        return object : Iterator<Calendar> {
            override fun hasNext(): Boolean {
                return false
            }

            override fun next(): Calendar {
                throw RuntimeException("No next repeat of date");
            }
        }
    }

    override fun backward(): Iterator<Calendar> {
        return object : Iterator<Calendar> {
            override fun hasNext(): Boolean {
                return false
            }

            override fun next(): Calendar {
                throw RuntimeException("No next repeat of date");
            }
        }
    }
}