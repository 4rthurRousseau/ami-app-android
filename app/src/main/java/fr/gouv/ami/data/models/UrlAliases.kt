package fr.gouv.ami.data.models

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class UrlAliases(
    @SerializedName("pattern")
    val pattern: String,
    @SerializedName("alias")
    val alias: String
)
