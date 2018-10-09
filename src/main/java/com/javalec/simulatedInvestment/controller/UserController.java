package com.javalec.simulatedInvestment.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.javalec.simulatedInvestment.dto.UserDto;
import com.javalec.simulatedInvestment.dto.UserWalletDto;
import com.javalec.simulatedInvestment.mapper.UserMapper;

@RestController
public class UserController {
	
	@Autowired
	SqlSession sqlSession;
	
	Gson gson = new Gson();
	
	@PostMapping(value = "/signupPost")
	@CrossOrigin(origins = "http://localhost:3000")
	public String signupPost(HttpServletRequest request, Model model) {
		//System.out.println("signupPost"+request.getParameter("userId"));
		System.out.println("signupPost 실행");

		UserMapper dao = sqlSession.getMapper(UserMapper.class);
		dao.signup(request.getParameter("userId"), request.getParameter("userPw"), request.getParameter("userName"), request.getParameter("userEmail"));
		
		return request.getParameter("userId");
	}
	
	@PostMapping(value = "/loginPost")
	@CrossOrigin(origins = "http://localhost:3000")
	public String loginPost(HttpServletRequest request, Model model) {
		System.out.println("loginPost");
		
		UserMapper dao = sqlSession.getMapper(UserMapper.class);
		UserDto dto = dao.login(request.getParameter("userId"), request.getParameter("userPw"));
		
		
		String toekn = "1a2b3c4d";
		String JSON = "{\"token\": \"" + toekn + "\", \"data\": "+gson.toJson(dto)+"}";
		
		System.out.println(JSON);
		
		return JSON;
	}
	
	@PostMapping(value = "/wallet")
	@CrossOrigin(origins = "http://localhost:3000")
	public String wallet(HttpServletRequest request, Model model) {
		System.out.println("wallet");
		
		UserMapper dao = sqlSession.getMapper(UserMapper.class);
		UserWalletDto dto = dao.wallet(request.getParameter("userId"));
		
		return gson.toJson(dto);
	}
	
	@PostMapping(value = "/rateOfReturn")
	@CrossOrigin(origins = "http://localhost:3000")
	public String rateOfReturn(HttpServletRequest request, Model model) {
		System.out.println("rateOfReturn");
		
		//UserMapper dao = sqlSession.getMapper(UserMapper.class);
		//UserWalletDto dto = dao.wallet();
		
		//최초 월 받아오기 -> where 조건에 월 넣어서 가져온후 합산
		
		//return gson.toJson(dto);
		
		return "";
	}
	
	
}
