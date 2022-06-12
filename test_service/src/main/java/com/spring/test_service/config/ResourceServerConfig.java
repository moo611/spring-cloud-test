package com.spring.test_service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

/**
 * 如果同时配置了ResourceServerConfigurerAdapter和WebSecurityAdapter,前者会覆盖后者，因为前者的order小于后者，order越小优先级越高
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .requestMatchers()
                .antMatchers("/test/**");//配置需要保护的资源路径
    }


    // 验证token的url
    private static final String URL = "http://localhost:8083/oauth/check_token";

    // 设置资源服务的配置信息
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {

//			设置验证Token的方法，即使用test和123456的客户端身份去URL验证token
        RemoteTokenServices tokenService = new RemoteTokenServices();

        tokenService.setCheckTokenEndpointUrl(URL);
        tokenService.setClientId("admin");
        tokenService.setClientSecret("admin123456");
        resources.tokenServices(tokenService);

    }

}