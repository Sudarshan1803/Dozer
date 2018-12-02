package com.example.dozerDemo;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class DemoConfig {

	@Scheduled(cron = "*/10 * * * * *")
	public void testMethod() {

		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		SourceBean sourceObject = new SourceBean("Sudarshan", "India", "25");

		dozerBeanMapper.setMappingFiles(Arrays.asList("destination-mapper.xml"));
		DestinationBean destinationObject = dozerBeanMapper.map(sourceObject, DestinationBean.class);

		System.out.println(destinationObject);

	}
}
