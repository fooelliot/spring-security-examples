package com.andy.validate.code.sms;

/**
 * @author Leone
 * @since 2018-04-07 10:18
 **/
public interface SmsCodeSender {
    void send(String mobile, String code);
}
