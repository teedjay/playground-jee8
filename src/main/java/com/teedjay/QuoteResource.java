package com.teedjay;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("quote")
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class QuoteResource {

    @GET
    public List<Quote> allQuotesAsList() {
        return Arrays.asList(Quote.createDebugData(), Quote.createDebugData());
    }

    @GET
    public Response allQuotesAsResponse() {
        return Response.ok(Arrays.asList(Quote.createDebugData(), Quote.createDebugData())).build();
    }

    @GET
    public Response alwaysReturnError() {
        //System.out.println("Headers = " + headers);
        //headers.getRequestHeaders().forEach((s,t) -> t.forEach(h -> System.out.println(h)));
        return Response.status(Response.Status.BAD_REQUEST).entity("Fucked up").build();
    }

}
