package com.onehower;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnehowerApplicationTests {
	private static final Logger logger = LogManager
			.getLogger(OnehowerApplicationTests.class);

	@Autowired
	private JavaMailSender mailSender;

	@Test
	public void testLogger() {
		logger.info("Hello world");
	}

	@Test
	public void testSendEmail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("914092540@qq.com");
		message.setTo("837478514@qq.com");
		message.setSubject("主题：简单邮件");
		message.setText("测试邮件内容");
		mailSender.send(message);
	}
}
