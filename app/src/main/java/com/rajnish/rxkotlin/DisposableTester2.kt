package com.rajnish.rxkotlin

import android.util.Log
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

object DisposableTester2 {

    var myObserver:Observer<Int> = object:Observer<Int>{

        private var disposable:Disposable? = null
        override fun onComplete() {
            Log.d("Test","onComplete:" )
        }

        override fun onSubscribe(disposable: Disposable) {

            this.disposable = disposable

            Log.d("Test","onSubscribe:" )

        }

        override fun onNext(t: Int) {

            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onError(e: Throwable) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }
}