package com.njhy.ts.exception;

public class UserNotFindException extends Exception
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    public UserNotFindException()
    {
        super();
    }

    public UserNotFindException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UserNotFindException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public UserNotFindException(String message)
    {
        super(message);
    }

    public UserNotFindException(Throwable cause)
    {
        super(cause);
    }
    
    
    
    
}
