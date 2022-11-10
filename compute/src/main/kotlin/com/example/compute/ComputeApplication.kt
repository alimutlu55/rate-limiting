package com.example.compute

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ComputeApplication

fun main(args: Array<String>) {
	runApplication<ComputeApplication>(*args)
}
