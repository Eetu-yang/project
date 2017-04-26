package com.yibao.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = { "classpath:job/schedule.xml" })
public class QuartzConfig {

}
