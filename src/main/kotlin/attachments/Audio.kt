package ru.netology.attachments

import java.time.LocalDateTime

class AudioAttachment(val audio: Audio) : Attachment() {
    override val type = AttachmentTypes.AUDIO
}

class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String = "",
    val duration: Int,
    val url: String,
    val date: LocalDateTime = LocalDateTime.now()
) {


}