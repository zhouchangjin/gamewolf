package com.gamewolf.gameinfo.config;

import javax.servlet.ServletContextListener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gamewolf.gameinfo.listener.GameWolfServletEventListener;

@Configuration
public class ContextConfig {
	
	@Bean
    ServletListenerRegistrationBean<ServletContextListener> servletListener() {
        ServletListenerRegistrationBean<ServletContextListener> srb = new ServletListenerRegistrationBean<>();
        srb.setListener(new GameWolfServletEventListener());
        return srb;
    }

}
