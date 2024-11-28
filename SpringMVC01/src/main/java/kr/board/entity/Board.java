package kr.board.entity;

import lombok.Data;

@Data
public class Board {
	private int idx;
	private String title;
	private String contents;
	private String writer;
	private String indate; // 작성일
	private int count; // 조회
}
