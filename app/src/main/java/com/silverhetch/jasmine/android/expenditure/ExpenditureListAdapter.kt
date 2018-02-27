package com.silverhetch.jasmine.android.expenditure

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.silverhetch.jasmine.R
import com.silverhetch.jasmine.databinding.ItemExpenditureBinding
import com.silverhetch.jasmine.expenditure.Expenditure
import com.silverhetch.util.view.ViewHolder

/**
 * Created by mikes on 2/27/2018.
 */

class ExpenditureListAdapter(val expenditure: List<Expenditure>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val binding = DataBindingUtil.inflate<ItemExpenditureBinding>(LayoutInflater.from(parent?.context), R.layout.item_expenditure, parent, false)
        return ViewHolder(binding.root)
    }

    override fun getItemCount(): Int = expenditure.count()


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.getTextView(R.id.itemExpenditure_title)?.setText(expenditure[position].title())
    }

}