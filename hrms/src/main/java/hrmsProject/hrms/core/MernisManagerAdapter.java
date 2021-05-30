package hrmsProject.hrms.core;

import java.rmi.RemoteException;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;

import hrmsProject.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisManagerAdapter implements MernisService {
	
	public boolean mernisVerify(Candidate candidate)  {
		
		KPSPublicSoapProxy kpsPublic= new KPSPublicSoapProxy();
		boolean result=false;
		try {
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(candidate.getBirthyear());
			int year = calendar.get(Calendar.YEAR);
			
			result = kpsPublic.TCKimlikNoDogrula(
						Long.parseLong(candidate.getNationalityId()), candidate.getFirstName().toUpperCase(),
						candidate.getLastName().toUpperCase(), year);
		} 
		
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
			return result;
		}
	

}
