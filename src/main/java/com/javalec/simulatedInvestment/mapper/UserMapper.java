package com.javalec.simulatedInvestment.mapper;

import com.javalec.simulatedInvestment.dto.UserDto;
import com.javalec.simulatedInvestment.dto.UserWalletDto;

public interface UserMapper {

	public void signup(String userId, String userPw, String userName, String uesrEmail);
	public UserDto login(String userId, String userPw);
	public UserWalletDto wallet(String userId);
}
