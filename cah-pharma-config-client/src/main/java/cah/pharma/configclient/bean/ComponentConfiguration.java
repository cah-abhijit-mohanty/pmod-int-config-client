package cah.pharma.configclient.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ComponentConfiguration {

	private  int   minResults;
	private  int maxResults;		
	private  String valueFix;
	private  String valueFunction;
	
	public   ComponentConfiguration ( int  minResult , int  maxResult , String  valueFix , String  valueFunction )
	{
		this . minResults = minResult;
		this . maxResults = maxResult;
		this . valueFix = valueFix;
		this . valueFunction = valueFunction;
	}
}
