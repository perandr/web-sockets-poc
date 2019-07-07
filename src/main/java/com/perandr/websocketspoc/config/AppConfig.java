package com.perandr.websocketspoc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({MVCConfig.class, Services.class})
@Import({MVCConfig.class, Services.class, WebSocketConfig.class})
public class AppConfig {


}
