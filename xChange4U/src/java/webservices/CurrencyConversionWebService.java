/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author cmpdambr
 */
@WebService(serviceName = "CurrencyConversionWebService")
public class CurrencyConversionWebService {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param pound
     * @return 
     */
    @WebMethod(operationName = "poundToEuro")
    public double poundToEuro(@WebParam(name = "pound") double pound) {
        //TODO write your implementation code here:
        return 0.85 * pound;
    }

    /**
     * Web service operation
     * @param euro
     * @return 
     */
    @WebMethod(operationName = "euroToPound")
    public double euroToPound(@WebParam(name = "euro") double euro) {
        //TODO write your implementation code here:
        return 1.17 * euro;
    }

    /**
     * Web service operation
     * @param pound
     * @return 
     */
    @WebMethod(operationName = "poundToDollar")
    public double poundToDollar(@WebParam(name = "pound") double pound) {
        //TODO write your implementation code here:
        return 1.33 * pound;
    }

    /**
     * Web service operation
     * @param yen
     * @return 
     */
    @WebMethod(operationName = "poundToYen")
    public double poundToYen(@WebParam(name = "yen") double yen) {
        //TODO write your implementation code here:
        return 147.75 * yen;
    }

    /**
     * Web service operation
     * @param euro
     * @return 
     */
    @WebMethod(operationName = "euroToDollar")
    public double euroToDollar(@WebParam(name = "euro") double euro) {
        //TODO write your implementation code here:
        return 1.14 * euro;
    }

    /**
     * Web service operation
     * @param euro
     * @return 
     */
    @WebMethod(operationName = "euroToYen")
    public double euroToYen(@WebParam(name = "euro") double euro) {
        //TODO write your implementation code here:
        return 126.26 * euro;
    }

    /**
     * Web service operation
     * @param dollar
     * @return 
     */
    @WebMethod(operationName = "dollarToEuro")
    public double dollarToEuro(@WebParam(name = "dollar") double dollar) {
        //TODO write your implementation code here:
        return 0.88 * dollar;
    }

    /**
     * Web service operation
     * @param dollar
     * @return 
     */
    @WebMethod(operationName = "dollarToPound")
    public double dollarToPound(@WebParam(name = "dollar") double dollar) {
        //TODO write your implementation code here:
        return 0.76 * dollar;
    }

    /**
     * Web service operation
     * @param dollar
     * @return 
     */
    @WebMethod(operationName = "dollarToYen")
    public double dollarToYen(@WebParam(name = "dollar") double dollar) {
        //TODO write your implementation code here:
        return 0.75 * dollar;
    }

    /**
     * Web service operation
     * @param yen
     * @return 
     */
    @WebMethod(operationName = "yenToDollar")
    public double yenToDollar(@WebParam(name = "yen") double yen) {
        //TODO write your implementation code here:
        return 0.0090 * yen;
    }

    /**
     * Web service operation
     * @param yen
     * @return 
     */
    @WebMethod(operationName = "yenToEuro")
    public double yenToEuro(@WebParam(name = "yen") double yen) {
        //TODO write your implementation code here:
        return 0.0079 * yen;
    }

    /**
     * Web service operation
     * @param yen
     * @return 
     */
    @WebMethod(operationName = "yenToPound")
    public double yenToPound(@WebParam(name = "yen") double yen) {
        //TODO write your implementation code here:
        return 0.0068 * yen;
    }
    
}
