package de.lavego.nexo;

import android.os.Build;
import android.util.Log;
import android.util.Xml;

import androidx.annotation.NonNull;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.Registry;
import org.simpleframework.xml.convert.RegistryStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.OutputNode;
import org.xmlpull.v1.XmlPullParser;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import de.lavego.nexo.generated.MessageCategoryEnumeration;
import de.lavego.nexo.generated.MessageClassEnumeration;
import de.lavego.nexo.generated.MessageHeaderType;
import de.lavego.nexo.generated.MessageTypeEnumeration;
import de.lavego.nexo.generated.POITerminalDataType;
import de.lavego.nexo.generated.PaymentInstrumentTypeEnumeration;
import de.lavego.nexo.generated.PaymentTotalsType;
import de.lavego.nexo.generated.ReconciliationResponseType;
import de.lavego.nexo.generated.ReconciliationTypeEnumeration;
import de.lavego.nexo.generated.ResponseType;
import de.lavego.nexo.generated.ResultEnumeration;
import de.lavego.nexo.generated.SaleTerminalDataType;
import de.lavego.nexo.generated.SaleToPOIResponse;
import de.lavego.nexo.generated.ScaleCapabilitiesConverter;
import de.lavego.nexo.generated.TransactionIdentificationType;
import de.lavego.nexo.generated.TransactionTotalsType;
import de.lavego.nexo.generated.TransactionTypeEnumeration;
import de.lavego.nexo.generated.VersionEnumeration;
import de.lavego.nexo.types.DateTime;

//import org.apache.xerces.jaxp.validation.XMLSchemaFactory;

//import javax.xml.transform.Source;
//import javax.xml.transform.stream.StreamSource;
//import javax.xml.validation.Schema;
//import javax.xml.validation.Validator;

public class Commons
{
    public static String concatListElements(List<String> list)
    {
        StringBuilder val = new StringBuilder();
        
        if (list != null)
        {
            for (int idx = 0; idx < list.size(); ++ idx)
            {
                val.append(idx == list.size() - 1 ? list.get(idx) : list.get(idx) + " ");
            }
        }
        
        return val.toString();
    }
    
    public static void concatListElements(OutputNode node, List<String> list)
    {
        StringBuilder val = new StringBuilder();
        
        if (list != null)
        {
            for (int idx = 0; idx < list.size(); ++ idx)
            {
                val.append(idx == list.size() - 1 ? list.get(idx) : list.get(idx) + " ");
            }
        }
        
        node.setValue(val.toString());
    }
    
    public static String fixItFelixEnumerationValue(@NonNull String value)
    {
        return value.toLowerCase().substring(0, 1).toUpperCase() + value.toLowerCase().substring(1);
    }
    
