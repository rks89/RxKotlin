package com.rajnish.rxkotlin

import android.util.Log
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit

object CompositeDisposable1 {

    private val disposables = CompositeDisposable()

    @JvmStatic fun main() {
        val seconds = Observable.interval(1, TimeUnit.SECONDS)

        //Subscribe and capture disposables
        val disposable1 = seconds.subscribe { l -> logData(l, 1) }
        val disposable2 = seconds.subscribe { l -> logData(l, 2) }

        //Put both disposables into CompositeDisposable
        disposables.addAll(disposable1, disposable2)

        //Sleep 10 seconds
        sleep(10000)

        //Dispose all disposables
        disposables.dispose()

        Log.d("Test", ("All Disposed!"))

        //Sleep 10 seconds to prove
        //there are no more emissions
        sleep(10000)
    }

    private fun logData(l: Long, observerNumber: Int) {
        Log.d("Test", ("Observer $observerNumber: $l"))
    }

    private fun sleep(millis:Int) {
        try {
            Thread.sleep(millis.toLong())
        } catch (e:InterruptedException) {
            e.printStackTrace()
        }
    }

}
