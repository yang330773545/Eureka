package com.vinzor.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

public class ProducerFallback implements FallbackProvider {

	private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);
/**
 * 
 * 当服务出现异常时，打印相关异常信息，并返回”The service is unavailable.”
 * Zuul 目前只支持服务级别的熔断，不支持具体到某个URL进行熔断。
 * 
 * 
 * 
 */
	
	
	
	//指定要处理的spring.application.name
    @Override
    public String getRoute() {
        return "spring-cloud-producer";
    }

    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                return "OK";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("The service is unavailable.".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
    }

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		// TODO Auto-generated method stub
	       if (cause != null && cause.getCause() != null) {
	            String reason = cause.getCause().getMessage();
	            logger.info("Excption {}",reason);
	        }
	        return fallbackResponse();
	}

}
