package hrmsProject.hrms.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{

	public SuccessDataResult(T data,  String message) {
		super(data, true, message);
		
	}
	
	public SuccessDataResult(T data) {
		super(data, true, null);
		
	}
	
	public SuccessDataResult(String message) {
		super(null, true, message);
		
	}
	
	public SuccessDataResult(boolean success) {
		super(null, true, null);
		
	}


}
