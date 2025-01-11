package com.gowri.tech.utils;
/*
 * @author NaveenWodeyar
 * @date 11-01-2025
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@EnableScheduling
public class CronExpDemo {
    private static final Logger log = LoggerFactory.getLogger(CronExpDemo.class);

    @Scheduled(cron = "0 * * * * ?")
    public String everyMinute(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        return "Every minute @Scheduled(cron = \"0 * * * * ?\")\n";
    }

    @Scheduled(cron = "0 0/5 * * * ?")
    public String everyFiveMinute(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        return "Every 5 minutes @Scheduled(cron = \"0 0/5 * * * ?\")\n";
    }

    @Scheduled(cron = "0 0/10 * * * ?")
    public String everyTenMinute(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        return "Every 10 minutes @Scheduled(cron = \"0 0/10 * * * ?\")\n";
    }

    @Scheduled(cron = "0 0/30 * * * ?")
    public String everyThirtyMinute(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        return "Every 30 minutes @Scheduled(cron = \"0 0/30 * * * ?\")\n";
    }

    @Scheduled(cron = "0 0 * * * ?")
    public String everyHour(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        return "Every 60 minutes @Scheduled(cron = \"0 0 * * * ?\")\n";
    }
}
