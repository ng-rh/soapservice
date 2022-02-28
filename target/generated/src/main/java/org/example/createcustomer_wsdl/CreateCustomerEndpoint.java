package org.example.createcustomer_wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-sb2-750026-redhat-00001
 * 2021-11-01T16:18:52.058+05:30
 * Generated source version: 3.2.7.fuse-sb2-750026-redhat-00001
 *
 */
@WebService(targetNamespace = "http://www.example.org/CreateCustomer_WSDL/", name = "CreateCustomerEndpoint")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateCustomerEndpoint {

    @WebMethod(operationName = "CreateCustomer", action = "http://www.example.org/CreateCustomer_WSDL/CreateCustomer")
    @WebResult(name = "CreateCustomerResponse", targetNamespace = "http://www.example.org/CreateCustomer_WSDL/", partName = "out")
    public CreateCustomerResponse createCustomer(
        @WebParam(partName = "in", name = "CreateCustomerRequest", targetNamespace = "http://www.example.org/CreateCustomer_WSDL/")
        CreateCustomerRequest in
    );
}
