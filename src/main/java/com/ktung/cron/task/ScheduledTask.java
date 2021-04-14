package com.ktung.cron.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

  private static final Logger LOG = LoggerFactory.getLogger(ScheduledTask.class);

  private static int counter = 0;

  @Scheduled(fixedRate = 1000)
  public void logEverySecond() {
    LOG.info("Counter {}", ++counter);
  }
}
