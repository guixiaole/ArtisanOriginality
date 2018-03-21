package com.ssm.originality.controller;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.originality.po.Account;
import com.ssm.originality.service.AccountService;

@Controller
public class AccountManageController {
	    @Resource
        private AccountService accountService;
	    @RequestMapping("/accountLogin")
	    @ResponseBody
	    public  Account accountLogin(Account account,String account_id,HttpServletRequest request,Model model)throws Exception{
	    	/**
	    	 *判断从页面传回来的字符串是否为纯数字
	    	 *如果是纯数字则装填到电话号码字段中
	    	 *否则装填到邮箱字段中
	    	 */	    	
	    	String reg="^\\d+$";
	    	if (account_id.matches(reg)){
	    		account.setAcphone(account_id);
	    	}else{
	    	account.setAcemail(account_id);
	    	}
	    	//			account.setAcemail(account.getAcphone());
	    	Account account1=accountService.loginByUser(account); 
	    	System.out.println(account1);
			//将信息放入到session中去
	    	if(account1==null){
	    		String error="账号密码错误";
	    		model.addAttribute("loginError", error);
	    		return null;
	    	}
	    	
	    	HttpSession session=request.getSession();
			session.setAttribute("index_account", account1);			
	    	//返回主页面

			return account1;
	  	    }
	    /**
	     * 用户注销的时候
	     * @param request
	     * @return  jsp/index
	     * @throws Exception
	     */
	    @RequestMapping("/accountLogOut")
	    public String accountLogOut(HttpServletRequest request) throws Exception{
	            request.getSession().removeAttribute("index_account");
	        	return "redirect:jsp/index.jsp";
	    }
	    
	    @RequestMapping("/accountRegister")
	    public String accountRegister(Account account,HttpServletRequest request)throws Exception{
		   //当用户注册是的时候，没有填名字，随机给予名字（放入到service中设置）
	       	Account account1=accountService.registByUser(account);
	    	//将信息放入到session中去
			request.getSession().setAttribute("account", account1);			
	    	//返回主页面
			return "index";    	
	    }

	    @RequestMapping("account_login")
	    @ResponseBody
	    public  Account account_login(@RequestBody Account account,String account_id,Model model,HttpServletRequest request,HttpServletResponse response)throws Exception{
     	   HttpSession session=request.getSession();
     	   System.out.println(account);
	    	/**
	    	 *判断从页面传回来的字符串是否为纯数字
	    	 *如果是纯数字则装填到电话号码字段中
	    	 *否则装填到邮箱字段中
	    	 */	 
	    	System.out.println(account);
	    	
	    	Account account1=accountService.loginByUser(account); 
	        System.out.println(account1);
	    	if (account1==null){    	
	        	return null;       
	        }else{
	        	session.setAttribute("index_account", account1);
	        }
        return account1;
        
 	    }
}
