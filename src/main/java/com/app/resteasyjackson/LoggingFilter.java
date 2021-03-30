package com.app.resteasyjackson;

import io.vertx.core.http.HttpServerRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

@Provider
public class LoggingFilter implements ContainerRequestFilter {

    private static final Logger log = LoggerFactory.getLogger(LoggingFilter.class);

    @Context
    UriInfo info;

    @Context
    HttpServerRequest request;

    @Override
    public void filter(ContainerRequestContext context) {

        final String method = context.getMethod();
        //final String path = info.getPath();
        final String path = info.getBaseUri().relativize(info.getRequestUri()).toString();
        //final String address = request.remoteAddress().toString();
        final String address = request.remoteAddress().host();

        log.info("Request {} /{} from IP {}", method, path, address);
    }
}
