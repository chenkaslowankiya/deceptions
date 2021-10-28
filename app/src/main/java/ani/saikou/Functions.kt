package ani.saikou

import android.view.View
import android.view.Window
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import android.view.ViewGroup.MarginLayoutParams

const val buildDebug = true

fun logger(e:Any){
    if(buildDebug)
        println(e)
}

fun initActivity(window:Window,view:View?=null){
    WindowCompat.setDecorFitsSystemWindows(window, false)
    if (view!=null)
        viewInset(view)
}

fun viewInset(view:View){
    ViewCompat.setOnApplyWindowInsetsListener(view) { v, windowInsets ->
        val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.updateLayoutParams<MarginLayoutParams> {
            topMargin = insets.top
            leftMargin = insets.left
            rightMargin = insets.right
            bottomMargin = insets.bottom
        }
        WindowInsetsCompat.CONSUMED
    }
}