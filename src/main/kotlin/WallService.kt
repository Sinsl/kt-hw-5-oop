package ru.netology

import ru.netology.attachments.Attachment
import ru.netology.attachments.Audio

object WallService {
    private var counterId = 0
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        counterId++
        val newPost = post.copy(id = counterId)
        posts += newPost
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((idx, pst) in posts.withIndex()) {
            if (pst.id == post.id) {
                posts[idx] = post.copy()
                return true
            }
        }
        return false
    }

    fun addAttachment(attachment: Attachment, id: Int): Boolean {
        for ((idx, pst) in posts.withIndex()) {
            if (pst.id == id) {
                posts[idx].attachments += attachment
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        counterId = 0
    }

    fun print() {
        for (post in posts) {
            println(post)
        }
    }

    fun printPostAttach(id: Int) {
        for ((idx, pst) in posts.withIndex()) {
            if (pst.id == id) {
                for (att in posts[idx].attachments) {
                    println(att.type)
                }
            }
        }
    }


}