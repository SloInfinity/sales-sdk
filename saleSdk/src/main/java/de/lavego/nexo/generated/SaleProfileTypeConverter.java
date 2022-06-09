package de.lavego.nexo.generated;

import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import de.lavego.nexo.Commons;

/**
 *      <?xml version="1.0" encoding="UTF-8" standalone="no" ?>
 *      <SaleToPOIRequest xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="nexoSaleToPOIMessages.xsd">
 *          <MessageHeader DeviceID="0123456789"
 *              MessageCategory="Login"
 *              MessageClass="Service"
 *              MessageType="Request"
 *              POIID="POITerm1"
 *              ProtocolVersion="v3"
 *              SaleID="SaleTermA"
 *              ServiceID="498"/>
 *           <LoginRequest OperatorID="Cashier16" OperatorLanguage="de" POISerialNumber="78910AA46010005" ShiftNumber="2" TrainingModeFlag="false">
 *              <DateTime>2020-12-23T15:42:33</DateTime>
 *              <SaleSoftware ApplicationName="SaleSys" CertificationCode="ECTS2PS001" ProviderIdentification="PointOfSaleCo" SoftwareVersion="01.98.01"/>
 *              <SaleTerminalData TerminalEnvironment="Attended">
 *                  <SaleCapabilities>CashierDisplay CashierError CashierInput CashierStatus PrinterReceipt</SaleCapabilities>
 *                  <SaleProfile GenericProfile="Extended">
 *                      <ServiceProfiles>PIN Loyalty CardReader</ServiceProfiles>
 *                  </SaleProfile>
 *              </SaleTerminalData>
 *           </LoginRequest>
 *     </SaleToPOIRequest>
 *
 *      <?xml version="1.0" encoding="UTF-8"?>
 *      <SaleToPOIRequest xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="nexoSaleToPOIMessages.xsd">
 *          <MessageHeader
 *              MessageCategory="Login"
 *              MessageClass="Service"
 *              MessageType="Request"
 *              POIID="POITerm1"
 *              ProtocolVersion="3.0"
 *              SaleID="SaleTermA"
 *              ServiceID="498"/>
 *                  <LoginRequest OperatorID="Cashier16" OperatorLanguage="sp" POISerialNumber="78910AA46010005" ShiftNumber="2">
 *                      <DateTime>2015-03-08T09:13:51.0+01:00</DateTime>
 *                      <SaleSoftware ApplicationName="SaleSys" CertificationCode="ECTS2PS001" ProviderIdentification="PointOfSaleCo" SoftwareVersion="01.98.01"/>
 *                      <SaleTerminalData TerminalEnvironment="Attended">
 *                          <SaleCapabilities>PrinterReceipt CashierStatus CashierError CashierDisplay CashierInput</SaleCapabilities>
 *                          <SaleProfile GenericProfile="Extended">
 *                              <ServiceProfiles>Loyalty PIN CardReader</ServiceProfiles>
 *                          </SaleProfile>
 *                      </SaleTerminalData>
 *                  </LoginRequest>
 *     </SaleToPOIRequest>
 *
 * <SaleProfile GenericProfile="Extended">
 * <ServiceProfiles>Loyalty PIN CardReader</ServiceProfiles>
 * </SaleProfile>
 */
public class SaleProfileTypeConverter implements Converter<SaleProfileType>
{
    @Override
    public SaleProfileType read(InputNode inputNode)
            throws Exception
    {
        //System.err.println(inputNode.getPrefix());
        //System.err.println(inputNode.getName());
        //System.err.println(inputNode.getValue());

        return null;
    }

    @Override
    public void write(OutputNode outputNode, SaleProfileType saleProfileType)
            throws Exception
    {
        outputNode.setAttribute("GenericProfile", saleProfileType.getGenericProfile());
        Commons.concatListElements(outputNode.getChild("ServiceProfiles"), saleProfileType.getServiceProfiles());
    }
}
