package com.redhat.samples.fuse.cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/greeting")
public interface GreetingResource {
    @GET
    @Path("/hello/{name}")
    String hello(@PathParam("name") String name);
}
