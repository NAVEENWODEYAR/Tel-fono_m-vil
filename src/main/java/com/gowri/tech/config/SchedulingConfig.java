package com.gowri.tech.config;
/*
 * @author NaveenWodeyar
 * @date 11-01-2025
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class SchedulingConfig {

    @Bean
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(20); // Set the pool size to 5 threads
        scheduler.setThreadNamePrefix("scheduled-task-");
        scheduler.setDaemon(true); // Ensure the scheduler doesn't block shutdown
        return scheduler;
    }
}
