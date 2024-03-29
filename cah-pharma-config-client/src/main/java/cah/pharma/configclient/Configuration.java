package cah.pharma.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties ( "limits" )
public  class  Configuration {
	private  int minimum;
	private  int maximum;	
}
