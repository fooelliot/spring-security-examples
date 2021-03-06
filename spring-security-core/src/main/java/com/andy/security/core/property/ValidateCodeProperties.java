package com.andy.security.core.property;

import lombok.Data;

/**
 * @author Leone
 * @since 2018-04-07 07:59
 **/
@Data
public class ValidateCodeProperties {

    private ImageCodeProperties image = new ImageCodeProperties();

    private SmsCodeProperties sms = new SmsCodeProperties();

}
