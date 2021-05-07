package se.linasigridli.morphloadbutton

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import br.com.simplepass.loadingbutton.animatedDrawables.ProgressType
import br.com.simplepass.loadingbutton.customViews.ProgressButton
import br.com.simplepass.loadingbutton.presentation.State

open class CircularProgressButton(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
    override var drawableBackground: Drawable,
    override var finalCorner: Float = 0F,
    override val finalHeight: Int,
    override val finalWidth: Int,
    override var initialCorner: Float ,
    override var paddingProgress: Float,
    override var progressType: ProgressType,
    override var spinningBarColor: Int,
    override var spinningBarWidth: Float
) : AppCompatButton(context, attrs, defStyleAttr), ProgressButton {




    override fun doneLoadingAnimation(fillColor: Int, bitmap: Bitmap) {
        TODO("Not yet implemented")
    }

    override fun drawDoneAnimation(canvas: Canvas) {
        TODO("Not yet implemented")
    }

    override fun drawProgress(canvas: Canvas) {
        TODO("Not yet implemented")
    }

    override fun getState(): State {
        TODO("Not yet implemented")
    }

    override fun hideInitialState() {
        TODO("Not yet implemented")
    }

    override fun initRevealAnimation(fillColor: Int, bitmap: Bitmap) {
        TODO("Not yet implemented")
    }

    override fun recoverInitialState() {
        TODO("Not yet implemented")
    }

    override fun revertAnimation(onAnimationEndListener: () -> Unit) {
        TODO("Not yet implemented")
    }

    override fun saveInitialState() {
        TODO("Not yet implemented")
    }

    override fun setProgress(value: Float) {
        TODO("Not yet implemented")
    }

    override fun startAnimation(onAnimationEndListener: () -> Unit) {
        TODO("Not yet implemented")
    }

    override fun startMorphAnimation() {
        TODO("Not yet implemented")
    }

    override fun startMorphRevertAnimation() {
        TODO("Not yet implemented")
    }

    override fun startRevealAnimation() {
        TODO("Not yet implemented")
    }

    override fun stopAnimation() {
        TODO("Not yet implemented")
    }

    override fun stopMorphAnimation() {
        TODO("Not yet implemented")
    }

    override fun stopProgressAnimation() {
        TODO("Not yet implemented")
    }

}