package com.silverhetch.jasmine.android.expenditure

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import android.widget.Toast
import com.silverhetch.jasmine.R
import kotlinx.android.synthetic.main.fragment_expenditure_create.*

/**
 * Created by mikes on 2/27/2018.
 */
class ExpenditureCreateFragment : Fragment() {
    private var model: ExpenditureCreateViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        model = ViewModelProviders.of(this).get(ExpenditureCreateViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, R.layout.fragment_expenditure_create, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.confirm, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menuConfirm_confirm -> {
                try {
                    model?.createExpenditure(
                            expenditureCreate_titleEditText.text.toString(),
                            expenditureCreate_amountEditText.text.toString().toInt()
                    )
                } catch (e: Exception) {
                    Toast.makeText(context, R.string.appError_unknown, Toast.LENGTH_SHORT).show()
                }
                fragmentManager.popBackStackImmediate()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}