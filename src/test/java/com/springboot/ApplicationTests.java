package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

//表示要进行spring的全部流程启动单元测试（类似于spring的正常启动服务）
@RunWith(SpringRunner.class)
//表示使用spring-boot的方式启动单元测试，并使用默认的端口号
//选项主要是为了单元测试中通过TestRestTemplate 对象模拟 http 请求
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void hello() {
		ResponseEntity<String> entity = testRestTemplate.getForEntity("/hello",String.class);
		//System.out.println(entiy.getBody());

		assertThat(entity.getBody()).isEqualTo("hello spring boot");
		assertThat(entity.getStatusCodeValue()).isEqualTo(200);
	}

	@Test
	public void contextLoads() {
	}

}
