package com.onehower;

import com.onehower.entity.Moment;
import com.onehower.service.MomentService;
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

	@Autowired
	MomentService momentService;

	@Test
	public void testLogger() {
		logger.info("Hello world");
	}

//	@Test
//	public void testSendEmail() throws Exception {
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom("914092540@qq.com");
//		message.setTo("837478514@qq.com");
//		message.setSubject("主题：简单邮件");
//		message.setText("测试邮件内容");
//		mailSender.send(message);
//	}

	@Test
	public void testMoment() {
		String type = "words";
		String content = "这是content";
		String articles = "文章内容";
		String pictures = "pc1,pc2,pc3";
		Moment moment = new Moment(type, content, articles, pictures);

		Long id = momentService.addMoment(moment);

		if (id > 0) {
			logger.info("插入成功: " + moment);
		}

		Moment moment1 = momentService.getMoment(Long.parseLong("1"));
		logger.info("查询结果：" + moment1);

		momentService.deleteMoment(Long.parseLong("1"));

}
}
