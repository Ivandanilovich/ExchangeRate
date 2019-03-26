package com.example.exchangerate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var disposable: Disposable? = null
    private val service by lazy {
        Service.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        disposable = service.getLatest(getString(R.string.key), "RUB,USD")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { result ->
                    eur.text = result.rates.RUB.toString()
                    usd.text = (result.rates.RUB / result.rates.USD).toString()
                    date.text = result.date
                },
                { error -> print("error") }
            )

        RateLayout.setOnClickListener {
            val intent = Intent(this, RateActivity::class.java)
            startActivity(intent)
        }
    }
}
