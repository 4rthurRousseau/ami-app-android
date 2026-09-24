package fr.gouv.ami.navigation

enum class PromotedUrls(val nameOf: String) {
    WELCOME_NOTIFICATION_ACTIVATION("welcome:notifications:activation"),
    PREFERENCES_NOTIFICATIONS_ACTIVATION("preferences:notifications:activation")
}

val promotedUrls = arrayOf(
    PromotedUrls.WELCOME_NOTIFICATION_ACTIVATION.nameOf,
    PromotedUrls.PREFERENCES_NOTIFICATIONS_ACTIVATION.nameOf
)