package com.silverhetch.jasmine.expenditure

import com.silverhetch.jasmine.expenditure.repeat.Repeat

/**
 * Created by mikes on 2/26/2018.
 */
internal class MemoryExpenditures : Expenditures {
    internal val data = ArrayList<Expenditure>()

    override fun all(): Iterable<Expenditure> {
        return data
    }

    override fun add(title: String, amount: Int, repeat: Repeat): Expenditure {
        val expenditure = MemoryExpenditure(data, title, amount, repeat)
        data.add(expenditure)
        return expenditure
    }

    override fun clear() = data.clear()
}

