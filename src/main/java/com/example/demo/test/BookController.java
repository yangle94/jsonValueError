package com.example.demo.test;

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

	@PostMapping("book")
	public void create(@RequestBody BookPowerEntity bookAggregateRoot) {
		System.out.println(bookAggregateRoot);
	}
}