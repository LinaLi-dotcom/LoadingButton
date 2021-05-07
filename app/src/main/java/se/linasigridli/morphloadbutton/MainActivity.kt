package se.linasigridli.morphloadbutton

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.simplepass.loadingbutton.customViews.CircularProgressButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: CircularProgressButton = findViewById<Button>(R.id.btn_Download) as CircularProgressButton
        btn.startAnimation()
        //btn.doneLoadingAnimation(fillColor, bitmap);
        btn.revertAnimation()
    }







}