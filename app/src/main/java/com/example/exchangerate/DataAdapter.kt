package com.example.exchangerate

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlinx.android.synthetic.main.rate_item.view.*


class DataAdapter(context: Context, rates: List<RateModel>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {


    private var inflater: LayoutInflater? = null
    private var rates: List<RateModel>? = null

    init {
        inflater = LayoutInflater.from(context);
        this.rates = rates
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DataAdapter.ViewHolder {
        val view = inflater!!.inflate(R.layout.rate_item, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return rates!!.size;
    }

    override fun onBindViewHolder(p0: DataAdapter.ViewHolder, p1: Int) {
        val rate = rates!!.get(p1)
//        p0.imageView.setImageResource(rate.i)

        p0.nameView.setText(rate.name)
        p0.fullNameView.setText(rate.fullName)
        p0.purchaseView.setText(rate.purchasePrice.toString())
        p0.soldView.setText(rate.soldPrice.toString())

//        p0.fullNameView.setText(rate.dd)
    }


    inner class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
        internal val soldView: TextView
        internal val purchaseView: TextView
        internal val nameView: TextView
        internal val fullNameView: TextView

        internal val rateFlag: ImageView
        internal val imgSale: ImageView
        internal val imgPurchase: ImageView

        init {
            purchaseView = view.textPurchase
            soldView = view.textSale
            nameView = view.rateAbbreviation
            fullNameView = view.rateName

            imgPurchase  = view.imagePurchase
            imgSale=view.imageSale
            rateFlag=view.rateFlag
        }
    }
}