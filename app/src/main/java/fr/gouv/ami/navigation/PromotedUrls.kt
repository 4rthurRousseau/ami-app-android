package fr.gouv.ami.navigation

enum class PromotedUrls(val alias: String) {
    WELCOME_NOTIFICATION_ACTIVATION("welcome:notifications:activation"),
    PREFERENCES_NOTIFICATIONS_ACTIVATION("preferences:notifications:activation");

    companion object {
        fun from(value: String): PromotedUrls? =
            entries.firstOrNull { it.alias == value }
    }
}

val promotedUrls = arrayOf(
    //The onboarding screen cannot be promoted until multi-webview support is implemented
    //PromotedUrls.WELCOME_NOTIFICATION_ACTIVATION.alias,
    PromotedUrls.PREFERENCES_NOTIFICATIONS_ACTIVATION.alias
)