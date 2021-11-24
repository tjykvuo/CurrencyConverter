/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import webservices.CurrencyConversionWebService_Service;

/**
 *
 * @author cmpdambr
 */
@Named(value = "serviceBean")
@SessionScoped
public class ServiceBean implements Serializable {

    @WebServiceRef(wsdlLocation = "http://localhost:8080/xChange4U/CurrencyConversionWebService?wsdl")
    private CurrencyConversionWebService_Service service;

    private String requestedService;
    private String parameterName;
    private String parameterValue;
    private String result;
    private double value;
    private double output;

    public double getValue() {
        return value;
    }

    public double getOutput() {
        return output;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    /**
     * Creates a new instance of ServiceBean
     */
    public ServiceBean() {
    }
    /**
     *
     * @return
     */
    public String getRequestedService() {
        return requestedService;
    }

    public void setRequesedService(String requestedService) {
        this.requestedService = requestedService;
    }

    public String setParameterName() {
        return parameterName;
    }

    public String getParameterName() {
        return parameterName;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String setParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
     public void setResult(String result) {
        this.result = result;
    }
    public String getResult() {
        return result;
    }

    public void clientServiceConvertor() {
        this.output = dollarToEuro(value);
        this.output = dollarToPound(value);
        this.output = dollarToYen(value);
        this.output = euroToDollar(value);
        this.output = euroToPound(value);
        this.output = euroToYen(value);
        this.output = poundToDollar(value);
        this.output = poundToEuro(value);
        this.output = poundToYen(value);
        this.output = yenToDollar(value);
        this.output = yenToEuro(value);
        this.output = yenToPound(value);
    }

    public void convertDollarToEuro() {
        this.output = dollarToEuro(value);
    }

    public void convertDollarToPound() {
        this.output = dollarToPound(value);
    }

    public void convertDollarToYen() {
        this.output = dollarToYen(value);
    }

    public void convertEuroToDollar() {
        this.output = euroToDollar(value);
    }

    public void convertEuroToPound() {
        this.output = euroToPound(value);
    }

    public void convertEuroToYen() {
        this.output = euroToYen(value);
    }

    public void convertPoundToDollar() {
        this.output = poundToDollar(value);
    }

    public void convertPoundToEuro() {
        this.output = poundToEuro(value);
    }

    public void convertPoundToYen() {
        this.output = poundToYen(value);
    }

    public void convertYenToDollar() {
        this.output = yenToDollar(value);
    }

    public void convertYenToEuro() {
        this.output = yenToEuro(value);
    }

    public void convertYenToPound() {
        this.output = yenToPound(value);
    }

    public void goToInputPage(String service) {
        if (service.equals("Transfer") || service.equals("Conversion")) {
            this.requestedService = service;
            if (this.requestedService.equals("Transfer")) {
                this.parameterName = "Money Transfer";
            } else {
                this.parameterName = "Money";
            }
            FacesContext.getCurrentInstance()
                    .getApplication().getNavigationHandler()
                    .handleNavigation(FacesContext.getCurrentInstance(), null, "/input.xhtml");
        }
    }

    private double dollarToEuro(double dollar) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.dollarToEuro(dollar);
    }

    private double dollarToPound(double dollar) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.dollarToPound(dollar);
    }

    private double dollarToYen(double dollar) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.dollarToYen(dollar);
    }

    private double euroToDollar(double euro) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.euroToDollar(euro);
    }

    private double euroToPound(double euro) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.euroToPound(euro);
    }

    private double euroToYen(double euro) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.euroToYen(euro);
    }

    private double poundToDollar(double pound) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.poundToDollar(pound);
    }

    private double poundToEuro(double pound) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.poundToEuro(pound);
    }

    private double poundToYen(double yen) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.poundToYen(yen);
    }

    private double yenToDollar(double yen) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.yenToDollar(yen);
    }

    private double yenToEuro(double yen) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.yenToEuro(yen);
    }

    private double yenToPound(double yen) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.CurrencyConversionWebService port = service.getCurrencyConversionWebServicePort();
        return port.yenToPound(yen);
    }
}
