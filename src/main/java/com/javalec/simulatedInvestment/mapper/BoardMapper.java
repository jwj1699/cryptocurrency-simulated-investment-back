package com.javalec.simulatedInvestment.mapper;

import java.util.ArrayList;

import com.javalec.simulatedInvestment.dto.BoardDto;;

public interface BoardMapper {
	
	public ArrayList<BoardDto> list();
	public BoardDto contentView(String bNo);
	public void write(String bCategory, String bTitle, String bCotent, String bUserId);
	public void delete(String bNo);
	public void upHit(String bNo);
}
