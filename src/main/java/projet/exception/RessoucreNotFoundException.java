package projet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RessoucreNotFoundException extends RuntimeException {

	
	
//	
//	private static final long serialVersionUID = -2055312715341091957L;
//
//	public RessoucreNotFoundException(String message) {
//		
//		super(message);
//	}
//	
	
	
	

}
