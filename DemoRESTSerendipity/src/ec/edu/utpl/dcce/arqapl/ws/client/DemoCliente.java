/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.dcce.arqapl.ws.client;

import ec.edu.utpl.dcce.arqapl.ws.client.entities.OCW;
import ec.edu.utpl.dcce.arqapl.ws.client.entities.Resultados;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jettison.JettisonConfigured;

/**
 *
 * @author jorgaf
 */
public class DemoCliente {
    public static void main(String[] args) {
        Client cliente;
        WebTarget server;
        WebTarget rBuscar;
        Invocation.Builder invocacion;
        String q = "matematicas";
        //String respuesta;
        Resultados respuesta;
        ClientConfig cnf;
        
        cnf = new ClientConfig(JacksonJsonProvider.class);
                
        cliente = ClientBuilder.newClient(cnf);
        server = cliente.target("http://carbono.utpl.edu.ec:8080/WSSearcher/webresources");
        rBuscar = server.path("serendipityrest").queryParam("q", q);
        invocacion = rBuscar.request(MediaType.APPLICATION_JSON);
        
        //respuesta = invocacion.get(String.class);
        respuesta = invocacion.get(Resultados.class);
        procesarResultados(respuesta);
        //System.out.println(respuesta);
//        try {            
//            procesarJson(respuesta);
//        } catch (JSONException ex) {
//            Logger.getLogger(DemoCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
    public static void procesarJson(String jsonInput) throws JSONException{
        JSONObject raiz = new JSONObject(jsonInput);
        JSONArray results = raiz.getJSONArray("results");
        
        for(int i = 0; i < results.length(); i ++){
            System.out.printf("%s\n", results.getJSONObject(i).getString("title"));
        }
    }
    
    public static void procesarResultados(Resultados resultados){
        for(OCW ocw : resultados.getResults()){
            System.out.printf("%s\n", ocw.getTitle());
        }
    }
    
}
