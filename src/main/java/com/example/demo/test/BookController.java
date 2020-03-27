package com.example.demo.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
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

		//success
		ObjectMapper objectMapper2 = new ObjectMapper();
		objectMapper2.readValue(json, BookPowerEntity2.class);

		//fail
		ObjectMapper objectMapper1 = new ObjectMapper();
		objectMapper1.registerModule(new ParameterNamesModule());
		objectMapper1.readValue(json, BookPowerEntity.class);
	}
}
