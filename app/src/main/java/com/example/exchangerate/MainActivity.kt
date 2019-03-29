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

    var currentDate: String = ""

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
                    currentDate = reBuild(result.date)
                    date.text = currentDate
                },
                { error -> print("error") }
            )

        RateLayout.setOnClickListener {
            val intent = Intent(this, RateActivity::class.java)
            intent.putExtra("date", currentDate)
            startActivity(intent)
        }
    }

    private fun reBuild(date: String): String {
        val s = date.split("-")
        return "$s[1].$s[0].$s[2]"
    }
}
