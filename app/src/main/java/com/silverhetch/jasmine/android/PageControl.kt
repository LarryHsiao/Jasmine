package com.silverhetch.jasmine.android

import android.support.v4.app.Fragment

/**
 * Created by mikes on 2/27/2018.
 */
interface PageControl {
    fun replacePage(fragment: Fragment)
    fun nextPage(fragment: Fragment)
}