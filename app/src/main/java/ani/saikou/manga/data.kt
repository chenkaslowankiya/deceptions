package ani.saikou.manga

import ani.saikou.UserMediaStatus

data class Manga (
    val name: String,
    val id: Int,
    var description: String? = null,

    val cover: String,
    var banner: String? = null,

    val ongoing: Boolean,
    val meanScore: Int,

    var totalChapters: Int? = null,

    val userPreferredName: String,
    var userProgress: Int? = null,
    var userStatus: UserMediaStatus? = null,
    var userScore: Int? = null,
)