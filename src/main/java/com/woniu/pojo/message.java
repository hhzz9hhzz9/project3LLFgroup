package com.woniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class message {
	private Integer messageId;
	private Integer userId;
	private String messageContext;
	private Integer messageStatus;
}
