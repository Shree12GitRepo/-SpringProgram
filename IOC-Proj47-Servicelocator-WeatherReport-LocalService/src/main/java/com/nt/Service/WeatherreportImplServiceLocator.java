/**
 * WeatherreportImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nt.Service;

public class WeatherreportImplServiceLocator extends org.apache.axis.client.Service implements com.nt.Service.WeatherreportImplService {

    public WeatherreportImplServiceLocator() {
    }


    public WeatherreportImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherreportImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WeatherreportImpl
    private java.lang.String WeatherreportImpl_address = "http://localhost:8080/IOC-Proj47-WeatherReport-ExternalService/services/WeatherreportImpl";

    public java.lang.String getWeatherreportImplAddress() {
        return WeatherreportImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherreportImplWSDDServiceName = "WeatherreportImpl";

    public java.lang.String getWeatherreportImplWSDDServiceName() {
        return WeatherreportImplWSDDServiceName;
    }

    public void setWeatherreportImplWSDDServiceName(java.lang.String name) {
        WeatherreportImplWSDDServiceName = name;
    }

    public com.nt.Service.WeatherreportImpl getWeatherreportImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherreportImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherreportImpl(endpoint);
    }

    public com.nt.Service.WeatherreportImpl getWeatherreportImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.nt.Service.WeatherreportImplSoapBindingStub _stub = new com.nt.Service.WeatherreportImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getWeatherreportImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherreportImplEndpointAddress(java.lang.String address) {
        WeatherreportImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.nt.Service.WeatherreportImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.nt.Service.WeatherreportImplSoapBindingStub _stub = new com.nt.Service.WeatherreportImplSoapBindingStub(new java.net.URL(WeatherreportImpl_address), this);
                _stub.setPortName(getWeatherreportImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WeatherreportImpl".equals(inputPortName)) {
            return getWeatherreportImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Service.nt.com", "WeatherreportImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Service.nt.com", "WeatherreportImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WeatherreportImpl".equals(portName)) {
            setWeatherreportImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
