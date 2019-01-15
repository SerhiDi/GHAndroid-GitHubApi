package com.trazi.githubretrofit.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.trazi.githubretrofit.R
import com.trazi.githubretrofit.adapters.AccountAdapter
import com.trazi.githubretrofit.ui.details.DetailsActivity
import com.trazi.githubretrofit.utils.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AccountAdapter.OnAccountItemClick {

    private val accountAdapter: AccountAdapter by lazy {
        AccountAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAccountsList()
    }

    private fun initAccountsList() {
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = accountAdapter
    }

    override fun onAccountItemClick(accountId: String) {
        openAccountDetails(accountId)
    }

    private fun openAccountDetails(accountId: String) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(Constants.ACCOUNT_ID, accountId)
        startActivity(intent)
    }

}
