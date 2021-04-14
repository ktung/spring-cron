package com.ktung.cron.task;

import org.awaitility.Durations;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class ScheduledTaskTest {
  @SpyBean
  private ScheduledTask scheduledTask;

  @Test
  public void logEveryMinute() {
    await().atMost(Durations.TEN_SECONDS).untilAsserted(() -> {
      verify(scheduledTask, atLeast(2)).logEverySecond();
    });
  }
}
