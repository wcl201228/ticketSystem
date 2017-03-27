package com.njhy.ts.dao;

import org.apache.ibatis.annotations.Param;

import com.njhy.ts.entity.User;

/**
 * <一句话功能简述>
 *  
 * @author  魏常乐
 * @version  [V1.00, 2016-8-16]
 * @see  [相关类/方法]
 * @since V1.00
 */

public interface IUserDao {

	public User selectById(int id);
	 /**
     * 新增用户
     * <一句话功能简述>
     * <功能详细描述>
     * @param u
     * @see [类、类#方法、类#成员]
     */
	public void insertUser(User u);
	/**
     * 根据登录名和密码查询 用户
     * <一句话功能简述>
     * <功能详细描述>
     * @param userName
     * @param userPassword
     * @return
     * @see [类、类#方法、类#成员]
     */
	public User selectUserByLoginNameAndPassword(@Param("loginName")String loginName,@Param("password") String password);
	/**
     * 修改用户信息
     * <一句话功能简述>
     * <功能详细描述>
     * @param u
     * @see [类、类#方法、类#成员]
     */
	public void updateUser(User u);
	
	 /**
     * 通过用户Id查询用户
     * <一句话功能简述>
     * <功能详细描述>
     * @param userId
     * @return
     * @see [类、类#方法、类#成员]
     */
    public User selectUserById(Integer userId);
	

}
