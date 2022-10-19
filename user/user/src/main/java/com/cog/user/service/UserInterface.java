package com.cog.user.service;

import com.cog.user.model.ERole;
import com.cog.user.model.User;

public interface UserInterface {
	
	User getUser(int userId, ERole roleUser);

}
