package org.oth.dockstatus.Model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="GateShipmentModel", eager=true)
@ApplicationScoped
public class GateShipmentModel {

	private int gateOid;
	private String gateName;
	private String outboundShipmentIdentification;
	private String loadingStatus;
	private String customerName;
	private String customerOrder;
	private String transporter;
	private int totalQuantityPalletsLoaded;
	private int totalQuantityPalletsToLoad;
	private ShipmentLineModel[] outboundShipmentLines;
	
	
	public int getgateOid()
	{
		return gateOid;
	}
	
	public void setgateOid(int id)
	{
		gateOid = id;
	}
	
	public String getgateName()
	{
		return gateName;
	}
	
	public void setgateName(String name)
	{
		gateName = name;
	}
	
	public String getoutboundShipmentIdentification()
	{
		return outboundShipmentIdentification;
	}
	
	public void setoutboundShipmentIdentification(String id)
	{
		outboundShipmentIdentification = id;
	}
	
	public String getloadingStatus()
	{
		return loadingStatus;
	}
	
	public void setloadingStatus(String status)
	{
		loadingStatus = status;
	}
	
	public String getcustomerName()
	{
		return customerName;
	}
	
	public void setcustomerName(String name)
	{
		customerName = name;
	}
	
	public String getcustomerOrder()
	{
		return customerOrder;
	}
	
	public void setcustomerOrder(String order)
	{
		customerOrder = order;
	}
	
	public String gettransporter()
	{
		return transporter;
	}
	
	public void settransporter(String name)
	{
		transporter = name;
	}
	
	public int gettotalQuantityPalletsLoaded()
	{
		return totalQuantityPalletsLoaded;
	}
	
	public void settotalQuantityPalletsLoaded(int qty)
	{
		totalQuantityPalletsLoaded = qty;
	}
	
	public int gettotalQuantityPalletsToLoad()
	{
		return totalQuantityPalletsToLoad;
	}
	
	public void settotalQuantityPalletsToLoad(int qty)
	{
		totalQuantityPalletsToLoad = qty;
	}
	
	public ShipmentLineModel[] getoutboundShipmentLines()
	{
		return outboundShipmentLines;
	}
	
	public void setoutboundShipmentLines(ShipmentLineModel[] slm)
	{
		outboundShipmentLines = slm;
	}
	
}
