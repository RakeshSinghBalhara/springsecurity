package com.gmail.nlpraveennl.cache.entity;

import java.io.Serializable;

public class UserCacheEntity implements Serializable
{

	private static final long serialVersionUID = 4516255544470166618L;
	
	private Integer	id;
	private String	firstName;
	private String	lastName;
	private String	userName;
	private String	password;
	private String	email;
	private String	gender;
	private boolean	enabled;
	private Integer	roleId;
	private String	roleStr;

	public UserCacheEntity()
	{}
	
	public UserCacheEntity(Integer id, String firstName, String lastName, String userName, String password, String email, String gender, boolean enabled, Integer roleId, String roleStr)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.enabled = enabled;
		this.roleId = roleId;
		this.roleStr = roleStr;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
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

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public boolean isEnabled()
	{
		return enabled;
	}

	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}

	public Integer getRoleId()
	{
		return roleId;
	}

	public void setRoleId(Integer roleId)
	{
		this.roleId = roleId;
	}

	public String getRoleStr()
	{
		return roleStr;
	}

	public void setRoleStr(String roleStr)
	{
		this.roleStr = roleStr;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("UserCacheEntity [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", email=");
		builder.append(email);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", enabled=");
		builder.append(enabled);
		builder.append(", roleId=");
		builder.append(roleId);
		builder.append(", roleStr=");
		builder.append(roleStr);
		builder.append("]");
		return builder.toString();
	}
}
