/**
 * A concrete class implementing ReturnObject interface
 *
 * @author ttadde01
 */
public class ReturnObjectImpl implements ReturnObject{
	
	private Object retObject;
	
	/**
	 * Getter method for the retObject instance variable of class ReturnObjectImpl
	 * @return retObject instance variable 
	 */	 
	public Object getRetObject(){
		return this.retObject;
	}
	 
	/**
	 * Setter method for the retObject instance variable of class ReturnObjectImpl
	 * @argument retObject of type Object
	 */
	public void setRetObject(Object retObject){
		this.retObject = retObject;
	}
	
	/**
	 * Constructor of Wrapper ReturnObjectImpl
	 * @param retObject of type Object
	 */
	
	public ReturnObjectImpl(Object retObject){
		this.retObject = retObject;
	}
	
	
	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */
	public boolean hasError(){
		if (this.retObject instanceof ErrorMessage)
			return true;
		else 
			return false;
	}
	
	/**
	 * Returns the error message. 
	 * 
	 * This method must return NO_ERROR if and only if
	 * {@hasError} returns false.
	 * 
	 * @return the error message
	 */
	public ErrorMessage getError(){
		if(this.hasError())
			return (ErrorMessage)this.retObject;//safely casted to ErrorMessage as it has already been checked in hasError method 
		else
			return ErrorMessage.NO_ERROR;
	}
	
	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been error.
	 * 
	 * Note that the output of this method is null if {@see
	 * hasError} returns true, but the opposite is not true: if
	 * {@see hasError} returns false, this method may or may not
	 * return null.
	 * 
	 * @return the return value from the method or null if there has been an
	 *         error
	 */
	public Object getReturnValue(){
		if( !this.hasError())
			return this.retObject;
		else
			return null;
	}
	
	/**
	 * Overriding method toString of the Object class.
	 * Used to show the String representation of the object in the retObject instance variable.
	 */
	
	public String toString(){
		return retObject.toString();
	}
}