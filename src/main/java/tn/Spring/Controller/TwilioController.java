package tn.Spring.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.Spring.Entity.SmsRequest;
import tn.Spring.Service.TwilioService;

@RestController
@RequestMapping("api/v1/sms")
public class TwilioController {
	private TwilioService  twilioService;
	 @Autowired
	public TwilioController(TwilioService  twilioService) {
		this.twilioService =twilioService;
	}
	@PostMapping
	public void sendSms(@Valid@RequestBody SmsRequest smsRequest) {
		twilioService.sendSms(smsRequest);
	}
	
}
