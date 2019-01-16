package com.trazi.githubretrofit.model

import com.google.gson.annotations.SerializedName

data class GitHubAccountResponse(
    @SerializedName("name") val name: String,
    @SerializedName("login") val login: String,
    @SerializedName("id") val id: Int,
    @SerializedName("followers") val followers: Int,
    @SerializedName("following") val following: Int,
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("public_repos") val publicRepos: String
)