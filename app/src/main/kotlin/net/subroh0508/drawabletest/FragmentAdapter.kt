package net.subroh0508.drawabletest

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import net.subroh0508.sample1.ExampleFragment1

class FragmentAdapter(private val context: Context, manager: FragmentManager) : FragmentPagerAdapter(manager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ExampleFragment1()
            else -> throw IllegalStateException()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> context.getString(R.string.example_fragment_1_title)
            else -> throw IllegalStateException()
        }
    }

    override fun getCount() = 1
}