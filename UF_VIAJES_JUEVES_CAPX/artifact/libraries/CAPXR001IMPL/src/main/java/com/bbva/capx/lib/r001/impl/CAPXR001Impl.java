package com.bbva.capx.lib.r001.impl;

import com.bbva.capx.dto.viajes.DtoOut;
import com.bbva.capx.dto.viajes.DTOResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.capx.lib.r001.CAPXR001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
 
public class CAPXR001Impl extends CAPXR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CAPXR001.class);

	@Override
	public DtoOut execute(String originPoint, String destinationPoint) {
		LOGGER.info("servicio ORIGEN"+ originPoint);
		LOGGER.info("servicio ORIGEN"+ destinationPoint);
		List<List<HashMap<String, String>>> RESP = getRutasGoogle(originPoint, destinationPoint);	
		LOGGER.info("servicio RESP"+ RESP);
		DtoOut S1 = new DtoOut();
		
		return S1;
	}
	
	private List<List<HashMap<String, String>>> getRutasGoogle(String pointA, String pointB) {
		 //Se define el objeto URL 
		JSONObject jsonObj = null;
		String  reqtUrl = null;
		BufferedReader in = null;
		String END_POINT = "https://maps.googleapis.com/maps/api/distancematrix/json?";
		List<List<HashMap<String, String>>> route = null;
		JSONArray routes = null;
		
		try {
			HttpClient httpClient = new DefaultHttpClient();
	       List<BasicNameValuePair> params = new LinkedList<BasicNameValuePair>();    
           params.add(new BasicNameValuePair("origins", pointA));
           params.add(new BasicNameValuePair("destinations", pointB));
           params.add(new BasicNameValuePair("key", "AIzaSyCRddNuUxbREG5ennBUkb-yYi13LatNKdo"));
           params.add(new BasicNameValuePair("mode", "transit"));
           String strParams = URLEncodedUtils.format(params, "utf-8");
           reqtUrl = END_POINT + strParams;
           //Creamos objeto para armar peticion de tipo HTTP GET 
           HttpGet getReq = new HttpGet(reqtUrl);
           //getReq.setHeader("Content-type", "application/json");
           
	        //Se ejecuta el envio de la peticion y se espera la respuesta de la misma. 
	        HttpResponse response = httpClient.execute(getReq);
	        LOGGER.info("response ", response.getStatusLine().toString());

           //Obtengo el contenido de la respuesta en formato InputStream Buffer y la paso a formato String 
	        in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
           StringBuffer sb = new StringBuffer("");
           String line = "";
           String NL = System.getProperty("line.separator");
           while ((line = in.readLine()) != null) {
               sb.append(line + NL);
           }
          
           String strJSON = sb.toString();
           jsonObj = new JSONObject(strJSON);
           routes  = jsonObj.getJSONArray("rows");
           LOGGER.info("jsonObj " + jsonObj);
           LOGGER.info("JSON " + strJSON);        
           LOGGER.info("routes" + routes);
           LOGGER.info("rows " + jsonObj.getJSONArray("rows"));
           Gson gson = new Gson();
           DTOResponse data = gson.fromJson(strJSON, DTOResponse.class);
           LOGGER.info("data " + data);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} finally {
           if (in != null) {
               try {
                   in.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }	
		return route;
	}		
}
