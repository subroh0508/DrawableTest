package net.subroh0508.drawabletest

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class FragmentAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            else -> throw IllegalStateException()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            else -> throw IllegalStateException()
        }
    }

    override fun getCount() = 0
}