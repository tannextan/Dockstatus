package org.oth.dockstatus.Model;

public class GateModel {
	private int gateOid;
	private String identification;
	private String gateName;
	private String gateStatus;
	private String loadingStatus;
	private int totalQuantityPalletsLoaded;
	private int totalQuantityPalletsToLoad;
	
	public void setgateOid(int id)
	{
		gateOid = id;
	}
	
	public int getgateOid()
	{
		return gateOid;
	}
	
	public void setidentification(String ident)
	{
		identification = ident;
	}
	
	public String getidentification()
	{
		return identification;
	}
	
	public void setgateName(String name)
	{
		gateName = name;
	}
	
	public String getgateName()
	{
		return gateName;
	}
	
	public void setgateStatus(String status)
	{
		gateStatus = status;
	}
	
	public String getgateStatus()
	{
		return gateStatus;
	}
	
	public void setloadingStatus(String status)
	{
		loadingStatus = status;
	}
	
	public String getloadingStatus()
	{
		return loadingStatus;
	}
	
	public void settotalQuantityPalletsLoaded(int qty)
	{
		totalQuantityPalletsLoaded = qty;
	}
	
	public int gettotalQuantityPalletsLoaded()
	{
		return totalQuantityPalletsLoaded;
	}
	
	public void settotalQuantityPalletsToLoad(int qty)
	{
		totalQuantityPalletsToLoad = qty;
	}
	
	public int gettotalQuantityPalletsToLoad()
	{
		return totalQuantityPalletsToLoad;
	}
}
