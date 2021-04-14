package com.ktung.cron;

import com.ktung.cron.task.ScheduledTask;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CronApplicationTests {

	@Autowired
	private ScheduledTask scheduledTask;

	@Test
	void contextLoads() {
		assertThat(scheduledTask).isNotNull();
	}

}
