/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.xml.ws.WebServiceRef;
import webservices.MoneyTransferWebService_Service;

/**
 *
 * @author cmpgkenn
 */
@Named(value = "mainServiceBean")
@RequestScoped
public class mainServiceBean {

    @WebServiceRef(wsdlLocation = "http://localhost:8080/xChange4U/MoneyTransferWebService?wsdl")
    private MoneyTransferWebService_Service service;
    
    private String nameofsender;
    private String nameofreciever;
    private String originofthemoney;
    private String destinationofthemoney;
    private String currencyconversionrate;
    private String sendercurrency;
    private String receivercurrency;
    private String amounttobetransferred;
    private String transferfee;
    private String amounttobereceived;
    private String result;
    

      public String getNameofsender() {
        return nameofsender;
    } 

    public String getNameofreciever() {
        return nameofreciever;
    }
    
    public String getOriginofthemoney() {
        return originofthemoney;
    }
    
      public String getDestinationofthemoney() {
        return destinationofthemoney ;
    }
      
      public String getCurrencyconversionrate() {
        return currencyconversionrate ;
    }
      
      public String getSendercurrency() {
        return sendercurrency;
    } 
    
     public String getReceivercurrency() {
        return receivercurrency;
    }
     
      public String getAmounttobetransferred() {
        return amounttobetransferred;
    }  
    
     public String getTransferfee() {
        return transferfee;
    }   
    
     public String getAmounttobereceived() {
        return amounttobereceived;
    }    
     
    public String getResult() {
        return result;
    }

    public void setNameofsender(String nameofsender) {
        this.nameofsender = nameofsender;
    }

    public void setNameofreciever(String nameofreciever) {
        this.nameofreciever = nameofreciever;
    }
    
     public void setOriginofthemoney(String originofthemoney) {
        this.originofthemoney = originofthemoney;
    }
    
     public void setDestinationofthemoney(String destinationofthemoney) {
        this.destinationofthemoney = destinationofthemoney;
    }
     
     public void setCurrencyconversionrate(String currencyconversionrate) {
        this. currencyconversionrate = destinationofthemoney;
    }
     
    public void setSendercurrency(String sendercurrency ) {
        this. sendercurrency = sendercurrency;
    }
    
    public void setReceivercurrency(String receivercurrency ) {
        this. receivercurrency = receivercurrency;
    }

     public void setAmounttobetransferred(String amounttobetransferred ) {
        this. amounttobetransferred = amounttobetransferred;
    }

      public void setTransferfee(String transferfee ) {
        this. transferfee = transferfee;
    }

    public void setAmounttobereceived(String amounttobereceived) {
        this.amounttobereceived = amounttobereceived;
    }


    
    public void clientService() {
        this.result = (" Thank You " + nameofsender + " For using our service to transfer money to " + nameofreciever + " From " + originofthemoney + " To " + destinationofthemoney + " The Currency Conversion Rate is " + currencyconversionrate + " Sender Currency " + sendercurrency + " Reciever Currency " +  receivercurrency + " The amount to be received is " + amounttobetransferred+ "  After considering the Transfer fee of  " + transferfee + " The amount to be received is " + amounttobereceived );
    }

    private String hello(java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.MoneyTransferWebService port = service.getMoneyTransferWebServicePort();
        return port.hello(name);
    }
}
