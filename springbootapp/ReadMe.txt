https://www.javacodegeeks.com/2015/01/getting-started-with-jersey-and-spring-boot.html

https://github.com/geowarin/springboot-jersey/blob/master/pom.xml 

http://www.javarticles.com/2016/01/spring-componentscan-annotation-example.html







https://spring.io/guides/gs/spring-boot/ 
https://spring.io/guides 
https://www.javacodegeeks.com/2015/01/getting-started-with-jersey-and-spring-boot.html 
https://geowarin.github.io/a-simple-spring-boot-and-jersey-application.html 
https://dzone.com/articles/scala-calculating-distance-between-two-locations 

https://github.com/jersey/jersey/blob/2.26/examples/helloworld-spring-webapp/src/main/resources/applicationContext.xml 
https://jersey.github.io/ 
https://jersey.github.io/documentation/latest/spring.html 
https://jersey.github.io/documentation/latest/index.html 
https://repo1.maven.org/maven2/org/glassfish/jersey/jersey-documentation/2.5.1/jersey-documentation-2.5.1-user-guide.pdf 








https://ponyfoo.com/articles/json-web-tokens-vs-session-cookies 

https://auth0.com/blog/refresh-tokens-what-are-they-and-when-to-use-them/ 

https://auth0.com/blog/blacklist-json-web-token-api-keys/ 

https://jwt.io/introduction/ 

















<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
  <display-name>Archetype Created Web Application</display-name>
  <servlet>
		<servlet-name>Jersey Web Application</servlet-name>
		<servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
		  <init-param>
        <param-name>com.sun.jersey.spi.container.ContainerResponseFilters</param-name>
        <param-value>com.restful.service.CORSFilter</param-value>
    </init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>Jersey Web Application</servlet-name>
		<url-pattern>/services/*</url-pattern>
	</servlet-mapping>
</web-app>








package com.restful.service;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

public class CORSFilter implements ContainerResponseFilter {

    @Override
    public ContainerResponse filter(ContainerRequest request,
        ContainerResponse response) {
        response.getHttpHeaders().add("Access-Control-Allow-Origin", request.getHeaderValue("Origin"));
        response.getHttpHeaders().add("Access-Control-Allow-Headers",
            "origin, content-type, accept, authorization, x-auth-token, responseType, sm_user");
        response.getHttpHeaders().add("Access-Control-Allow-Credentials","true");
        response.getHttpHeaders().add("Access-Control-Expose-Headers", "x-auth-token");
        response.getHttpHeaders().add("Access-Control-Allow-Methods",
            "GET, POST, PUT, DELETE, OPTIONS, HEAD");
       
//        	CorsConfiguration configuration = new CorsConfiguration();
//        			configuration.setAllowedOrigins(Arrays.asList("*"));
//        			configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
//        			configuration.setAllowedHeaders(Arrays.asList("authorization", "content-type", "x-auth-token"));
//        			configuration.setExposedHeaders(Arrays.asList("x-auth-token"));
//        			UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        			source.registerCorsConfiguration("/**", configuration); 
    
        
        
        
        
//        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//        response.setHeader("Access-Control-Allow-Methods",
//                "POST, GET, OPTIONS, DELETE");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        response.setHeader("Access-Control-Allow-Headers", "X-CSRF-Token, X-Requested-With, Content-Type, Accept");
//        response.setHeader("Access-Control-Expose-Headers", "X-CSRF-Token");
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        
//        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//        response.setHeader("Pragma", "no-cache");
//        response.setHeader("Expires", "0");


        return response;
    }
}
