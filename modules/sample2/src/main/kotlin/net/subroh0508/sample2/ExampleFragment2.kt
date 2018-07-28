package net.subroh0508.sample2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sample_2.*


class ExampleFragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_sample_2, container, false)

    override fun onResume() {
        super.onResume()

        circleInfo.setOnClickListener {  }
        roundRectangleInfo.setOnClickListener {  }
        circleInfoOverlay.setOnClickListener {  }
        roundRectangleInfoOverlay.setOnClickListener {  }

        circleWarning.setOnClickListener {  }
        roundRectangleWarning.setOnClickListener {  }
        circleWarningOverlay.setOnClickListener {  }
        roundRectangleWarningOverlay.setOnClickListener {  }

        circleCaution.setOnClickListener {  }
        roundRectangleCaution.setOnClickListener {  }
        circleCautionOverlay.setOnClickListener {  }
        roundRectangleCautionOverlay.setOnClickListener {  }

        clear.setOnClickListener { radioGroup.clearCheck() }

        activated.setOnCheckedChangeListener { _, isChecked -> onActivated(isChecked) }
        selected.setOnCheckedChangeListener { _, isChecked -> onSelected(isChecked) }
        disabled.setOnCheckedChangeListener { _, isChecked -> onDisabled(isChecked) }
        hovered.setOnCheckedChangeListener { _, isChecked -> onHovered(isChecked) }
    }

    private fun onActivated(activated: Boolean = true) {
        circleInfo.isActivated = activated
        roundRectangleInfo.isActivated = activated
        circleInfoOverlay.isActivated = activated
        roundRectangleInfoOverlay.isActivated = activated

        circleWarning.isActivated = activated
        roundRectangleWarning.isActivated = activated
        circleWarningOverlay.isActivated = activated
        roundRectangleWarningOverlay.isActivated = activated

        circleCaution.isActivated = activated
        roundRectangleCaution.isActivated = activated
        circleCautionOverlay.isActivated = activated
        roundRectangleCautionOverlay.isActivated = activated

        Log.d("---onActivated---", activated.toString())
        Log.d("activated", circleInfo.isActivated.toString())
        Log.d("selected", circleInfo.isSelected.toString())
        Log.d("enabled", circleInfo.isEnabled.toString())
        Log.d("hovered", circleInfo.isHovered.toString())
    }

    private fun onSelected(selected: Boolean = true) {
        circleInfo.isSelected = selected
        roundRectangleInfo.isSelected = selected
        circleInfoOverlay.isSelected = selected
        roundRectangleInfoOverlay.isSelected = selected

        circleWarning.isSelected = selected
        roundRectangleWarning.isSelected = selected
        circleWarningOverlay.isSelected = selected
        roundRectangleWarningOverlay.isSelected = selected

        circleCaution.isSelected = selected
        roundRectangleCaution.isSelected = selected
        circleCautionOverlay.isSelected = selected
        roundRectangleCautionOverlay.isSelected = selected

        Log.d("---onSelected---", selected.toString())
        Log.d("activated", circleInfo.isActivated.toString())
        Log.d("selected", circleInfo.isSelected.toString())
        Log.d("enabled", circleInfo.isEnabled.toString())
        Log.d("hovered", circleInfo.isHovered.toString())
    }

    private fun onDisabled(disabled: Boolean = true) {
        circleInfo.isEnabled = !disabled
        roundRectangleInfo.isEnabled = !disabled
        circleInfoOverlay.isEnabled = !disabled
        roundRectangleInfoOverlay.isEnabled = !disabled

        circleWarning.isEnabled = !disabled
        roundRectangleWarning.isEnabled = !disabled
        circleWarningOverlay.isEnabled = !disabled
        roundRectangleWarningOverlay.isEnabled = !disabled

        circleCaution.isEnabled = !disabled
        roundRectangleCaution.isEnabled = !disabled
        circleCautionOverlay.isEnabled = !disabled
        roundRectangleCautionOverlay.isEnabled = !disabled

        Log.d("---onDisabled---", disabled.toString())
        Log.d("activated", circleInfo.isActivated.toString())
        Log.d("selected", circleInfo.isSelected.toString())
        Log.d("enabled", circleInfo.isEnabled.toString())
        Log.d("hovered", circleInfo.isHovered.toString())
    }

    private fun onHovered(hovered: Boolean = true) {
        circleInfo.isHovered = hovered
        roundRectangleInfo.isHovered = hovered
        circleInfoOverlay.isHovered = hovered
        roundRectangleInfoOverlay.isHovered = hovered

        circleWarning.isHovered = hovered
        roundRectangleWarning.isHovered = hovered
        circleWarningOverlay.isHovered = hovered
        roundRectangleWarningOverlay.isHovered = hovered

        circleCaution.isHovered = hovered
        roundRectangleCaution.isHovered = hovered
        circleCautionOverlay.isHovered = hovered
        roundRectangleCautionOverlay.isHovered = hovered


        Log.d("---onHovered---", hovered.toString())
        Log.d("activated", circleInfo.isActivated.toString())
        Log.d("selected", circleInfo.isSelected.toString())
        Log.d("enabled", circleInfo.isEnabled.toString())
        Log.d("hovered", circleInfo.isHovered.toString())
    }
}