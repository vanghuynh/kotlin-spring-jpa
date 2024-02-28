package huynh.project.demo

import org.springframework.web.bind.annotation.*

@RestController
class MessageController(val service: MessageCrudService) {

    @GetMapping("/")
    fun index(): List<Message> = service.findMessage()

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Message> =
        service.findMessageById(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        service.save(message)
    }
}