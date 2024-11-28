package kr.board.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.Board;

@Controller
public class BoardController {
	// HandlerMapping
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		
		Board bo = new Board();
		bo.setIdx(1);
		bo.setTitle("게시판 작성");
		bo.setContents("게시판 연습을 해보자");
		bo.setWriter("김준우");
		bo.setIndate("2024-11-28");
		bo.setCount(0);
		
		List<Board> list = new ArrayList<Board>();
		list.add(bo);
		list.add(bo);
		list.add(bo);
		model.addAttribute("list", list); // 객체 바인딩 가장 중요한 작업
		
		return "boardList"; //WEB_INF/views/
	}
}
