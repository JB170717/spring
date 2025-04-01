package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.QuizVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	//quiz01
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";
	}
	//quiz02
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}
	
	//폼요청
	@RequestMapping(value = "/join", method=RequestMethod.POST)
	public String join(QuizVO vo, Model model) {
		
		//값을 받아서, ok페이지로 값을 보냄
		model.addAttribute("quizVO", vo);
		return "quiz/quiz01_ok";
	}
	
	
	//result페이지 화면
	@RequestMapping("/result")
	public String result() {
		return "quiz/result";
	}
	
	
	
	@RequestMapping(value = "/birthForm", method=RequestMethod.POST)
	public String birthForm(@RequestParam("year") String year,
							@RequestParam("month") String month,
							@RequestParam("day") String day,
							@RequestParam("msg") String  msg,
							RedirectAttributes ra) {
				
		String myMsg = year + "-" + month + "-" + day + " " + msg;
		ra.addFlashAttribute("msg", myMsg);
		
		
		return "redirect:/quiz/result";
	}
	
	
	
	
	
	
	
	
	
}
