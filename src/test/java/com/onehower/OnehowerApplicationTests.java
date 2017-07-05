package com.onehower;

import com.onehower.entity.Life;
import com.onehower.entity.Message;
import com.onehower.entity.Moment;
import com.onehower.service.LifeService;
import com.onehower.service.MessageService;
import com.onehower.service.MomentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.Inet4Address;
import java.net.InetAddress;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnehowerApplicationTests {
	private static final Logger logger = LogManager
			.getLogger(OnehowerApplicationTests.class);

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	MomentService momentService;

	@Autowired
	MessageService messageService;

	@Autowired
	LifeService lifeService;

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

	@Test
	public void testMessage() {
		String username = "test username";
		String email = "test@email.com";
		String avatar = "test avatar link";
		String content = "test content";
		String ip = "127.0.0.1";

		Message message = new Message(username, email, avatar, content, ip);

		Long id = messageService.addMessage(message);

		if (id > 0) {
			logger.info("插入成功: " + message);
		}

		Message message1 = messageService.getMessage(Long.parseLong("1"));
		logger.info("查询结果：" + message1);

		messageService.deleteMessage(Long.parseLong("1"));
	}

	@Test
	public void testLife() {
		String title = "test title";
		String breif = "test breif";
		String content = "test content";
		String pictures = "test pictures";
		String audio = "test audio";
		String vedio = "test vedio";

		Life life = new Life(title, breif, content, pictures, audio, vedio);

		Long id = lifeService.addLife(life);

		if (id > 0) {
			logger.info("插入成功: " + life);
		}

		Life life1 = lifeService.getLife(Long.parseLong("1"));
		logger.info("查询结果：" + life1);

		lifeService.deleteLife(Long.parseLong("1"));
	}
}
