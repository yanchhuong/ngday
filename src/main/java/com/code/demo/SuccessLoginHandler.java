<<<<<<< HEAD
package com.code.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.code.session.SessionManager;
import com.code.session.UserSession;

public class SuccessLoginHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication arg2)
			throws IOException, ServletException {
		
		HttpSession session = request.getSession();
	     /*System.out.println("test session");	
		session.setAttribute("FULL_NAME", "prak virak");*/
		
		UserSession user = new UserSession();
		user.setProfile("test profile");
		SessionManager.setSession(request, response, user);
		
	
		// TODO Auto-generated method stub
		
	}

}
=======
package com.code.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.code.session.SessionManager;
import com.code.session.UserSession;

public class SuccessLoginHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication arg2)
			throws IOException, ServletException {
		
		HttpSession session = request.getSession();
	     /*System.out.println("test session");	
		session.setAttribute("FULL_NAME", "prak virak");*/
		
		UserSession user = new UserSession();
		user.setProfile("test profile");
		SessionManager.setSession(request, response, user);
		
	
		// TODO Auto-generated method stub
		
	}

}
>>>>>>> 4c2f064d4805a20514232872b5c5aa58104d0d12
