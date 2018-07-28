package net.subroh0508.drawabletest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val adapter: FragmentAdapter by lazy { FragmentAdapter(this, supportFragmentManager) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        tab.setupWithViewPager(viewPager)
        viewPager.adapter = adapter
    }
}
