package com.trazi.githubretrofit.repository

import com.trazi.githubretrofit.model.GitHubAccountResponse
import com.trazi.githubretrofit.network.GitHubService
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Repository {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val gitHubService = retrofit.create(GitHubService::class.java)

    fun getAccountDetails(accountId: String): Call<GitHubAccountResponse> {
        return gitHubService.getAccountDetails(accountId)
    }
}