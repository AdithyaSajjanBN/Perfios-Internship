import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class ParseComplex {
    public static void main(String[] args){
        try {
            File inputFile = new File("/home/adithya/Desktop/kotak-rules/src/main/resources/totalPrice.dmn");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            saxParser.parse(inputFile, userhandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class UserHandler extends DefaultHandler {
    boolean inputData=false;
    boolean decision=false;
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("dmn:decision")) {
            String DName = attributes.getValue("name");
            System.out.println("Decision Name : " + DName);
        }
        else if(qName.equalsIgnoreCase("dmn:inputData")){
            String Dinput = attributes.getValue("name");
            System.out.println("input : " + Dinput);
        }
    }
}