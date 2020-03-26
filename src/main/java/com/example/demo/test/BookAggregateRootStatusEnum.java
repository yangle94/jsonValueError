package com.example.demo.test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * @author Angle
 * @version 1.0
 * @date 2020/3/26 5:04 下午
 */
@AllArgsConstructor
@Getter
public enum BookAggregateRootStatusEnum {

	BOOK_ALL_READ(0, "全部可读")
	;

	@JsonValue
	private final Integer code;

	private final String message;

	@JsonCreator
	public static BookAggregateRootStatusEnum valueOfCode(int code) {
		return Arrays.stream(values()).filter(enu -> enu.getCode().equals(code)).findAny().get();
	}
}
