package com.silverhetch.jasmine.android.expenditure

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.google.common.collect.Lists
import com.silverhetch.jasmine.expenditure.Expenditure
import com.silverhetch.jasmine.expenditure.Expenditures
import com.silverhetch.jasmine.expenditure.ExpendituresFactory

/**
 * Created by mikes on 2/27/2018.
 */
class ExpenditureListViewModel : ViewModel() {
    private val list = MutableLiveData<List<Expenditure>>()
    private val expenditures: Expenditures = ExpendituresFactory().instance()

    init {
        list.value = Lists.newArrayList(expenditures.all())
    }

    fun list(): LiveData<List<Expenditure>> {
        list.value = Lists.newArrayList(expenditures.all())
        return list
    }
}