package jp.techacademy.marika.kotlinlog

import android.util.Log

 abstract class Animal {
    //プロパティ
    var name:String
    var age:Int

    //引数付きインストラクタ
    constructor(name:String,age:Int){
        this.name=name
        this.age=age
    }
     abstract fun say()
}

