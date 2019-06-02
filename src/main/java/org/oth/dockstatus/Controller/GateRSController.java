package org.oth.dockstatus.Controller;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.sf.json.*;

import org.oth.dockstatus.Model.*;

public class GateRSController {

	private Client client;
	private String Service_URI;
	private String Lic_Key;
	
	protected void init()
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		Service_URI = fc.getExternalContext().getInitParameter("metadata-serviceurl");
		Lic_Key = fc.getExternalContext().getInitParameter("metadata-LicKey");
		client = ClientBuilder.newClient();
	}
	
	@SuppressWarnings("deprecation")
	public List<GateModel> ReadData() 
	{
		try 
		{
			init();
			Invocation.Builder builder = client.target(Service_URI).request(MediaType.APPLICATION_JSON_TYPE);
			Response response = builder.get();
			net.sf.json.JSONArray jsonArray =  (net.sf.json.JSONArray) JSONSerializer.toJSON(response.readEntity(String.class));
			List<GateModel> gateModel = net.sf.json.JSONArray.toList(jsonArray, GateModel.class);
			net.sf.json.JSONObject jsonObject = (net.sf.json.JSONObject) jsonArray.get(0);
			client.close();
			return gateModel;
		} catch(Exception e) {e.printStackTrace(); return null;}
		
	}
	
	
	
}
