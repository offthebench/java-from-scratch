package com.company.designpatterns.behavioral.chainofresponsibility;

public class LowFuelHandler extends AbstractHandler {
    private static  int code = 3;

    public LowFuelHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (code == request.getRequestCode()) {
            System.out.println("low fuel request handled");
        } else {
            super.handleRequest(request);
        }
    }
}