    /**
     * <?xml version="1.0" encoding="UTF-8"?>
     * <SaleToPOIResponse>
     * <MessageHeader MessageCategory="Reconciliation" MessageClass="Service" MessageType="Response" POIID="52500083" ProtocolVersion="v3" SaleID="SaleApp1" ServiceID="0070"/>
     * <ReconciliationResponse POIReconciliationID="2" ReconciliationType="Reconciliation">
     * <Response Result="SUCCESS"/>
     * <TransactionTotals>
     * <TransactionTotals CardBrand="1" PaymentCurrency="USD">
     * <PaymentTotals>
     * <PaymentTotals TransactionAmount="338.97" TransactionCount="3" TransactionType="DEBT"/>
     * </PaymentTotals>
     * </TransactionTotals>
     * </TransactionTotals>
     * </ReconciliationResponse>
     * </SaleToPOIResponse>
     *
     * @param xml
     *
     * @return
     */
    public static SaleToPOIResponse fixItFelixReconciliationResponse(String xml)
    {
        SaleToPOIResponse saleToPOIResponse = new SaleToPOIResponse();
        
        try
        {
            XmlPullParser parser = Xml.newPullParser();
            
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(new StringReader(xml));
            
            int t = parser.nextTag();
            
            Log.v("NEXO", "Type is " + t + " with name " + parser.getName());
            
            while ((t = parser.next()) != XmlPullParser.END_DOCUMENT)
            {
                if (t != XmlPullParser.END_TAG)
                {
                    String name = parser.getName();
                    String text = parser.getText();
                    
                    Log.v("NEXO", String.format("Type is {%s} with name {%s} and value {%s}", t, parser.getName(), parser.getText()));
                    
                    for (int idx = 0; idx < parser.getAttributeCount(); ++ idx)
                    {
                        String attr  = parser.getAttributeName(idx);
                        String value = parser.getAttributeValue(idx);
                        
                        Log.v("NEXO", String.format("\tAttribute {%s} with value {%s} and type {%s}"
                                , attr
                                , value
                                , parser.getAttributeType(idx)));
                    }
                    
                    if (name.equals("MessageHeader"))
                    {
                        MessageHeaderType header = new MessageHeaderType();
                        /**
                         * Attribute {MessageCategory} with value {Reconciliation} and type {CDATA}
                         * Attribute {MessageClass} with value {Service} and type {CDATA}
                         * Attribute {MessageType} with value {Response} and type {CDATA}
                         * Attribute {POIID} with value {52500083} and type {CDATA}
                         * Attribute {ProtocolVersion} with value {v3} and type {CDATA}
                         * Attribute {SaleID} with value {SaleApp1} and type {CDATA}
                         * Attribute {ServiceID} with value {0070} and type {CDATA}
                         */
                        for (int idx = 0; idx < parser.getAttributeCount(); ++ idx)
                        {
                            String attr  = parser.getAttributeName(idx);
                            String value = parser.getAttributeValue(idx);
                            
                            if (attr.equals("MessageCategory")) { header.setMessageCategory(MessageCategoryEnumeration.fromValue(value).value()); }
                            else if (attr.equals("MessageClass")) { header.setMessageClass(MessageClassEnumeration.fromValue(value).value()); }
                            else if (attr.equals("MessageType")) { header.setMessageType(MessageTypeEnumeration.fromValue(value).value()); }
                            else if (attr.equals("POIID")) { header.setPOIID(value); }
                            else if (attr.equals("SaleID")) { header.setSaleID(value); }
                            else if (attr.equals("ServiceID")) { header.setServiceID(value); }
                            else if (attr.equals("ProtocolVersion")) {}
                            else { Log.w("NEXO", String.format("fixItFelix attribute {%s} with value {%s} not handled!", attr, value)); }
                        }
                        
                        header.setProtocolVersion(VersionEnumeration.V_3.value());
                        saleToPOIResponse.setMessageHeader(header);
                    }
                    else if (name.equals("ReconciliationResponse"))
                    {
                        ReconciliationResponseType reconciRespone    = new ReconciliationResponseType();
                        TransactionTotalsType      transactionTotals = null;
                        PaymentTotalsType          paymentTotals     = null;
                        
                        for (int idx = 0; idx < parser.getAttributeCount(); ++ idx)
                        {
                            String attr  = parser.getAttributeName(idx);
                            String value = parser.getAttributeValue(idx);
                            
                            if (attr.equals("POIReconciliationID")) { reconciRespone.setPOIReconciliationID(value); }
                            else if (attr.equals("ReconciliationType")) { reconciRespone.setReconciliationType(ReconciliationTypeEnumeration.SALE_RECONCILIATION.value()); }
                            else { Log.w("NEXO", String.format("fixItFelix attribute {%s} with value {%s} not handled!", attr, value)); }
                        }
                        
                        Log.v("NEXO", String.format("Tags in {%s}", t, parser.getName()));
                        
                        String startTag    = "";
                        int    endTagCount = 0; // need 2
                        
                        while (parser.next() != XmlPullParser.END_DOCUMENT)
                        {
                            name = parser.getName() != null ? parser.getName() : String.format("null {%s}", parser.getEventType());
                            
                            switch (parser.getEventType())
                            {
                                case XmlPullParser.START_TAG:
                                    startTag = name;
                                    endTagCount = 0;
                                    Log.v("NEXO", String.format("\tevent %s {START_TAG} startTag=%s endTagCount=%s", name, startTag, endTagCount));
                                    break;
                                case XmlPullParser.END_TAG:
                                    endTagCount++;
                                    Log.v("NEXO", String.format("\tevent %s {END_TAG} startTag=%s endTagCount=%s", name, startTag, endTagCount));
                                    break;
                            }
                            
                            if (name.equals("Response") && parser.getEventType() == XmlPullParser.START_TAG)
                            {
                                ResponseType response = new ResponseType();
                                response.setResult(ResultEnumeration.fromValue(parser.getAttributeValue(null, "Result")).value());
                                reconciRespone.setResponse(response);
                            }
                            else if (name.equals("TransactionTotals"))
                            {
                                // HACK broken , jump oder the wrong tag
                                if (parser.getAttributeCount() > 0 && parser.getEventType() == XmlPullParser.START_TAG)
                                {
                                    transactionTotals = new TransactionTotalsType();
                                    transactionTotals.setCardBrand(parser.getAttributeValue(null, "CardBrand"));
                                    transactionTotals.setPaymentInstrumentType(PaymentInstrumentTypeEnumeration.CARD.value());
                                    transactionTotals.setPaymentCurrency(parser.getAttributeValue(null, "PaymentCurrency"));
                                    
                                    reconciRespone.getTransactionTotals().add(transactionTotals);
                                    Log.v("NEXO", String.format("\tname {%s} and value {%s}", parser.getName(), parser.getText()));
                                }
                                
                                if (startTag.equals("TransactionTotals") && endTagCount == 2)
                                {
                                    saleToPOIResponse.setReconciliationResponse(reconciRespone);
                                    break;
                                }
                            }
                            else if (name.equals("PaymentTotals"))
                            {
                                // HACK broken , jump oder the wrong tag
                                if (parser.getAttributeCount() > 0 && parser.getEventType() == XmlPullParser.START_TAG)
                                {
                                    paymentTotals = new PaymentTotalsType();
                                    paymentTotals.setTransactionAmount(new BigDecimal(parser.getAttributeValue(null, "TransactionAmount")));
                                    paymentTotals.setTransactionCount(new BigInteger(parser.getAttributeValue(null, "TransactionCount")));
                                    paymentTotals.setTransactionType(TransactionTypeEnumeration.DEBIT.value());
                                    
                                    if (transactionTotals != null)
                                    {
                                        transactionTotals.getPaymentTotals().add(paymentTotals);
                                    }
                                }
                                
                                if (startTag.equals("PaymentTotals") && endTagCount == 2 && transactionTotals != null)
                                {
                                    startTag = "TransactionTotals";
                                    endTagCount = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        try
        {
            Registry   registry   = new Registry();
            Strategy   strategy   = new RegistryStrategy(registry);
            Serializer serializer = new Persister(strategy, new Format(4, "<?xml version=\"1.0\" encoding= \"UTF-8\" ?>"));
            
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            
            registry.bind(SaleTerminalDataType.class, ScaleCapabilitiesConverter.class);
            
            serializer.write(saleToPOIResponse, bao);
            
            Log.i("NEXO", String.format("fixItFelixReconciliationResponse%n%s", bao.toString("UTF-8")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return saleToPOIResponse;
    }
    
    public static String isoDateTime()
    {
        Calendar         now = Calendar.getInstance(Locale.getDefault());
        SimpleDateFormat sdf = null;
    
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N)
        {
            sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault());
        }
        else { sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.getDefault()); }
        
        return sdf.format(now.getTime());
    }
    
    public static String serialize(@NonNull final Object object)
    {
        try
        {
            /*
            Registry              registry   = new Registry();
            registry.bind(SaleTerminalDataType.class, ScaleCapabilitiesConverter.class);
            registry.bind(DateTime.class, DateTime.class);
            registry.bind(TransactionIdentificationType.class, TransactionIdentificationType.class);
            registry.bind(POITerminalDataType.class, POITerminalDataType.class);
            registry.bind(ResponseType.class, ResponseType.class);
            Strategy              strategy   = new RegistryStrategy(registry);
            */
            Serializer            serializer = serializer();//new Persister(strategy, new Format(4, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"));
            ByteArrayOutputStream bao        = new ByteArrayOutputStream();
            
            serializer.write(object, bao);
            
            return bao.toString("UTF-8");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return "";
    }
    
    public static Serializer serializer()
    {
        try
        {
            Registry registry = new Registry();
            registry.bind(SaleTerminalDataType.class, ScaleCapabilitiesConverter.class);
            registry.bind(DateTime.class, DateTime.class);
            registry.bind(TransactionIdentificationType.class, TransactionIdentificationType.class);
            registry.bind(POITerminalDataType.class, POITerminalDataType.class);
            registry.bind(ResponseType.class, ResponseType.class);
            
            Strategy strategy = new RegistryStrategy(registry);
            return new Persister(strategy, new Format(4, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return new Persister();
    }
    
    public static String transform(@NonNull String dateTime)
    {
        if (dateTime.matches("^[0-9]+$"))
        {
            Calendar calendar = Calendar.getInstance(Locale.GERMANY);
            calendar.setTimeInMillis(Long.parseLong(dateTime));
            dateTime = Commons.isoDateTime(calendar);
        }
        
        return dateTime;
    }
    
    public static String isoDateTime(@NonNull Calendar calendar)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
        {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault()).format(calendar.getTime());
        }
        else { return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.getDefault()).format(calendar.getTime()); }
    }
}
