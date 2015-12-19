
/**
 * RouterSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package vn.org.gs1.gepir.www;

import java.math.BigDecimal;
import java.sql.*;
import vn.org.gs1.gepir.load.*;


import org.apache.axis2.databinding.types.*;

/**
 * RouterSkeleton java skeleton for the axisService
 */
public class RouterSkeleton {
	
	private DBConnection db = new DBConnection();

	/**
	 * Auto generated method signature Obtains owner of a GLN
	 * 
	 * @param getOwnerOfGLN
	 * @return gepirParty
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getOwnerOfGLN(vn.org.gs1.gepir.www.GetOwnerOfGLNE getOwnerOfGLN) {
		BigDecimal version = getOwnerOfGLN.getGetOwnerOfGLN().getVersion();
		String gln = getOwnerOfGLN.getGetOwnerOfGLN().getRequestedGln();
		System.out.println("received request gln"+ gln);
		ArrayOfLanguage requestedLanguages = getOwnerOfGLN.getGetOwnerOfGLN().getRequestedLanguages();
		Language[] requestedLanguageToArray = requestedLanguages.getLanguage();
		int numberOfLanguage = requestedLanguageToArray.length;
		
		Connection conn = db.getDBConnection();
		String SQL1 = "SELECT * FROM IDD.dbo.DD_COMPANY_GLN WHERE GLN =" + "'" + gln + "'";
		
		GepirParty gepirParty = new GepirParty();
		GepirPartyE gepirPartyE = new GepirPartyE();
		PartyDataLineType[] partyDataLineTypeArray = new PartyDataLineType[numberOfLanguage];
		
		for (int i = 0; i < numberOfLanguage; i++){
			try{
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL1);
				while(rs.next()){
					partyDataLineTypeArray[i] = new PartyDataLineType();
					partyDataLineTypeArray[i].setPartyName(rs.getString("Name"));
					System.out.println(rs.getString("Name"));
				}
			}catch (Exception e) {
				System.out.println(e.getClass().getName());
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}
		
		
		gepirParty.setPartyDataLine(partyDataLineTypeArray);
		gepirParty.setVersion(version);
		gepirPartyE.setGepirParty(gepirParty);
		return gepirPartyE;
	}

	/**
	 * Auto generated method signature Obtains Item information based on a GTIN
	 * 
	 * @param getItemByGTIN
	 * @return gepirItem
	 */

	public vn.org.gs1.gepir.www.GepirItemE getItemByGTIN(vn.org.gs1.gepir.www.GetItemByGTINE getItemByGTIN) {
		String requestedGtin = getItemByGTIN.getGetItemByGTIN().getRequestedGtin();
		
		ArrayOfLanguage requestedLanguages = getItemByGTIN.getGetItemByGTIN().getRequestedLanguages();
		Connection conn = db.getDBConnection();
		String SQL1 = "SELECT * FROM IDD.dbo.DD_ITEM WHERE GTIN =" + "'" + requestedGtin +"'";  
		GepirItemE gepirItemE = new GepirItemE();
		GepirItem  gepirItem  = new GepirItem();
		
		Language[] requestedLanguageToArray = requestedLanguages.getLanguage();
		
		int numberOfLanguage = requestedLanguageToArray.length;
		
		
		ItemDataLineType[] itemDataLineTypeArray = new ItemDataLineType[numberOfLanguage];
		for (int i =0;i<numberOfLanguage;i++){
		try{
			Statement stmt = conn.createStatement();  
            ResultSet rs = stmt.executeQuery(SQL1);
            while(rs.next()){
            	itemDataLineTypeArray[i] = new ItemDataLineType();
            	itemDataLineTypeArray[i].setItemName(rs.getString("Product_Name_V"));
            	System.out.println(rs.getString("Product_Name_V"));
            	itemDataLineTypeArray[i].setGtin(requestedGtin);
            	itemDataLineTypeArray[i].setInformationProviderGln(rs.getString("Provider_GLN"));
            	
            	itemDataLineTypeArray[i].setTradeItemUnitDescriptor(ItemDataLineTypeTradeItemUnitDescriptor.BASE_UNIT_OR_EACH);
            	
            }
            db.closeDB(conn);
		}
		catch(Exception e)  
	       { 
	    	   	System.out.println(e.getClass().getName());
	            System.out.println(e.getMessage()); 
	            System.exit(0);  
	       } 
		
		}
		gepirItem.setItemDataLine(itemDataLineTypeArray);
		gepirItemE.setGepirItem(gepirItem);
		return gepirItemE;
		
	}

	/**
	 * Auto generated method signature Gepir Server Swiss for client version 2
	 * 
	 * @param gepirVersion2Request
	 * @return gepirVersion2Response
	 */

