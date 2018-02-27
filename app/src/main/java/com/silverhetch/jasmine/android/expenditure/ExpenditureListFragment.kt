package com.silverhetch.jasmine.android.expenditure

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.silverhetch.jasmine.R
import com.silverhetch.jasmine.android.PageControl
import com.silverhetch.jasmine.databinding.FragmentExpenditureListBinding
import kotlinx.android.synthetic.main.fragment_expenditure_list.*

/**
 * Created by mikes on 2/27/2018.
 */
class ExpenditureListFragment : Fragment() {
    private var model: ExpenditureListViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = ViewModelProviders.of(this).get(ExpenditureListViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentExpenditureListBinding>(inflater, R.layout.fragment_expenditure_list, container, false);
        return binding.root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        expenditureList_listView.adapter = ExpenditureListAdapter(model?.list!!.value!!)
        expenditureList_create.setOnClickListener {
            val activityRef = activity;
            if (activityRef is PageControl) {
                activityRef.nextPage(ExpenditureCreateFragment())
            }
        }
    }
}