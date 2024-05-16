package ru.netology.attachments

import java.time.LocalDateTime

class GeoAttachment(val geo: Geo) : Attachment() {
    override val type = AttachmentTypes.GEO
}

class Geo(
    val id: Int,
    val latitude: Int,
    val longitude: Int,
    val title: String = "",
    val date: LocalDateTime = LocalDateTime.now()
) {


}
