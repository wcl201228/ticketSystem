package com.njhy.ts.service;

import com.njhy.ts.entity.User;
import com.njhy.ts.exception.UserNotFindException;

public interface IUserService {
	public User getUserById(int id);
	
	
	  /**
     * 新增用户
     * <一句话功能简述>
     * <功能详细描述>
     * @param u
     * @see [类、类#方法、类#成员]
     */
	public void addUser(User u);
	 /**
     * 通过登陆名和密码查询用户
     * <一句话功能简述>
     * <功能详细描述>
     * @param loginName
     * @param password
     * @return
     * @throws UserNotFindException 
     * @see [类、类#方法、类#成员]
     */
    public User findUserByLoginNameAndPassword(String loginName,String password) throws UserNotFindException;

    /**
     * 修改用户信息
     * <一句话功能简述>
     * <功能详细描述>
     * @param u
     * @see [类、类#方法、类#成员]
     */
	public void modifyUser(User u);

	/**
     * 通过ID查询用户
     * <一句话功能简述>
     * <功能详细描述>
     * @param userId
     * @return
     * @see [类、类#方法、类#成员]
     */
	public User findUserById(Integer userId);


	
	
}
