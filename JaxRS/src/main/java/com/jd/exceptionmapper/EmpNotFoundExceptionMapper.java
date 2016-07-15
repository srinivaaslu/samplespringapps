package com.jd.exceptionmapper;

import com.jd.exception.EmpNotFoundException;
import com.jd.model.ErrorResponse;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by 205025 on 6/7/2016.
 */
@Provider
public class EmpNotFoundExceptionMapper implements ExceptionMapper<EmpNotFoundException> {

    public EmpNotFoundExceptionMapper() {
    }

    @Override
    public Response toResponse(EmpNotFoundException empNotFoundException) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorId(empNotFoundException.getErrorId());
        errorResponse.setErrorCode(empNotFoundException.getMessage());
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(
                errorResponse).type(
                MediaType.APPLICATION_XML).build();
    }
}
