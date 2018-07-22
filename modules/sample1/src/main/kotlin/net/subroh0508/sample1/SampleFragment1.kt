package net.subroh0508.sample1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sample_1.*


class SampleFragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_sample_1, container, false)

    override fun onResume() {
        super.onResume()

        circle.setOnClickListener {  }
        roundRectangle.setOnClickListener {  }
        roundRectangleWhite.setOnClickListener {  }

        circlePreLollipop.setOnClickListener {  }
        roundRectanglePreLollipop.setOnClickListener { }
        roundRectangleWhitePreLollipop.setOnClickListener {  }

        clear.setOnClickListener { radioGroup.clearCheck() }

        activated.setOnCheckedChangeListener { _, isChecked -> onActivated(isChecked) }
        selected.setOnCheckedChangeListener { _, isChecked -> onSelected(isChecked) }
        disabled.setOnCheckedChangeListener { _, isChecked -> onDisabled(isChecked) }
        hovered.setOnCheckedChangeListener { _, isChecked -> onHovered(isChecked) }
    }

    private fun onActivated(activated: Boolean = true) {
        circle.isActivated = activated
        roundRectangle.isActivated = activated
        roundRectangleWhite.isActivated = activated

        circlePreLollipop.isActivated = activated
        roundRectanglePreLollipop.isActivated = activated
        roundRectangleWhitePreLollipop.isActivated = activated

        Log.d("---onActivated---", activated.toString())
        Log.d("activated", circle.isActivated.toString())
        Log.d("selected", circle.isSelected.toString())
        Log.d("enabled", circle.isEnabled.toString())
        Log.d("hovered", circle.isHovered.toString())
    }

    private fun onSelected(selected: Boolean = true) {
        circle.isSelected = selected
        roundRectangle.isSelected = selected
        roundRectangleWhite.isSelected = selected

        circlePreLollipop.isSelected = selected
        roundRectanglePreLollipop.isSelected = selected
        roundRectangleWhitePreLollipop.isSelected = selected

        Log.d("---onSelected---", selected.toString())
        Log.d("activated", circle.isActivated.toString())
        Log.d("selected", circle.isSelected.toString())
        Log.d("enabled", circle.isEnabled.toString())
        Log.d("hovered", circle.isHovered.toString())
    }

    private fun onDisabled(disabled: Boolean = true) {
        circle.isEnabled = !disabled
        roundRectangle.isEnabled = !disabled
        roundRectangleWhite.isEnabled = !disabled

        circlePreLollipop.isEnabled = !disabled
        roundRectanglePreLollipop.isEnabled = !disabled
        roundRectangleWhitePreLollipop.isEnabled = !disabled

        Log.d("---onDisabled---", disabled.toString())
        Log.d("activated", circle.isActivated.toString())
        Log.d("selected", circle.isSelected.toString())
        Log.d("enabled", circle.isEnabled.toString())
        Log.d("hovered", circle.isHovered.toString())
    }

    private fun onHovered(hovered: Boolean = true) {
        circle.isHovered = hovered
        roundRectangle.isHovered = hovered
        roundRectangleWhite.isHovered = hovered

        circlePreLollipop.isHovered = hovered
        roundRectanglePreLollipop.isHovered = hovered
        roundRectangleWhitePreLollipop.isHovered = hovered

        Log.d("---onHovered---", hovered.toString())
        Log.d("activated", circle.isActivated.toString())
        Log.d("selected", circle.isSelected.toString())
        Log.d("enabled", circle.isEnabled.toString())
        Log.d("hovered", circle.isHovered.toString())
    }
}