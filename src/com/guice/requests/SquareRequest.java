package com.guice.requests;

import com.guice.services.DrawShape;
import com.guice.services.DrawSquare;

import javax.inject.Inject;

public class SquareRequest {
    DrawShape ds;

    @Inject //this will tell when you are instantiating square_request object, inject Draw_Shape class which is
            //bind to Draw_Square class
    public SquareRequest(DrawShape ds){
        this.ds =ds;
    }
    public void makeRequest(){
        ds.draw();
    }

    public DrawShape getDrawShape(){
        return ds;
    }
}
