
/**
 * RouterSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package vn.org.gs1.gepir.www;

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
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getOwnerOfGLN");
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
            	
            }
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
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getPartyByGLN");
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
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getPartyByGTIN");
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
