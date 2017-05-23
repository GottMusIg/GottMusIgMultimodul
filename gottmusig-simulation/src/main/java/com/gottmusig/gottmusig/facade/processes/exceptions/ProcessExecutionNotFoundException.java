package com.gottmusig.gottmusig.facade.processes.exceptions;

public class ProcessExecutionNotFoundException extends RuntimeException {

    public ProcessExecutionNotFoundException() {
    }

    public ProcessExecutionNotFoundException(String message) {
        super(message);
    }

    public ProcessExecutionNotFoundException(Throwable cause) {
        super(cause);
    }

    public ProcessExecutionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProcessExecutionNotFoundException(String message, Throwable cause, boolean enableSuppression,
                                             boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
