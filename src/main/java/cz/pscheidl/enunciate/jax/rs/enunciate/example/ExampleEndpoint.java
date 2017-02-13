/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pscheidl.enunciate.jax.rs.enunciate.example;

import com.webcohesion.enunciate.metadata.rs.TypeHint;
import cz.pscheidl.enunciate.jax.rs.enunciate.example.model.Greeting;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Path("/example")
public class ExampleEndpoint {

    /**
     *
     * @param userGreeting Example documented query parameter
     */
    @GET
    @TypeHint(Greeting.class)
    @Produces({MediaType.APPLICATION_JSON})
    public Response example(@DefaultValue("Example") @QueryParam("greeting") String userGreeting) {
        Greeting greeting = new Greeting();
        greeting.setGreeting(userGreeting);

        return Response.ok(greeting).build();
    }

}
