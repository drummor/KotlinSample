package com.example.kotlinsample

open class ChildClass : SuperClass() {
    override fun superAbastractFun(): UInt {
        //继承了
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

     override fun onCreate() {
        super.onCreate()
        print("")
        var mySuper: SuperClass? = null
        //第一个问好表示向下转型有可能转不成功
        //第二个但为空的时候
        (mySuper as? ChildClass)?.childFun()
    }

    open fun childFun(): Unit {
        print("")
    }
}