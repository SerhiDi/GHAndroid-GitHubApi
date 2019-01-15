package com.trazi.githubretrofit.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.trazi.githubretrofit.R
import com.trazi.githubretrofit.adapters.AccountAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val accountAdapter: AccountAdapter by lazy {
        AccountAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAccountsList()
    }

    fun initAccountsList() {
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = accountAdapter
    }

}
