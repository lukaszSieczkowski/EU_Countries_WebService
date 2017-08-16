package com.countries.repository;

import java.util.List;

import com.countries.entity.UserEntity;

public interface UserRepository {

	public UserEntity findUser(String userName, String password);

	public List<UserEntity> findUsers();
}
