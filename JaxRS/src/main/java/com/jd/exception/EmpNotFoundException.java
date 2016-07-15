package com.jd.exception;

/**
 * Created by 205025 on 6/7/2016.
 */
public class EmpNotFoundException extends Exception {
    private static final long serialVersionUID = 4351720088030656859L;
    private int errorId;

    public int getErrorId() {
        return errorId;
    }

    public EmpNotFoundException(String msg, int errorId) {
        super(msg);
        this.errorId = errorId;
    }

    public EmpNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
