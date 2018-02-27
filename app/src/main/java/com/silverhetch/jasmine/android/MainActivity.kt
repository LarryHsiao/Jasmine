package com.silverhetch.jasmine.android

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.silverhetch.jasmine.R
import com.silverhetch.jasmine.android.expenditure.ExpenditureListFragment

class MainActivity : AppCompatActivity(), PageControl {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replacePage(ExpenditureListFragment())
    }

    override fun replacePage(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_fragment, fragment)
        transaction.commit()
    }

    override fun nextPage(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_fragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
