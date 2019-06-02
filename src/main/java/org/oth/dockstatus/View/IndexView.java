package org.oth.dockstatus.View;

import java.io.IOException;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.oth.dockstatus.Controller.*;
import org.oth.dockstatus.Model.GateModel;
import org.oth.dockstatus.Model.GateShipmentModel;

@Named
@ApplicationScoped
public class IndexView {
	private GateRSController restController =  new GateRSController();
	private GateShipmentRSController gateRestController =  new GateShipmentRSController();
	private String result = "";
	private List<GateModel> gateModel;
	private GateShipmentModel gateShipmentModel;
	
	public String getResult() 
	{
		int n = 4;   
		gateModel = restController.ReadData();
		result = gateModel.get(n).getgateStatus() + " - " + gateModel.get(n).getloadingStatus() + " - " + gateModel.get(n).gettotalQuantityPalletsToLoad();
		gateShipmentModel = gateRestController.ReadData(5);
		if(gateShipmentModel != null)
		{
		System.out.println(gateShipmentModel.getcustomerName());
		result = result + "\n" + gateShipmentModel.getoutboundShipmentIdentification() + " - " + gateShipmentModel.getgateName() + " - " + gateShipmentModel.gettransporter() 
		+ " - " + gateShipmentModel.getoutboundShipmentLines()[0].getarticleDescription() + "  - Total line - " + gateShipmentModel.getoutboundShipmentLines().length;
		}
		return result;
	}
	
}
