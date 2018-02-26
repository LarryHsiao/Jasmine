package com.silverhetch.jasmine.expenditure

import com.silverhetch.jasmine.expenditure.repeat.NoRepeat
import com.silverhetch.jasmine.expenditure.repeat.Repeat

/**
 * Created by mikes on 2/25/2018.
 */

interface Expenditures {
    fun all(): Iterable<Expenditure>
    fun add(title: String, amount: Int, repeat: Repeat = NoRepeat()): Expenditure
    fun clear()
}