package com.sample;

import javax.servlet.*;
import java.io.IOException;
import java.util.Optional;

/**
 * Created by Misha on 22.08.2017.
 */
public class SimpleFilter implements Filter {
    private String value;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        value = Optional.ofNullable(filterConfig.getInitParameter("value")).orElse("");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
