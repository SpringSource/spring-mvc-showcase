package org.springframework.samples.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.samples.mvc.config.WebMvcConfig;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = {Application.class, WebMvcConfig.class})
public class AbstractContextControllerTests {

	@Autowired
	protected WebApplicationContext wac;

}