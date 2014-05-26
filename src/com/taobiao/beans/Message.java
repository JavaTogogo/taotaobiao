package com.taobiao.beans;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Integer id;
	private TUser TUser;
	private String type;
	private String title;
	private String content;
	private String file;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** full constructor */
	public Message(TUser TUser, String type, String title, String content,
			String file) {
		this.TUser = TUser;
		this.type = type;
		this.title = title;
		this.content = content;
		this.file = file;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}