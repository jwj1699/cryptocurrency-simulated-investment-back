package com.javalec.simulatedInvestment.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.javalec.simulatedInvestment.dto.UserDto;
import com.javalec.simulatedInvestment.mapper.UserMapper;

@RestController
public class UserController {
	
	@Autowired
	SqlSession sqlSession;
	
	Gson gson = new Gson();
	
	@GetMapping(value = "/signupGet")
	@CrossOrigin(origins = "http://localhost:3000")
	public String signupGet(HttpServletRequest request, Model model) {
		System.out.println("signupGet"+request.getParameter("userId"));

		UserMapper dao = sqlSession.getMapper(UserMapper.class);
		dao.signup(request.getParameter("userId"), request.getParameter("userPw"), request.getParameter("userName"), request.getParameter("userEmail"));
		
		return "{redirect:http://localhost:3000}";
	}
	
	@PostMapping(value = "/signupPost")
	@CrossOrigin(origins = "http://localhost:3000")
	public String signupPost(HttpServletRequest request, Model model) {
		System.out.println("signupPost"+request.getParameter("userId"));
		System.out.println();
		System.out.println("userId"+request.getAttribute("userId"));
		System.out.println("userPw"+request.getAttribute("userPw"));
		System.out.println("userName"+request.getAttribute("userName"));
		System.out.println("userEmail"+request.getAttribute("userEmail"));

		UserMapper dao = sqlSession.getMapper(UserMapper.class);
		dao.signup(request.getParameter("userId"), request.getParameter("userPw"), request.getParameter("userName"), request.getParameter("userEmail"));
		return "{redirect:http://localhost:3000}";
	}
	
	@GetMapping(value = "/loginGet")
	@CrossOrigin(origins = "http://localhost:3000")
	public String loginGet(HttpServletRequest request, Model model) {
		System.out.println("loginGet"+request.getParameter("userId"));

		UserMapper dao = sqlSession.getMapper(UserMapper.class);
		UserDto dto= dao.login(request.getParameter("userId"), request.getParameter("userPw"));
		
		return gson.toJson(gson);
	}
	
	@PostMapping(value = "/loginPost")
	@CrossOrigin(origins = "http://localhost:3000")
	public String loginPost(HttpServletRequest request, Model model) {
		System.out.println("loginPost");
		
		Enumeration eParam = request.getParameterNames();
        
        while(eParam.hasMoreElements()) {
            String pName = (String)eParam.nextElement();
            String pValue = request.getParameter(pName);
            
            System.out.println(pName + " : " + pValue);
        }


		UserMapper dao = sqlSession.getMapper(UserMapper.class);
		UserDto dto = dao.login(request.getParameter("userId"), request.getParameter("userPw"));
		
		return gson.toJson(gson);
	}
	
	
	
}
