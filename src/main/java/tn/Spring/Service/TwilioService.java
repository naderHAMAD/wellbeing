package tn.Spring.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import tn.Spring.Entity.SmsRequest;
import tn.Spring.Entity.SmsSender;

@Service
public class TwilioService {
 private final SmsSender smsSender;

public  TwilioService(@Qualifier("twilio") TwilioSmsSender smsSender) {
	this.smsSender = smsSender;
}

public void sendSms(SmsRequest smsRequest) {
	smsSender.sendSms(smsRequest);
}
}
