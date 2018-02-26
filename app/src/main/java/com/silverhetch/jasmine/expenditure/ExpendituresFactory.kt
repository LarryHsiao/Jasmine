package com.silverhetch.jasmine.expenditure

/**
 * Created by mikes on 2/26/2018.
 */
class ExpendituresFactory {
    fun instance(): Expenditures = MemoryExpenditures()
}