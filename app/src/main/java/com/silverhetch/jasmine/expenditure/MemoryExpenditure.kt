package com.silverhetch.jasmine.expenditure

import com.silverhetch.jasmine.expenditure.repeat.Repeat

/**
 * Created by mikes on 2/26/2018.
 */

class MemoryExpenditure(private val database: ArrayList<Expenditure>,
                        private val title: String,
                        private val amount: Int,
                        private val repeat: Repeat) : Expenditure {
    override fun delete() {
        database.remove(this)
    }

    override fun title(): String = title

    override fun amount(): Int = amount

    override fun repeat(): Repeat = repeat

}