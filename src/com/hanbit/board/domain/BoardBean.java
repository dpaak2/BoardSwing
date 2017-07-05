package com.hanbit.board.domain;

public class BoardBean {
	private int seq;
	private String writer, title, content,regDate;

	public void setSeq() {
		this.seq = seq;
	}

	public int getSeq() {
		return seq;
	}

	public void setWriter() {
		this.writer = writer;
	}

	public String getWriter() {
		return writer;
	}

	public void setTitle() {
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setContent(){
		this.content=content;
	}
	public String getContent(){
		return content;
	}
	public void setRegDate(){
		this.regDate=regDate;
	}
	public String getRegDate(){
		return regDate;
	}

	@Override
	public String toString() {
		return "BoardBean [seq=" + seq + ", writer=" + writer + ", title=" + title + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}
	
}
