package com.trazi.githubretrofit.network

import com.trazi.githubretrofit.model.GitHubAccountResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}")
    fun getAccountDetails(
        @Path("user") user: String
    ): Call<GitHubAccountResponse>
}