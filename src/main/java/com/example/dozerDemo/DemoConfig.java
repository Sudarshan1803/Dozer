package com.example.dozerDemo;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

public class DemoConfig {

	public void testMethod() {

		DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
		SourceBean sourceObject = new SourceBean("Sudarshan", "India", "25");

		dozerBeanMapper.setMappingFiles(Arrays.asList("destination-mapper.xml"));
		DestinationBean destinationObject = dozerBeanMapper.map(sourceObject, DestinationBean.class);

		System.out.println(destinationObject);

	}
}
