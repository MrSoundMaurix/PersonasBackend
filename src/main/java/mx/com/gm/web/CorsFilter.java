/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.web;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
/**
 *
 * @author MrSoundMaurix
 * @Name Rene Ipiales
 */
@Provider
public class CorsFilter implements ContainerResponseFilter{

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext reponseContext) throws IOException {
    
        MultivaluedMap<String,Object>headers=reponseContext.getHeaders();
        headers.add("Access-Control-Allow-Origin","*");
        headers.add("Acces-Control-Allow-Credentials","true");
        headers.add("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Acept, Authorization");
        headers.add("Access-Control-Allow-Methods","GET,POST,PUT,DELETE,OPTIONS,HEAD");
    }
    
}
