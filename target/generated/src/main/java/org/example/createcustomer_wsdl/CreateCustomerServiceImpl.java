
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.example.createcustomer_wsdl;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-sb2-750026-redhat-00001
 * 2021-11-01T16:18:51.908+05:30
 * Generated source version: 3.2.7.fuse-sb2-750026-redhat-00001
 *
 */

@javax.jws.WebService(
                      serviceName = "CreateCustomerEndpointService",
                      portName = "CreateCustomerService",
                      targetNamespace = "http://www.example.org/CreateCustomer_WSDL/",
                      wsdlLocation = "file:/Users/rakesh/workspace/webServiceExpose/src/main/resources/WSDL/GetFullName.wsdl",
                      endpointInterface = "org.example.createcustomer_wsdl.CreateCustomerEndpoint")

public class CreateCustomerServiceImpl implements CreateCustomerEndpoint {

    private static final Logger LOG = Logger.getLogger(CreateCustomerServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see org.example.createcustomer_wsdl.CreateCustomerEndpoint#createCustomer(org.example.createcustomer_wsdl.CreateCustomerRequest in)*
     */
    public org.example.createcustomer_wsdl.CreateCustomerResponse createCustomer(CreateCustomerRequest in) {
        LOG.info("Executing operation createCustomer");
        System.out.println(in);
        try {
            org.example.createcustomer_wsdl.CreateCustomerResponse _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
