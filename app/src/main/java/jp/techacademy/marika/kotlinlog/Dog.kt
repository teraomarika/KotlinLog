package jp.techacademy.marika.kotlinlog

import android.util.Log

open class Dog :Movable{
    //プロパティ
    var name :String
    var age: Int

    //引数付きコンストラクタ
    constructor(name:String,age:Int){
        this.name = name
        this.age=age
    }
    //メソッド
   open fun say (){
        Log.d("kotlintest",this.name+"("+this.age+"歳)"+"『ワンワン』")
   }
//movableインターフェイスのメソッドをオーバーライド
     override fun move (){
    Log.d("kotlintest",this.name +"("+this.age+"歳）"+"は全力で走った" )
}
}