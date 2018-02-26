package com.silverhetch.jasmine.expenditure

import com.silverhetch.jasmine.expenditure.repeat.Repeat

/**
 * Created by mikes on 2/26/2018.
 */

interface Expenditure {
    fun delete()
    fun title(): String
    fun amount(): Int
    fun repeat(): Repeat
}