package com.company.designpatterns.behavioral.chainofresponsibility;

abstract public class AbstractRequest {
    private int requestCode;

    public AbstractRequest(int requestCode) {
        this.requestCode = requestCode;
    }

    public int getRequestCode() {
        return requestCode;
    }
}
