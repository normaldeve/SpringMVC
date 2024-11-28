package kr.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.board.entity.Board;

@Controller
public class BoardController{
	// HandlerMapping
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		Board vo = new Board();
		vo.setIdx(1);
		vo.setTitle("게시판연습");
		vo.setContent("content");
		vo.setWriter("my");
		vo.setIndate("2024-11-12");
		vo.setCount(1);
		
		List<Board> list = new ArrayList<Board>();
		list.add(vo);
		model.addAttribute("list", list);
		return "boardList"; // /WEB-INF/views/boardList.jsp -> forward
	}	
}