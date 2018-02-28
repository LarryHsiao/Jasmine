package com.silverhetch.jasmine.android.expenditure

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.silverhetch.jasmine.R
import com.silverhetch.jasmine.databinding.ItemExpenditureBinding
import com.silverhetch.jasmine.expenditure.Expenditure
import com.silverhetch.util.view.DataBindingViewHolder

/**
 * Created by mikes on 2/27/2018.
 */

class ExpenditureListAdapter(private val expenditures: List<Expenditure>) : RecyclerView.Adapter<DataBindingViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DataBindingViewHolder {
        val binding = DataBindingUtil.inflate<ItemExpenditureBinding>(LayoutInflater.from(parent?.context), R.layout.item_expenditure, parent, false)
        return DataBindingViewHolder(binding.root, binding)
    }

    override fun getItemCount(): Int = expenditures.count()

    override fun onBindViewHolder(holder: DataBindingViewHolder?, position: Int) {
        holder?.getViewDataBinding<ItemExpenditureBinding>()?.expenditure = expenditures[position]
    }
}