	public vn.org.gs1.gepir.response.GepirVersion2Response gepirVersion2(
			vn.org.gs1.gepir.request.GepirVersion2Request gepirVersion2Request) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#gepirVersion2");
	}

	/**
	 * Auto generated method signature Obtains the Party info of a GLN
	 * 
	 * @param getPartyByGLN
	 * @return gepirParty2
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getPartyByGLN(vn.org.gs1.gepir.www.GetPartyByGLNE getPartyByGLN) {
		BigDecimal version = getPartyByGLN.getGetPartyByGLN().getVersion();
		String[] gln = getPartyByGLN.getGetPartyByGLN().getRequestedGln();
		System.out.println("received request gln:"+ gln.toString());
		ArrayOfLanguage requestedLanguage = getPartyByGLN.getGetPartyByGLN().getRequestedLanguages();
		Language[] requestedLanguageToArray = requestedLanguage.getLanguage();
		int numberOfLanguage = requestedLanguageToArray.length;
		
		Connection conn = db.getDBConnection();
		String SQL1 = "SELECT * FROM IDD.dbo.DD_COMPANY_GLN WHERE GLN =" + "'" + gln + "'";
		
		GepirParty gepirParty = new GepirParty();
		GepirPartyE gepirPartyE = new GepirPartyE();
		PartyDataLineType[] partyDataLineTypeArray = new PartyDataLineType[numberOfLanguage];
		
		for (int i = 0; i < numberOfLanguage; i++){
			try{
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(SQL1);
				while(rs.next()){
					partyDataLineTypeArray[i] = new PartyDataLineType();
					partyDataLineTypeArray[i].setPartyName(rs.getString("Name"));
					System.out.println(rs.getString("Name"));
				}
			}catch (Exception e) {
				System.out.println(e.getClass().getName());
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}
		
		gepirParty.setPartyDataLine(partyDataLineTypeArray);
		gepirParty.setVersion(version);
		gepirPartyE.setGepirParty(gepirParty);
		return gepirPartyE;
	}

	/**
	 * Auto generated method signature Get Gepir Authorization
	 * 
	 * @param getAuthorization
	 * @return gepirAuthorization
	 */

	public vn.org.gs1.gepir.www.GepirAuthorizationE getAuthorization(
			vn.org.gs1.gepir.www.GetAuthorizationE getAuthorization) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getAuthorization");
	}

	/**
	 * Auto generated method signature Obtains the Party info by name
	 * 
	 * @param getPartyByName
	 * @return gepirParty5
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getPartyByName(vn.org.gs1.gepir.www.GetPartyByNameE getPartyByName) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getPartyByName");
	}

	/**
	 * Auto generated method signature SetAuthorize
	 * 
	 * @param sessionAuthorize
	 * @return sessionAuthorizeResponse
	 */

	public vn.org.gs1.gepir.www.SessionAuthorizeResponse sessionAuthorize(
			vn.org.gs1.gepir.www.SessionAuthorize sessionAuthorize) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#sessionAuthorize");
	}

	/**
	 * Auto generated method signature Obtains GLN based on a GTIN
	 * 
	 * @param getPartyByGTIN
	 * @return gepirParty7
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getPartyByGTIN(vn.org.gs1.gepir.www.GetPartyByGTINE getPartyByGTIN) {
		Connection conn = db.getDBConnection();
		BigDecimal version = getPartyByGTIN.getGetPartyByGTIN().getVersion();
		
		String[] requestedGTIN = getPartyByGTIN.getGetPartyByGTIN().getRequestedGtin();
		ArrayOfLanguage requestedLanguage = getPartyByGTIN.getGetPartyByGTIN().getRequestedLanguages();
		
		int numberOfGTIN = requestedGTIN.length;
		int numberOfLanguage = requestedLanguage.getLanguage().length;
		
		GepirParty gepirParty = new GepirParty();
		GepirPartyE gepirPartyE = new GepirPartyE();
		PartyDataLineType[] partyDataLineTypeArray = new PartyDataLineType[numberOfLanguage];
		
		
		for (int i =0; i < numberOfGTIN; i++){
			String SQL1 = "SELECT * FROM IDD.dbo.DD_ITEM WHERE GTIN =" + "'" + requestedGTIN[i] +"'";
			for (int i2 = 0; i < numberOfLanguage; i++){
				try{
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(SQL1);
					while(rs.next()){
						partyDataLineTypeArray[i2] = new PartyDataLineType();
						partyDataLineTypeArray[i2].setPartyName(rs.getString("Brand_Name_V"));
						System.out.println(rs.getString("Brand_Name_V"));
					}
				}catch (Exception e) {
					System.out.println(e.getClass().getName());
					System.out.println(e.getMessage());
					System.exit(0);
				}
			}
		}
		
		gepirParty.setVersion(version);
		gepirParty.setPartyDataLine(partyDataLineTypeArray);
		gepirPartyE.setGepirParty(gepirParty);
		return gepirPartyE;
	}

	/**
	 * Auto generated method signature Obtains GLN based on a SSCC
	 * 
	 * @param getPartyBySSCC
	 * @return gepirParty9
	 */

	public vn.org.gs1.gepir.www.GepirPartyE getPartyBySSCC(vn.org.gs1.gepir.www.GetPartyBySSCCE getPartyBySSCC) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getPartyBySSCC");
	}

	/**
	 * Auto generated method signature Get Gepir Statistics
	 * 
	 * @param getStatistics
	 * @return gepirStatistics
	 */

	public vn.org.gs1.gepir.www.GepirStatisticsE getStatistics(vn.org.gs1.gepir.www.GetStatisticsE getStatistics) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getStatistics");
	}

}
