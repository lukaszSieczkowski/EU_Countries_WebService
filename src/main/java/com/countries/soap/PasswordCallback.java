/**package com.countries.soap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import com.countries.entity.UserEntity;
import com.countries.repository.UserRepository;
import com.countries.repository.UserRepositoryImpl;

public class PasswordCallback implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		UserRepository userRepository = new UserRepositoryImpl();
		List<UserEntity> users = userRepository.findUsers();
		Map<String, String> passwords = conventUsersListToMap(users);
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
			String pass = passwords.get(pc.getIdentifier());
			if (pass != null) {
				pc.setPassword(pass);
				return;
			}
		}
	}

	
	public Map<String, String> conventUsersListToMap(List<UserEntity> users) {
		Map<String, String> passwords = new HashMap<>();
		for (UserEntity userEntity : users) {
			passwords.put(userEntity.getUserName(), userEntity.getPassword());
		}
		return passwords;

	}

}
*/