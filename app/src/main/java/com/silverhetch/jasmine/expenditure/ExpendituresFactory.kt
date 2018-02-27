package com.silverhetch.jasmine.expenditure

/**
 * Created by mikes on 2/26/2018.
 */
class ExpendituresFactory {
    companion object {
        private val INSTANCE: Expenditures = MemoryExpenditures()
    }

    fun instance(): Expenditures {
        return INSTANCE
    }
}