package com.example.demo.test;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Angle
 * @version 1.0
 * @date 2020/3/26 5:04 下午
 */
@Data
@Accessors(chain = true)
public class BookPowerEntity2 {
	private BookAggregateRootStatusEnum2 bookAggregateRootStatusEnum;
}
