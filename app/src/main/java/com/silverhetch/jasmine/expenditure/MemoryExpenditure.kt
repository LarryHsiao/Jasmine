package com.silverhetch.jasmine.expenditure

import com.silverhetch.jasmine.expenditure.repeat.Repeat

/**
 * Created by mikes on 2/26/2018.
 */

class MemoryExpenditure(val database: ArrayList<Expenditure>, val title: String, val amount: Int, val repeat: Repeat) : Expenditure {
    override fun delete() {
        database.remove(this)
    }

    override fun title(): String = title

    override fun amount(): Int = amount

    override fun repeat(): Repeat = repeat

}