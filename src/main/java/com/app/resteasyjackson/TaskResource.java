package com.app.resteasyjackson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/task")
@Produces(MediaType.APPLICATION_JSON)
public class TaskResource {

    private static final Logger log = LoggerFactory.getLogger(LoggingFilter.class);

    @GET
    public Response taskGET(@QueryParam("id") Integer id) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            log.error("Sleep de 4 segundos interrompido");
            return Response.serverError().build();
        }

        return Response.ok(new ApiResponse("Task with id=" + id + " OK!")).build();
    }

}
