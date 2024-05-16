package ru.netology.attachments

import java.time.LocalDateTime

class PhotoAttachment(val photo: Photo) : Attachment() {
    override val type = AttachmentTypes.PHOTO
}

class Photo(
    val id: Int,
    val ownerId: Int,
    val urlPhoto130: String,
    val urlPhoto604: String,
    val date: LocalDateTime = LocalDateTime.now()
) {


}
