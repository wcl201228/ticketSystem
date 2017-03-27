package com.njhy.ts.controller;

import java.io.PrintWriter;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.njhy.ts.entity.User;
import com.njhy.ts.exception.UserNotFindException;
import com.njhy.ts.service.IUserService;
import com.njhy.ts.util.ActionResult;

import net.sf.json.JSONObject;

/**
 * 
 * @author 魏常乐
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	
	private ActionResult actionResult = new ActionResult();
	    
	@ExceptionHandler(value=UserNotFindException.class)
	@ResponseBody
	public ActionResult exceptionHandler(Exception e){
	       actionResult.setMsg(e.getMessage());
	       return actionResult;
	    }
	 
	@RequestMapping("/login")
	@ResponseBody
	public ActionResult login(@RequestParam(required=true)String loginName,@RequestParam(required=true)String password,HttpServletRequest request) throws UserNotFindException
	 	{
	        User u=userService.findUserByLoginNameAndPassword(loginName, password);
	        request.getSession().setAttribute("user", u);
	        actionResult.setSuccess(true);
	        actionResult.setMsg("登录成功");
	        return actionResult;
	    }
	 
	@RequestMapping("/register")
	@ResponseBody
	public ActionResult registerUser(HttpServletRequest request ,User u){
		
    	
    	 System.out.println("用户名="+u.getUname());
    	 System.out.println("mima="+u.getUpass());
    	 System.out.println("liexing"+u.getUtype());
    	 System.out.println(u);
        try
        {
        	System.out.println(u);
            userService.addUser(u);
            
            actionResult.setData(null);
            actionResult.setMsg("注册成功");
            actionResult.setSuccess(true);
            
        }
        catch (Exception e)
        {
        	System.out.println(u);
            actionResult.setData(null);
            actionResult.setMsg("注册失败");
            actionResult.setSuccess(false);
        }
        return actionResult;
    }
	 
	@RequestMapping("/update")
	@ResponseBody
	public ActionResult modifyUserInfo(User u){
        try
        {
            userService.modifyUser(u);
            actionResult.setData(null);
            actionResult.setMsg("修改成功");
            actionResult.setSuccess(true);
        }
        catch (Exception e)
        {   actionResult.setData(null);
            actionResult.setMsg("修改失败");
            actionResult.setSuccess(false);
            e.printStackTrace();
        }
        return actionResult ;
    }
	 
	@RequestMapping("/findUserById")
	@ResponseBody
	public User findUserById(@RequestParam(required=true)Integer userId){
        User user = userService.findUserById(userId);
        return user;
        
  		}
	@RequestMapping("/showUser")
	@ResponseBody
	public User showUser(Integer uid, HttpServletResponse response) {
		User user = userService.getUserById(uid);
		return user;
	
		}
	

	@RequestMapping("/test.do")
	@ResponseBody
	public ArrayList<String> test(String test) {
		String b = test;
		ArrayList<String> list = new ArrayList<String>();
		list.add(b);

		return list;
	}

	@RequestMapping("/test1.do")
	@ResponseBody
	public JSONObject test1(String test) {
		String b = test;
		JSONObject json = new JSONObject();
		json.put("test", b);

		return json;
	}


	
	@RequestMapping("/test2.do")
	public void test2(String test, HttpServletResponse response) {
		String b = test;
		JSONObject json = new JSONObject();
		json.put("test", b);
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			writer.write(json.toString());
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
			if (writer != null) {
				writer.close();
				writer = null;
			}
		}

	}
}
