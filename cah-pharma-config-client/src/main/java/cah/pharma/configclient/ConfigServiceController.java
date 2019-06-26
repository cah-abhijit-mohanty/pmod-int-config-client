package cah.pharma.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cah.pharma.configclient.bean.BeanConfiguration;

@RestController
public  class  ConfigServiceController {
	
	@Value ("${values.fix_value}")
	String valueFix;
	
	@Value ("${values.value_function}")
	String valueFunction;
	
	@Autowired
	private  Configuration configuration;

	@Autowired
	private  ConfigurationData configurationData;

	@GetMapping("/limits")
	public  BeanConfiguration  getConfiguration ()
	{
		return  new  BeanConfiguration (configuration.getMinimum(),
				configuration.getMaximum(), valueFix, valueFunction);
	}
	
	
	@GetMapping("/refreshed")
	public  BeanConfiguration  getRefreshConfiguration (@Value("${values.value_function}") String  valueFunction )
	{
		return  new  BeanConfiguration (configuration.getMinimum(),
				configuration.getMaximum(), valueFix, valueFunction);
	}
	@GetMapping("/data")
	public  ConfigurationData  retrieveDatosFromConfigurations () {
		return configurationData;
	}
	
}
