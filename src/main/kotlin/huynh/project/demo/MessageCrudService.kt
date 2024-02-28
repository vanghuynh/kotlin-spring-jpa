package huynh.project.demo

import org.springframework.stereotype.Service
import java.util.*

@Service
class MessageCrudService(val repository: MessageRepository) {

    fun findMessage(): List<Message> = repository.findAll().toList()

    fun findMessageById(id: String): List<Message> =
        repository.findById(id).toList()

    fun save(message: Message) {
        repository.save(message)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}