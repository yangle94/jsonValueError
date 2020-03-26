package com.example.demo.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Angle
 * @version 1.0
 * @date 2020/3/26 5:05 下午
 */
@RestController
public class BookController {

	/**
	 * http://localhost:8080/book
	 *
	 * {
	 * 		"bookAggregateRootStatusEnum": 0
	 * }
	 *
	 */
	@PostMapping("book")
	public void create(@RequestBody BookPowerEntity bookAggregateRoot) {
		System.out.println(bookAggregateRoot);
	}

	public static void main(String[] args) throws JsonProcessingException {
		String json = "{\n" +
				"\"bookAggregateRootStatusEnum\":0\n" +
				"}";
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.readValue(json, BookPowerEntity.class);
	}
}
