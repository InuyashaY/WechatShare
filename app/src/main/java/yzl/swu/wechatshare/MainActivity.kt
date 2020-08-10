package yzl.swu.wechatshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = intent.data?.schemeSpecificPart

        shareBtn.setOnClickListener{
            setResult(1, Intent().putExtra("sharedResult","Wechat分享完成"))
            finish()
        }
    }
}