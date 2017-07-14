package io.sample.texttruncservice.App;

import java.io.IOException;

import java.io.InputStream;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
public class SubscriptionController {
	
	@Autowired
	private SubscriptionService textturnservice;
	
	@RequestMapping(value = "/subscribe", method = RequestMethod.GET)
	
	@ResponseBody
	public String subscribe (@RequestParam ("orderdetails")String orderdetails,@RequestParam ("number")int number) throws IOException, ParseException{	
		String orderDetails=orderdetails;
		
		return textturnservice.truncate(orderDetails, number);

	}

}
