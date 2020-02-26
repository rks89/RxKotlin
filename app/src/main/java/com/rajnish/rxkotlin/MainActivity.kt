 package com.rajnish.rxkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit

 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val seconds = Observable.interval(1, TimeUnit.SECONDS)
        //val disposable = seconds.subscribe { l -> DisposableTester1.logData(l) }

        //DisposableTester2.myObserver.onSubscribe(disposable)
        //DisposableTester2.myObserver.onNext()
        //disposable.dispose()
        //DisposableTester2.myObserver.


        CompositeDisposable1.main()
    }
     private fun logData(l: Long, i: Int) {
         Log.d("Test","Received: " + l)
     }
}
