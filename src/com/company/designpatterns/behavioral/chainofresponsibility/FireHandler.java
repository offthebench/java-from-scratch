package com.company.designpatterns.behavioral.chainofresponsibility;

public class FireHandler extends AbstractHandler {

    private static int code = 1;

    public FireHandler(AbstractHandler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (code == request.getRequestCode()) {
            System.out.println("fire request handled");
        } else {
            super.handleRequest(request);
        }
    }
}
