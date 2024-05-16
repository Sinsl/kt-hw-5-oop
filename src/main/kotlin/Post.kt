package ru.netology

import java.time.LocalDateTime

data class Post(
    val id: Int? = null,
    val date: LocalDateTime = LocalDateTime.now(),
    val ownerId: Int,
    val fromId: Int,
    val text: String?,
    val canPin: Boolean = true,
    val isPinned: Boolean = false,
    val likes: Likes = Likes(),
    val postType: PostType = PostType.POST,
)
