package com.trazi.githubretrofit.ui.details

import android.util.Log
import com.trazi.githubretrofit.model.GitHubAccountResponse
import com.trazi.githubretrofit.repository.Repository
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class DetailsPresenter(
    private val repository: Repository,
    val view: DetailsView
) {
    fun getAccountDetails(accountId: String) {
        repository.getAccountDetails(accountId).enqueue(object : Callback<GitHubAccountResponse> {
            override fun onResponse(
                call: Call<GitHubAccountResponse>,
                response: Response<GitHubAccountResponse>
            ) {
                Log.d("TAG", response.body()!!.toString())
                view.showAccountDetails(response.body()!!)
            }

            override fun onFailure(call: Call<GitHubAccountResponse>, t: Throwable) {
                // fail
            }
        })
    }
}