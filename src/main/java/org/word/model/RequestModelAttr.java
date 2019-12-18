package org.word.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;

@Data
public class RequestModelAttr implements Serializable {

	private static final long serialVersionUID = -4074067438450613643L;

	/**
	 * 类型
	 */
	private String className = StringUtils.EMPTY;

	/**
	 * 属性
	 */
	private String value = StringUtils.EMPTY;

	/**
	 * 类型
	 */
	private String type = StringUtils.EMPTY;

	/**
	 * 属性名称/说明
	 */
	private String name;
	
	/**
	 * 是否必填
	 */
	private Boolean require = false;
}
