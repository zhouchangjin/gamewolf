package com.gamewolf.gameinfo.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
@EnableAsync
@Configuration
public class ExecutorConfig {
	
	
	 @Bean(name = "gameinfoThreadPoolTaskExecutor") //起个名字
	  public Executor taskExecutor() {
	    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	    executor.setCorePoolSize(2);
	    executor.setMaxPoolSize(2);
	    executor.setQueueCapacity(500);
	    executor.setThreadNamePrefix("gameinfo_asynctask_threadpool-");
	    executor.initialize();
	    return executor;
	  }

}
