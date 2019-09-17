package com.nt.Service;

public class WeatherreportImplProxy implements com.nt.Service.WeatherreportImpl {
  private String _endpoint = null;
  private com.nt.Service.WeatherreportImpl weatherreportImpl = null;
  
  public WeatherreportImplProxy() {
    _initWeatherreportImplProxy();
  }
  
  public WeatherreportImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initWeatherreportImplProxy();
  }
  
  private void _initWeatherreportImplProxy() {
    try {
      weatherreportImpl = (new com.nt.Service.WeatherreportImplServiceLocator()).getWeatherreportImpl();
      if (weatherreportImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)weatherreportImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)weatherreportImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (weatherreportImpl != null)
      ((javax.xml.rpc.Stub)weatherreportImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.nt.Service.WeatherreportImpl getWeatherreportImpl() {
    if (weatherreportImpl == null)
      _initWeatherreportImplProxy();
    return weatherreportImpl;
  }
  
  public float weatherReport() throws java.rmi.RemoteException{
    if (weatherreportImpl == null)
      _initWeatherreportImplProxy();
    return weatherreportImpl.weatherReport();
  }
  
  
}