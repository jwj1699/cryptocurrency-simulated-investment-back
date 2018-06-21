package com.javalec.simulatedInvestment.controller;



import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.javalec.simulatedInvestment.dto.CurrencyInfoDto;
import com.javalec.simulatedInvestment.mapper.BoardMapper;
import com.javalec.simulatedInvestment.mapper.CurrencyInfoMapper;




/**
 */
@RestController
public class BoardController {
	
	Gson gson = new Gson();

	@RequestMapping(value = "/pong", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:3000")
	public String pong() {
		return "pong";
	}
	
	@Autowired
	SqlSession sqlSession;
	
	@GetMapping("/list")
	@CrossOrigin(origins = "http://localhost:3000")
	public String list(Model model) {
		
		BoardMapper dao = sqlSession.getMapper(BoardMapper.class);
		model.addAttribute("list",dao.list());
		
		String json = gson.toJson(dao.list());
		
		return json;
	}
	
	@GetMapping("/tableData")
	@CrossOrigin(origins = "http://localhost:3000")
	public String tabledata(Model model) {
		System.out.println("/tableData");
		
		CurrencyInfoMapper dao = sqlSession.getMapper(CurrencyInfoMapper.class);
		ArrayList<CurrencyInfoDto> test = dao.list();
		System.out.println(test.size());
		
		System.out.println(dao.list());
		String json = gson.toJson(dao.list());
		System.out.println("json="+json);
		return json;
	}

}