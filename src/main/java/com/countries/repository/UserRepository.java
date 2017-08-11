package com.countries.repository;

import java.util.List;
import java.util.Map;

import com.countries.entity.UserEntity;

public interface UserRepository {

	
	public UserEntity findUser(String userName, String password);
	
	public  List<UserEntity> findUsers();
}
