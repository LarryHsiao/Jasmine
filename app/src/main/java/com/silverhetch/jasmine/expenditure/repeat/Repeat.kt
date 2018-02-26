package com.silverhetch.jasmine.expenditure.repeat

import java.util.*

/**
 * Created by mikes on 2/26/2018.
 */
interface Repeat {
    fun forward(): Iterator<Calendar>
    fun backward(): Iterator<Calendar>
}