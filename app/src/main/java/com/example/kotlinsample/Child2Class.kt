package com.example.kotlinsample

class Child2Class :ChildClass(){
    override fun superAbastractFun(): UInt {
        var i = 1
        print(i)
        return super.superAbastractFun()
    }

    override fun onCreate() {
        super.onCreate()
    }
}