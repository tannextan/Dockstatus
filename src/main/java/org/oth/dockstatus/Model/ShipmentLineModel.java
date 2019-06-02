package org.oth.dockstatus.Model;

public class ShipmentLineModel {
	
	private int outboundShipmentLineOid;
	private String lotNumber;
	private int quantityPalletsToLoad;
	private int quantityPalletsLoaded;
	private int remainingQuantityPalletsToLoad;
	private int maxPalletsInOneRun;
	private String articleId;
	private String articleDescription;
	private String packagingType;
	
	public int getoutboundShipmentLineOid()
	{
		return outboundShipmentLineOid;
	}
	
	public void setoutboundShipmentLineOid(int id)
	{
		outboundShipmentLineOid = id;
	}
	
	public String getlotNumber()
	{
		return lotNumber;
	}
	
	public void setlotNumber(String lot)
	{
		lotNumber = lot;
	}
	
	public int getquantityPalletsToLoad()
	{
		return quantityPalletsToLoad;
	}
	
	public void setquantityPalletsToLoad(int qty)
	{
		quantityPalletsToLoad = qty;
	}
	
	public int getquantityPalletsLoaded()
	{
		return quantityPalletsLoaded;
	}
	
	public void setquantityPalletsLoaded(int qty)
	{
		quantityPalletsLoaded = qty;
	}
	
	public int getremainingQuantityPalletsToLoad()
	{
		return remainingQuantityPalletsToLoad;
	}
	
	public void setremainingQuantityPalletsToLoad(int qty)
	{
		remainingQuantityPalletsToLoad = qty;
	}
	
	public int getmaxPalletsInOneRun()
	{
		return maxPalletsInOneRun;
	}
	
	public void setmaxPalletsInOneRun(int max)
	{
		maxPalletsInOneRun = max;
	}
	
	public String getarticleId()
	{
		return articleId;
	}
	
	public void setarticleId(String id)
	{
		articleId = id;
	}
	
	public String getarticleDescription()
	{
		return articleDescription;
	}
	
	public void setarticleDescription(String desc)
	{
		articleDescription = desc;
	}
	
	public String getpackagingType()
	{
		return packagingType;
	}
	
	public void setpackagingType(String pack)
	{
		packagingType = pack;
	}
}
