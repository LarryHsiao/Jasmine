package com.silverhetch.jasmine.android.expenditure

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.google.common.collect.Lists
import com.silverhetch.jasmine.expenditure.Expenditure
import com.silverhetch.jasmine.expenditure.ExpendituresFactory

/**
 * Created by mikes on 2/27/2018.
 */
class ExpenditureListViewModel : ViewModel() {
    val list = MutableLiveData<List<Expenditure>>()

    init {
        val expenditures = ExpendituresFactory().instance()
        list.value = Lists.newArrayList(expenditures.all())
    }

}