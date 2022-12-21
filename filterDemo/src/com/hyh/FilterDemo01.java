package com.hyh;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器
 */
public class FilterDemo01 implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {

        res.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(req,res);
    }
}
