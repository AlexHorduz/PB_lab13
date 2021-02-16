package lab13_PB;

public class EmptyNameException 
	extends Exception{
		public EmptyNameException(String errorMessage, Throwable cause) {
			super(errorMessage, cause);
		}
		
		public EmptyNameException(String errorMessage) {
			super(errorMessage);
		}
} 
