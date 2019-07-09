package com.example.coursebackend;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.coursebackend.model.Teacher;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBackendApplicationTests {
	

	@Test
	public void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		Teacher teacher = restTemplate.getForEntity("http://localhost:8080/teacher/1", Teacher.class).getBody();
		Assert.assertEquals("1", teacher.id);
	}

}
