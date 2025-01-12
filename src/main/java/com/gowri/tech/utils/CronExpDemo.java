package com.gowri.tech.utils;

/*
 * @author NaveenWodeyar
 * @date 11-01-2025
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class CronExpDemo {
    private static final Logger log = LoggerFactory.getLogger(CronExpDemo.class);

    @Scheduled(cron = "0 * * * * ?")
    public void everyMinute(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        log.warn("Every minute @Scheduled(cron = \"0 * * * * ?\")\n");
    }

    @Scheduled(cron = "0 0/5 * * * ?")
    public void everyFiveMinute(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        log.debug("Every 5 minutes @Scheduled(cron = \"0 0/5 * * * ?\")\n");
    }

    @Scheduled(cron = "0 0/10 * * * ?")
    public void everyTenMinute(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        log.warn("Every 10 minutes @Scheduled(cron = \"0 0/10 * * * ?\")\n");
    }

    @Scheduled(cron = "0 0/30 * * * ?")
    public void everyThirtyMinute(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        log.debug("Every 30 minutes @Scheduled(cron = \"0 0/30 * * * ?\")\n");
    }

    @Scheduled(cron = "0 0 * * * ?")
    public void everyHour(){
        log.info("Accessing EndPoint using CRON:: {}",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
        log.trace("Every 60 minutes @Scheduled(cron = \"0 0 * * * ?\")\n");
    }
}
