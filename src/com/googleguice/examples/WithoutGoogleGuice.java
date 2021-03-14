package com.googleguice.examples;

import com.guice.requests.SquareRequest;
import com.guice.services.DrawShape;
import com.guice.services.DrawSquare;

public class WithoutGoogleGuice {
    private static final String SQ_REQUEST ="Sqaure";
    public static void requestshape(String req){
        if(req.equalsIgnoreCase(SQ_REQUEST))
        {
            DrawShape d = new DrawSquare(88,"Green"); //Interface reference pointing to implementing class
            SquareRequest sr = new SquareRequest(d);
            sr.makeRequest();

        }
    }
    public static void main(String[] args) {
        requestshape(SQ_REQUEST);
    }
}
