package com.teedjay;

import org.jglue.cdiunit.CdiRunner;
import org.jglue.cdiunit.InRequestScope;
import org.jglue.cdiunit.jaxrs.SupportJaxRs;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(CdiRunner.class)
@SupportJaxRs
@InRequestScope
public class QuoteResourceTest {

    @Inject QuoteResource quoteResource;

    @Test
    public void allQuotesAsList() {
        assertEquals(2, quoteResource.allQuotesAsList().size());
    }

    @Ignore("Response does not work with cdiunit and jee8 yet")
    @Test
    public void allQuotesAsResponse() {
        Response response = quoteResource.allQuotesAsResponse();
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        List<Quote> quotes = (List<Quote>) response.getEntity();
        assertEquals(2, quotes.size());
    }

    @Ignore("Response does not work with cdiunit and jee8 yet")
    @Test
    public void alwaysReturnError() {
        Response response = quoteResource.alwaysReturnError();
        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), response.getStatus());
    }

}