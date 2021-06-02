/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.ecct.arap.rest.ws;

import ec.edu.utpl.ecct.arap.rest.entities.Estudiante;
import ec.edu.utpl.ecct.arap.rest.util.DataBase;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author jorgaf
 */
@Path("/estudiantes")
public class EstudianteResource {
    private final DataBase db = new DataBase();
    @GET
    @Produces({"application/xml", "application/json"})
    public List<Estudiante> getAll(){
        return db.getAllEstudiantes();
    }
    
//    @GET
//    @Path("/{ced}")
//    public Estudiante getEstudianteByCedula(@PathParam("ced") String cedula){
//        return db.getEstudiante(cedula);
//    }
    @GET
    public Response getEstudianteByCedula(@QueryParam("ced") String cedula){
        Estudiante output;
        
        output = db.getEstudiante(cedula);
        
        if(output != null){
            return Response.status(200).entity(output).build();
        } else {
            return Response.status(404).build();
        }
    }
}
