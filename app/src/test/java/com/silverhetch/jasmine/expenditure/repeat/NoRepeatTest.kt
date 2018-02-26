package com.silverhetch.jasmine.expenditure.repeat

import org.junit.Assert
import org.junit.Test

/**
 * Created by mikes on 2/26/2018.
 */
class NoRepeatTest{
    @Test
    fun next_none(){
        Assert.assertFalse(NoRepeat().forward().hasNext())
    }
    @Test
    fun previous_none(){
        Assert.assertFalse(NoRepeat().backward().hasNext())
    }
}