/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.pscheidl.enunciate.jax.rs.enunciate.example.model;

import com.webcohesion.enunciate.metadata.DocumentationExample;

/**
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
public class Greeting {

    private String greeting;

    @DocumentationExample("Example documentation of the field")
    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}
