package com.jd.client;

import com.jd.model.EmpRequest;
import com.jd.model.EmpResponse;
import com.jd.model.ErrorResponse;
import com.jd.model.Track;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import javax.ws.rs.core.MediaType;

/**
 * Created by 205025 on 6/7/2016.
 */
public class EmpClient {
    public static void main(String[] args) {
//        String uri = "http://localhost:8080/rest/emp/getEmp";
//        EmpRequest request = new EmpRequest();
//        //set id as 1 for OK response
//        request.setId(2);
//        request.setName("PK");
//        try{
//            Client client = Client.create();
//            WebResource r=client.resource(uri);
//            ClientResponse response = r.type(MediaType.APPLICATION_XML).post(ClientResponse.class,request );
//            System.out.println("Statu is"+response.getStatus());
//            if(response.getStatus() == 200){
//                EmpResponse empResponse = response.getEntity(EmpResponse.class);
//                System.out.println(empResponse.getId() + "::"+empResponse.getName());
//            }else{
//                ErrorResponse exc = response.getEntity(ErrorResponse.class);
//                System.out.println(exc.getErrorCode());
//                System.out.println(exc.getErrorId());
//            }
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        String uriJson = "http://localhost:8080/rest/json/metallica/post";
        Track request = new Track();
        //set id as 1 for OK response
        request.setSinger("Karthik");
        request.setTitle("SINGER");
        try{
            ClientConfig clientConfig = new DefaultClientConfig();
            clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
            Client client = Client.create(clientConfig);
            WebResource r=client.resource(uriJson);
            String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
            ClientResponse response = r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class,request );
            System.out.println("Statu is"+response.getStatus());
            if(response.getStatus() == 201){
                String empResponse = response.getEntity(String.class);
                System.out.println(empResponse);
            }else{
                ErrorResponse exc = response.getEntity(ErrorResponse.class);
                System.out.println(exc.getErrorCode());
                System.out.println(exc.getErrorId());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
