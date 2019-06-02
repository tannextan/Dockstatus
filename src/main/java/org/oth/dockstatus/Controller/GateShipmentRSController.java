package org.oth.dockstatus.Controller;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.oth.dockstatus.Model.GateModel;
import org.oth.dockstatus.Model.GateShipmentModel;

import net.sf.json.JSONSerializer;

public class GateShipmentRSController {

	private Client client;
	private String REST_URI;
	private String Lic_Key;
	
	protected void init()
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		REST_URI = fc.getExternalContext().getInitParameter("metadata-RESTURL");
		Lic_Key = fc.getExternalContext().getInitParameter("metadata-LicKey");
		client = ClientBuilder.newClient();
	}
	
	@SuppressWarnings("deprecation")
	public GateShipmentModel ReadData(int GateID) 
	{
		try 
		{
			init();
			Invocation.Builder builder = client.target(REST_URI).path(Integer.toString(GateID)).request(MediaType.APPLICATION_JSON_TYPE);
			Response response = builder.get();
			if(response.getStatus() != 200) {return null;}
			net.sf.json.JSONObject jsonObject =  (net.sf.json.JSONObject) JSONSerializer.toJSON(response.readEntity(String.class));
			GateShipmentModel gateShipment = (GateShipmentModel) net.sf.json.JSONObject.toBean(jsonObject, GateShipmentModel.class);
			client.close();
			return gateShipment;
		} catch(Exception e) {e.printStackTrace(); return null;}
		
	}
}
