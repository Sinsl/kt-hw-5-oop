package ru.netology

import ru.netology.attachments.Audio
import ru.netology.attachments.AudioAttachment
import ru.netology.attachments.Video
import ru.netology.attachments.VideoAttachment

fun main() {
    val post1 = Post(
        ownerId = 1,
        fromId = 1,
        text = null,
    )
    val post2 = Post(
        ownerId = 2,
        fromId = 2,
        text = "Текст записи 2",
    )
    println(post1)

    val postLastArr1 = WallService.add(post1)
    val postLastArr2 = WallService.add(post2)
    WallService.print()

    val modifiedPost1 = postLastArr1.copy(text = "Изменения в тексте для поста 1")
    val modifiedPost1Original = post1.copy(text = "Изменения текста у оригинального поста 1")

    val isChangePost1 = WallService.update(modifiedPost1)
//    println(isChangePost1)
    val isChangePost1Original = WallService.update(modifiedPost1Original)
//    println(isChangePost1Original)
    WallService.print()

    // добавление медиа
    val isAddAttach1 = WallService.addAttachment(AudioAttachment(Audio(125, 1, "Певец", "Название песни", 130, "https://vk/1")), 1)
    println(isAddAttach1)
    val isAddAttach2 = WallService.addAttachment(VideoAttachment(Video(222, 1, "Название видео", 888, "https://vk/video/222")), 1)
    WallService.printPostAttach(1)


    WallService.print()
}