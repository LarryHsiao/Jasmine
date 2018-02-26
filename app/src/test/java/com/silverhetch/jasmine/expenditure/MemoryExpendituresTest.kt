package com.silverhetch.jasmine.expenditure

import junit.framework.Assert
import org.junit.Before
import org.junit.Test


/**
 * Created by mikes on 2/26/2018.
 */
class MemoryExpendituresTest {
    @Before
    fun setUp() {
        ExpendituresFactory().instance().clear()
    }

    @Test
    fun newExpenditure() {
        val expenditures = ExpendituresFactory().instance()
        val inserted = expenditures.add("Title", 100)
        Assert.assertEquals("Title", inserted.title())
    }

    @Test
    fun allExpenditure() {
        val expenditures = ExpendituresFactory().instance()
        expenditures.add("Title", 100)
        Assert.assertEquals(1, expenditures.all().count())
    }
}