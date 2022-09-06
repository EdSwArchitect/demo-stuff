package com.bscllc.demo.skills.config;

import com.bscllc.demo.skills.rest.CacheService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class CacheAppConfig extends ResourceConfig {
    public CacheAppConfig() {
        registerClasses(CacheService.class);
    }
}
