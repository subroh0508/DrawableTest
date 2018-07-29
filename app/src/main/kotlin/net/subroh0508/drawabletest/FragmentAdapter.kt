package net.subroh0508.drawabletest

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import net.subroh0508.sample1.ExampleFragment1
import net.subroh0508.sample2.ExampleFragment2
import net.subroh0508.sample3.ExampleFragment3

class FragmentAdapter(private val context: Context, manager: FragmentManager) : FragmentPagerAdapter(manager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ExampleFragment1()
            1 -> ExampleFragment2()
            2 -> ExampleFragment3()
            else -> throw IllegalStateException()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> context.getString(R.string.example_fragment_1_title)
            1 -> context.getString(R.string.example_fragment_2_title)
            2 -> context.getString(R.string.example_fragment_3_title)
            else -> throw IllegalStateException()
        }
    }

    override fun getCount() = 3
}