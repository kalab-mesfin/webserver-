package com.shap.area;

import com.area.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ShapeToolEndpoint {

    private static final String NAMESPACE = "http://example.com/calculator";

    @PayloadRoot(namespace = NAMESPACE, localPart = "circleAreaRequest")
    @ResponsePayload
    public CircleAreaResponse circleArea(@RequestPayload CircleAreaRequest request) {
        if (request.getRadius() <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        double area = Math.PI * request.getRadius() * request.getRadius();
        CircleAreaResponse response = new CircleAreaResponse();
        response.setArea(area);

        return response;
    }


    @PayloadRoot(namespace = NAMESPACE, localPart = "squareAreaRequest")
    @ResponsePayload
    public SquareAreaResponse squareArea(@RequestPayload SquareAreaRequest request) {
        if (request.getSide() <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        double area = request.getSide()* request.getSide();
        SquareAreaResponse response = new SquareAreaResponse();
        response.setArea(area);

        return response;
    }


    @PayloadRoot(namespace = NAMESPACE, localPart = "rectangleAreaRequest")
    @ResponsePayload
    public RectangleAreaResponse crectaArea(@RequestPayload RectangleAreaRequest request) {
        if (request.getLength() <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        double area = request.getLength()*request.getWidth();
        RectangleAreaResponse response = new RectangleAreaResponse();
        response.setArea(area);

        return response;
    }
    @PayloadRoot(namespace = NAMESPACE, localPart = "parallelogramAreaRequest")
    @ResponsePayload
    public ParallelogramAreaResponse crectaArea(@RequestPayload ParallelogramAreaRequest request) {
        if (request.getBase() <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        double area = request.getBase()*request.getHeight();
        ParallelogramAreaResponse response = new ParallelogramAreaResponse();
        response.setArea(area);

        return response;
    }
    @PayloadRoot(namespace = NAMESPACE, localPart = "triangleAreaRequest")
    @ResponsePayload
    public TriangleAreaResponse crectaArea(@RequestPayload TriangleAreaRequest request) {
        if (request.getBase() <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        double area = request.getBase()*request.getHeight()/2;
        TriangleAreaResponse response = new TriangleAreaResponse();
        response.setArea(area);

        return response;
    }

    // Repeat similar methods for other 4 operations
}