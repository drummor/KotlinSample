package com.example.kotlinsample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //1.这样写会报错，因为kotlin不允许为空的变量出现
    //var view:View
    //2.这样也不行 因为默认情况下空安全，也就是变量不能为空
    // var view :View = null
    //3.排除空安全
    var view: View? = null
    //4lateinit表示保证不为空稍后初始化
    lateinit var textView: TextView

    //表示tv这个属性可以为空
    var tv: TextView? = null

    //类型推断不必要生命变量的参数
    var str = ""

    val name = ""
        get() = field + "sdsfs"


    override fun onCreate(savedInstanceState: Bundle?) {
        //view?.setBackgroundColor(Color.RED)//“？.”当为空的时候就不执行了
        view!!.setBackgroundColor(Color.RED)//告诉编译器我这个一定不为空 就变成了跟java一样
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.tv)
        lateinit var justVarDemo: String
    }

    fun printViewID(view: View?) {
        var viewID = view?.id;//类型推断
        println(viewID)//顶层函数
    }
}
