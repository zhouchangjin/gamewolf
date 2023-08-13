package com.gamewolf.gameinfo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class GameWolfServletEventListener implements ServletContextListener {
	
	Logger logger=(Logger) LoggerFactory.getLogger(GameWolfServletEventListener.class);
	
    @Override
    public void contextDestroyed(ServletContextEvent event) {
        logger.info("Spring 关闭了");
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
    	logger.info("Spring 启动了");
    }

}
