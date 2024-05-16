package ru.netology

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

    fun clear() {
        posts = emptyArray()
        counterId = 0
    }

    fun print() {
        for (post in posts) {
            println(post)
        }

    }


}