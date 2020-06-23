package org.edu.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	/**
	 * 게시물관리 리스트 입니다.
	 */
	@RequestMapping(value = "/admin/board/list", method = RequestMethod.GET)
	public String boardList(Locale locale, Model model) { //Locale 이란?  현재는 우리가 한국어를 쓰고 있지만 다국어를쓸때 확인시켜주는명령어
		                                //Model이란? 데이터베이스와연동해서 쓸때 사용되는명령어     결국 지금은 이 명령어 2개를 다 사용하지는않고있다.
		
		return "admin/member/list";
	}
	
	/**
	 * 회원관리 리스트 입니다.
	 */
	@RequestMapping(value = "/admin/member/list", method = RequestMethod.GET)
	public String memberList(Locale locale, Model model) { //Locale 이란?  현재는 우리가 한국어를 쓰고 있지만 다국어를쓸때 확인시켜주는명령어
		                                //Model이란? 데이터베이스와연동해서 쓸때 사용되는명령어     결국 지금은 이 명령어 2개를 다 사용하지는않고있다.
		
		return "admin/member/list";
	}
	/**
	 * 관리자 홈 입니다.
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home(Locale locale, Model model) { //Locale 이란?  현재는 우리가 한국어를 쓰고 있지만 다국어를쓸때 확인시켜주는명령어
		                                //Model이란? 데이터베이스와연동해서 쓸때 사용되는명령어     결국 지금은 이 명령어 2개를 다 사용하지는않고있다.
		
		return "admin/home";
	}
}
