package com.pawelm.jaxrscourse.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by PawelM on 2017-03-21.
 */
@Path("/")
public class CommentResource {

    @GET
    public String test(){
        return "new sub resources";
    }

    @GET
    @Path("/{commentId}")
    public String test2(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId){
        return "new sub resources messageId " + messageId + ", commentId " + commentId;
    }
}
