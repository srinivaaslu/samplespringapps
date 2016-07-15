package com.test;

/**
 * Created by 205025 on 6/28/2016.
 */
public class FileFormatException extends RuntimeException {
    private String error;
    FileFormatException(){
        super();
    }

    public FileFormatException(String columnName){
        super();
        this.error = columnName;

    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public String getMessage(){
        return "Error in "+error;
    }
}
