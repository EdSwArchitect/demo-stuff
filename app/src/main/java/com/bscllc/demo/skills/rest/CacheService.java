package com.bscllc.demo.skills.rest;

import com.bscllc.demo.skills.resources.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cache")
public class CacheService {
    final private static Logger logger = LoggerFactory.getLogger(CacheService.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        logger.info("Display all of the cache");
        return Response.status(200).entity("{\"success\" : true}").build();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getItem(@PathParam("id")String id) {
        logger.info("Display the cache for: {}", id);
        return Response.status(200).entity("{\"success\" : \"" + id + "\"}").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertIt(Foo foo) {
        logger.info("Post consumed: {}", foo);
        return Response.ok().build();
    }
}
