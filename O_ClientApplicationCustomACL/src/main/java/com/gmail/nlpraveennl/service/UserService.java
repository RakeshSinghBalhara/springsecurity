package com.gmail.nlpraveennl.service;

import java.util.List;

import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;

import com.gmail.nlpraveennl.model.UserDetails;
import com.gmail.nlpraveennl.vo.UserVO;

public interface UserService
{
	
	/**
	 * @param userDetails
	 * @return
	 */
	public UserDetails addUser(UserDetails userDetails);
	
	/**
	 * @param userDetails
	 * @return
	 */
	public UserDetails modifyUser(UserDetails userDetails);
	
	/**
	 * @param userDetails
	 * @return
	 */
	public List<UserDetails> listUser();
	
	/**
	 * @return
	 */
//	@PostFilter("hasPermission(filterObject, 'READ')")
	@PreAuthorize(value = "hasRole('ROLE_USER')")
	public List<UserVO> listUserVO();

	/**
	 * @param userId
	 * @return
	 */
	public UserDetails getUser(int userId);

}
