package com.silverhetch.jasmine.android.expenditure

import android.arch.lifecycle.ViewModel
import com.silverhetch.jasmine.expenditure.ExpendituresFactory

/**
 * Created by mikes on 2/27/2018.
 */
class ExpenditureCreateViewModel : ViewModel() {
    val model = ExpendituresFactory().instance()

    fun createExpenditure(title: String, amount: Int) {
        model.add(title, amount)
    }
}