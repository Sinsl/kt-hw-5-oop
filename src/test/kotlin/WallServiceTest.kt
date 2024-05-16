import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import ru.netology.Post
import ru.netology.WallService

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addPost() {
        val result = WallService.add(Post(ownerId = 1, fromId = 1, text = "Текст записи 1"))
        assertEquals(result.id, 2)
    }

    @Test
    fun updateWithReturnTrue() {
        val post = WallService.add(Post(ownerId = 2, fromId = 2, text = "Текст записи 1"))
        val changePost = post.copy(id = 5, text = "Изменения")
        assertTrue(WallService.update(changePost))
    }

    @Test
    fun updateWithReturnFalse() {
        assertFalse(WallService.update(Post(ownerId = 3, fromId = 3, text = "Текст записи 3")))
    }
}