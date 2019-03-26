package com.example.exchangerate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rate.*

class RateActivity : AppCompatActivity() {

//    var reAdapter:


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rate)

        rateRecyclerView.setLayoutManager(LinearLayoutManager(this));

        var rates: List<RateModel> = listOf(
            RateModel("dallaar", "asdf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("aaa", "asdjjhhf", 1.1, true, 0, 12.22, false),
            RateModel("eeeeee", "sdfaer", 1.1, true, 0, 12.22, false)
        )
        var adapter = DataAdapter(this, rates)
        rateRecyclerView.adapter = adapter
        print("here")
    }
}