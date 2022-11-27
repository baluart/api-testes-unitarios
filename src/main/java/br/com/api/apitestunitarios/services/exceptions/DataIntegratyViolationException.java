package br.com.api.apitestunitarios.services.exceptions;

public class DataIntegratyViolationException extends RuntimeException{

    public DataIntegratyViolationException(String message)
    {
        super(message);
    }
}
