package com.tanaz.microservices.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanaz.microservices.limitservices.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());	
	}
}
