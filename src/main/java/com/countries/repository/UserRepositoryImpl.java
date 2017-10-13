package com.countries.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.countries.entity.CountryEntity;
import com.countries.entity.UserEntity;

public class UserRepositoryImpl implements UserRepository{

	@Override
	public UserEntity findUser(String userName, String password) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		Query query = entityManager
				.createQuery("SELECT u FROM UserEntity u WHERE u.userName = '" + userName + "' AND u.password = '"+password+"'");
		UserEntity userEntity = (UserEntity) query.getSingleResult();
		entityManager.close();
		emFactory.close();
		return userEntity;
	}

	@Override
	public List<UserEntity>  findUsers() {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		List<UserEntity> users = new ArrayList<>();
		users =  entityManager.createQuery("SELECT u FROM UserEntity u").getResultList();
		entityManager.close();
		emFactory.close();
		return users;
	}

}
