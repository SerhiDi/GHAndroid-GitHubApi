package com.trazi.githubretrofit.ui.details

import com.trazi.githubretrofit.model.GitHubAccountResponse

interface DetailsView {
    fun showAccountDetails(account: GitHubAccountResponse)
}