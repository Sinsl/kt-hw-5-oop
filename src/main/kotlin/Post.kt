package ru.netology

import ru.netology.attachments.Attachment
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
    var attachments: Array<Attachment> = emptyArray<Attachment>(),
    val postType: PostType = PostType.POST,
)
