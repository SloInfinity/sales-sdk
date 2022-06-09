package de.lavego.nexo.generated;

import de.lavego.nexo.Commons;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/**
 * <?xml version="1.0" encoding="UTF-8"?>
 * <SaleToPOIRequest xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="nexoSaleToPOIMessages.xsd">
 * <MessageHeader MessageCategory="Login"
 * MessageClass="Service"
 * MessageType="Request"
 * POIID="POITerm1"
 * ProtocolVersion="3.0"
 * SaleID="SaleTermA"
 * ServiceID="498"/>
 * <LoginRequest OperatorID="Cashier16" OperatorLanguage="sp" POISerialNumber="78910AA46010005" ShiftNumber="2">
 * <DateTime>2015-03-08T09:13:51.0+01:00</DateTime>
 * <SaleSoftware ApplicationName="SaleSys" CertificationCode="ECTS2PS001" ProviderIdentification="PointOfSaleCo" SoftwareVersion="01.98.01"/>
 * <SaleTerminalData TerminalEnvironment="Attended">
 * <SaleCapabilities>PrinterReceipt CashierStatus CashierError CashierDisplay CashierInput</SaleCapabilities>
 * <SaleProfile GenericProfile="Extended">
 * <ServiceProfiles>Loyalty PIN CardReader</ServiceProfiles>
 * </SaleProfile>
 * </SaleTerminalData>
 * </LoginRequest>
 * </SaleToPOIRequest>
 *
 * <SaleCapabilities>PrinterReceipt CashierStatus CashierError CashierDisplay CashierInput</SaleCapabilities>
 */
public class ScaleCapabilitiesConverter implements Converter<SaleTerminalDataType>
{
    @Override
    public SaleTerminalDataType read(InputNode inputNode)
            throws Exception
    {
        return null;
    }

    @Override
    public void write(OutputNode outputNode, SaleTerminalDataType saleTerminalDataType)
            throws Exception
    {
        if (saleTerminalDataType.getTerminalEnvironment() != null)
        { outputNode.setAttribute("TerminalEnvironment", saleTerminalDataType.getTerminalEnvironment()); }

        if (saleTerminalDataType.getTotalsGroupID() != null)
        { outputNode.setAttribute("TotalsGroupID", saleTerminalDataType.getTotalsGroupID()); }

        Commons.concatListElements(outputNode.getChild("SaleCapabilities"), saleTerminalDataType.getSaleCapabilities());

        new SaleProfileTypeConverter().write(outputNode.getChild("SaleProfile"), saleTerminalDataType.getSaleProfile());
    }
}
