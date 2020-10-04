package com.kiworkshop.loggenerator;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class LogController {

    @GetMapping("/error")
    public void logError() {
        log.error("Error message.");
    }

    @GetMapping("/warn")
    public void logWarn() {
        log.warn("Warn message.");
    }

    @GetMapping("/info")
    public void logInfo() {
        log.info("Info message.");
    }

    @GetMapping("/debug")
    public void logDebug() {
        log.debug("Debug message.");
    }

    @GetMapping("/trace")
    public void logTrace() {
        log.trace("Trace message.");
    }

    @Scheduled(cron = "${log.cron.error}")
    public void logErrorWithScheduled() {
        log.error("Error message.");
    }

    @Scheduled(cron = "${log.cron.info}")
    public void logInfoWithScheduled() {
        log.error("Info message.");
    }
}
