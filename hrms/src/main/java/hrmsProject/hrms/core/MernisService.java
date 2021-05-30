package hrmsProject.hrms.core;

import java.rmi.RemoteException;

import hrmsProject.hrms.entities.concretes.Candidate;

public interface MernisService {
	
  public boolean mernisVerify(Candidate candidate);

}
