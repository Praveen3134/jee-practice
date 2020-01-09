package org.training.practice.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ParameterLogggingFilter
 */
@WebFilter("/*")
public class ParameterLogggingFilter implements Filter {

    public ParameterLogggingFilter() {
	// TODO Auto-generated constructor stub
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {
	chain.doFilter(request, response);
    }

    public void init(FilterConfig fConfig) throws ServletException {
	// TODO Auto-generated method stub
    }

}
