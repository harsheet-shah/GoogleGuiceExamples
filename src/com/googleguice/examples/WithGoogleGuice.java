package com.googleguice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.requests.SquareRequest;
import com.guice.services.DrawShape;
import com.guice.services.DrawSquare;
import com.modules.AppModule;

public class WithGoogleGuice {
    private static final String SQ_REQUEST ="Sqaure";
    public static void requestshape(String req){
        if(req.equalsIgnoreCase(SQ_REQUEST))
        {
           // DrawShape d = new DrawSquare(); //Interface reference pointing to implementing class
          /*  Injector injector = Guice.createInjector(new AppModule());
            DrawShape d = injector.getInstance(DrawShape.class);
            SquareRequest sr = new SquareRequest(d);
            sr.makeRequest();*/
            //other way
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest sr1 = injector.getInstance(SquareRequest.class);
            sr1.makeRequest();

            SquareRequest sr2 = injector.getInstance(SquareRequest.class);
            sr2.makeRequest();

            System.out.println("Are square request objects same "+(sr1==sr2));
            System.out.println("Are Draw Shape objects same "+(sr1.getDrawShape()==sr2.getDrawShape()));
        }
    }

    public static void main(String[] args) {
        requestshape(SQ_REQUEST);
    }
}
