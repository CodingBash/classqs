package com.classqs.webapplication.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.classqs.webapplication.enums.UserType;

public class RegisterInformation
{
	@NotNull
	@Size(min = 5, max = 16)
	private String username;

	@NotNull
	@Size(min = 5, max = 25)
	private String password;

	@NotNull
	@Email
	private String email;

	@NotNull
	private UserType type;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public UserType getType()
	{
		return type;
	}

	public void setType(UserType type)
	{
		this.type = type;
	}
}
