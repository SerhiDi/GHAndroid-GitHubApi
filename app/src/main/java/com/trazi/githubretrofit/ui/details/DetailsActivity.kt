package com.trazi.githubretrofit.ui.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment
import com.trazi.githubretrofit.R
import com.trazi.githubretrofit.dialog.LoadingSpinner
import com.trazi.githubretrofit.model.GitHubAccountResponse
import com.trazi.githubretrofit.repository.Repository
import com.trazi.githubretrofit.utils.Constants
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity(), DetailsView {

    val SPINNER_TAG: String = LoadingSpinner::class.java.name

    private val presenter by lazy {
        DetailsPresenter(Repository(), this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        getAccountDetails()
    }

    private fun getAccountDetails() {
        val accountId: String = intent.getStringExtra(Constants.ACCOUNT_ID)
        presenter.getAccountDetails(accountId)
    }

    override fun showAccountDetails(account: GitHubAccountResponse) {
        user_name.text = account.name
        user_login.text = account.login
    }

    override fun showSpinner() {
        LoadingSpinner().show(supportFragmentManager, SPINNER_TAG)
    }

    override fun hideSpinner() {
        val spinner = supportFragmentManager.findFragmentByTag(SPINNER_TAG) as? DialogFragment
        if (spinner !== null) {
            spinner.dismiss()
        }
    }
}
