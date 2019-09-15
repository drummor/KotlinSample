package com.example.kotlinsample

//默认情况下class都为final的也就是不可继承的
open abstract class SuperClass {
    constructor()

    open fun onCreate(): Unit {

    }

    abstract fun superAbastractFun(): UInt
}