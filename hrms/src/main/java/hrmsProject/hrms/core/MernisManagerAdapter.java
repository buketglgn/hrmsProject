package hrmsProject.hrms.core;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements MernisService {

	
	public boolean mernisVerify() throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublic= new KPSPublicSoapProxy();
		
		boolean result= kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("34573780366"), "BUKET", "GÜLGÜN", 1996);
		
		return result;
	}

}
