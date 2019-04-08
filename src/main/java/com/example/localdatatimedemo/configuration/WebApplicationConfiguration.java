package com.example.localdatatimedemo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description TODO
 *
 * @author Roye.L
 * @since 2019/4/8 22:41
 */
@Configuration
public class WebApplicationConfiguration implements WebMvcConfigurer {

    /*@Bean
    public HttpMessageConverters customConverters() {
        Collection<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
        messageConverters.add(gsonHttpMessageConverter);
        return new HttpMessageConverters(true, messageConverters);
    }*/

}
