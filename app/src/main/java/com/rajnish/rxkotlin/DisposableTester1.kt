package com.rajnish.rxkotlin

import android.util.Log
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

object DisposableTester1 {

    @JvmStatic fun main()
    {

        val seconds = Observable.interval(1, TimeUnit.SECONDS)

        val disposable = seconds.subscribe { l -> logData(l) }

        //sleep 10 seconds
        sleep(10000)

        //Dispose and stop emissions
       // disposable.dispose()
       // var result:Boolean=disposable.isDisposed

        Log.d("Test","Disposed!")

        //Log.d("Test","isDisposed! $result")


        //Sleep 10 seconds to prove
        //There are no more emissions
        sleep(10000)
    }
    fun logData(l: Long) {
        Log.d("Test","Received: " + l)
    }

    private fun sleep(millis:Int) {
        try {
            Thread.sleep(millis.toLong())
        }
        catch (e:InterruptedException) {
            e.printStackTrace()
        }
    }

}