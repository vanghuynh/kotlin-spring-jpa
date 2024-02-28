package huynh.project.demo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity(name = "messages")
data class Message(@Id @GeneratedValue(strategy = GenerationType.UUID) var id: String?, val text: String)