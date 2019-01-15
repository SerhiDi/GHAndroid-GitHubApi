package com.trazi.githubretrofit.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.trazi.githubretrofit.R
import com.trazi.githubretrofit.utils.Account
import com.trazi.githubretrofit.utils.Constants
import kotlinx.android.synthetic.main.account_item.view.*

class AccountAdapter : RecyclerView.Adapter<AccountAdapter.AccountViewHolder>() {

    private val accountsList: Array<Account> = Constants.ACCOUNTS_LIST

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.account_item, parent, false)
        return AccountViewHolder(view)
    }

    override fun getItemCount(): Int = accountsList.size

    override fun onBindViewHolder(holder: AccountViewHolder, position: Int) {
        holder.itemView.account_id.text = accountsList[position].id
        holder.itemView.account_name.text = accountsList[position].name
    }

    inner class AccountViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

}