package egovframework.com.cmm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import egovframework.rte.fdl.security.userdetails.util.EgovUserDetailsHelper;

public class TestInterceptor extends HandlerInterceptorAdapter {
	
	/**
	 * This implementation always returns {@code true}.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		
		if (EgovUserDetailsHelper.isAuthenticated().booleanValue()) {
			
		} else {
			
		}
		System.out.println("1. 전처리 작업!!!");
		return true;
		
	}

	/**
	 * This implementation is empty.
	 */
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		
		
		modelAndView.addObject("keyTitle","키타이틀~~~~~~~");
		
		System.out.println("2. 후처리 작업!!!");
		
		
	}

}
