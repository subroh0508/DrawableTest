package net.subroh0508.drawabletest

import android.os.Build
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

        title = getString(R.string.app_name) + "(API${Build.VERSION.SDK_INT})"

        tab.setupWithViewPager(viewPager)
        viewPager.adapter = adapter
    }
}
