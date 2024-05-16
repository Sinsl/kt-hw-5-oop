package ru.netology.attachments

import java.time.LocalDateTime

class VideoAttachment(val video: Video) : Attachment() {
    override val type = AttachmentTypes.VIDEO
}

class Video(
    val id: Int,
    val ownerId: Int,
    val title: String = "",
    val duration: Int,
    val url: String,
    val date: LocalDateTime = LocalDateTime.now()
) {


}
