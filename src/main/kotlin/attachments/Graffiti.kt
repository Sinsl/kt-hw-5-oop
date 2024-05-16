package ru.netology.attachments

import java.time.LocalDateTime

class GraffitiAttachment(val graffiti: Graffiti) : Attachment() {
    override val type = AttachmentTypes.GRAFFITI
}

class Graffiti(
    val id: Int,
    val ownerId: Int,
    val width: Int,
    val height: Int,
    val url: String,
    val date: LocalDateTime = LocalDateTime.now()
) {


}
