package com;

import org.drools.scenariosimulation.api.model.ScenarioSimulationModel;
import org.drools.scenariosimulation.backend.util.ScenarioSimulationXMLPersistence;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.HashMap;

public class Student {
    public static void main(String[] args){
        try {
            ScenarioSimulationModel scenarioSimulationModel = ScenarioSimulationXMLPersistence.getInstance()
            .unmarshal(xml);

            
           /* File inputFile = new File("/home/adithya/rules-1/kotak-rules/details.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            saxParser.parse(inputFile, userhandler);*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static String xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<ScenarioSimulationModel version=\"1.8\">\n" +
            "  <simulation>\n" +
            "    <scesimModelDescriptor>\n" +
            "      <factMappings>\n" +
            "        <FactMapping>\n" +
            "          <expressionElements/>\n" +
            "          <expressionIdentifier>\n" +
            "            <name>Index</name>\n" +
            "            <type>OTHER</type>\n" +
            "          </expressionIdentifier>\n" +
            "          <factIdentifier>\n" +
            "            <name>#</name>\n" +
            "            <className>java.lang.Integer</className>\n" +
            "          </factIdentifier>\n" +
            "          <className>java.lang.Integer</className>\n" +
            "          <factAlias>#</factAlias>\n" +
            "          <columnWidth>70</columnWidth>\n" +
            "          <factMappingValueType>NOT_EXPRESSION</factMappingValueType>\n" +
            "        </FactMapping>\n" +
            "        <FactMapping>\n" +
            "          <expressionElements/>\n" +
            "          <expressionIdentifier>\n" +
            "            <name>Description</name>\n" +
            "            <type>OTHER</type>\n" +
            "          </expressionIdentifier>\n" +
            "          <factIdentifier>\n" +
            "            <name>Scenario description</name>\n" +
            "            <className>java.lang.String</className>\n" +
            "          </factIdentifier>\n" +
            "          <className>java.lang.String</className>\n" +
            "          <factAlias>Scenario description</factAlias>\n" +
            "          <columnWidth>300</columnWidth>\n" +
            "          <factMappingValueType>NOT_EXPRESSION</factMappingValueType>\n" +
            "        </FactMapping>\n" +
            "        <FactMapping>\n" +
            "          <expressionElements>\n" +
            "            <ExpressionElement>\n" +
            "              <step>number</step>\n" +
            "            </ExpressionElement>\n" +
            "          </expressionElements>\n" +
            "          <expressionIdentifier>\n" +
            "            <name>1|1</name>\n" +
            "            <type>GIVEN</type>\n" +
            "          </expressionIdentifier>\n" +
            "          <factIdentifier>\n" +
            "            <name>number</name>\n" +
            "            <className>number</className>\n" +
            "          </factIdentifier>\n" +
            "          <className>number</className>\n" +
            "          <factAlias>number</factAlias>\n" +
            "          <expressionAlias>value</expressionAlias>\n" +
            "          <genericTypes/>\n" +
            "          <columnWidth>188</columnWidth>\n" +
            "          <factMappingValueType>NOT_EXPRESSION</factMappingValueType>\n" +
            "        </FactMapping>\n" +
            "        <FactMapping>\n" +
            "          <expressionElements>\n" +
            "            <ExpressionElement>\n" +
            "              <step>greaterThan10</step>\n" +
            "            </ExpressionElement>\n" +
            "          </expressionElements>\n" +
            "          <expressionIdentifier>\n" +
            "            <name>1|2</name>\n" +
            "            <type>EXPECT</type>\n" +
            "          </expressionIdentifier>\n" +
            "          <factIdentifier>\n" +
            "            <name>greaterThan10</name>\n" +
            "            <className>greaterThan10</className>\n" +
            "          </factIdentifier>\n" +
            "          <className>string</className>\n" +
            "          <factAlias>greaterThan10</factAlias>\n" +
            "          <expressionAlias>value</expressionAlias>\n" +
            "          <genericTypes/>\n" +
            "          <columnWidth>188</columnWidth>\n" +
            "          <factMappingValueType>NOT_EXPRESSION</factMappingValueType>\n" +
            "        </FactMapping>\n" +
            "      </factMappings>\n" +
            "    </scesimModelDescriptor>\n" +
            "    <scesimData>\n" +
            "      <Scenario>\n" +
            "        <factMappingValues>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>Scenario description</name>\n" +
            "              <className>java.lang.String</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>Description</name>\n" +
            "              <type>OTHER</type>\n" +
            "            </expressionIdentifier>\n" +
            "            <rawValue class=\"string\">it should be greater than 10</rawValue>\n" +
            "          </FactMappingValue>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>number</name>\n" +
            "              <className>number</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>1|1</name>\n" +
            "              <type>GIVEN</type>\n" +
            "            </expressionIdentifier>\n" +
            "            <rawValue class=\"string\">32</rawValue>\n" +
            "          </FactMappingValue>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>greaterThan10</name>\n" +
            "              <className>greaterThan10</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>1|2</name>\n" +
            "              <type>EXPECT</type>\n" +
            "            </expressionIdentifier>\n" +
            "            <rawValue class=\"string\">\"true\"</rawValue>\n" +
            "          </FactMappingValue>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>#</name>\n" +
            "              <className>java.lang.Integer</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>Index</name>\n" +
            "              <type>OTHER</type>\n" +
            "            </expressionIdentifier>\n" +
            "            <rawValue class=\"string\">1</rawValue>\n" +
            "          </FactMappingValue>\n" +
            "        </factMappingValues>\n" +
            "      </Scenario>\n" +
            "      <Scenario>\n" +
            "        <factMappingValues>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>Scenario description</name>\n" +
            "              <className>java.lang.String</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>Description</name>\n" +
            "              <type>OTHER</type>\n" +
            "            </expressionIdentifier>\n" +
            "            <rawValue class=\"string\">it should be lesser than 10</rawValue>\n" +
            "          </FactMappingValue>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>number</name>\n" +
            "              <className>number</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>1|1</name>\n" +
            "              <type>GIVEN</type>\n" +
            "            </expressionIdentifier>\n" +
            "            <rawValue class=\"string\">6</rawValue>\n" +
            "          </FactMappingValue>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>greaterThan10</name>\n" +
            "              <className>greaterThan10</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>1|2</name>\n" +
            "              <type>EXPECT</type>\n" +
            "            </expressionIdentifier>\n" +
            "            <rawValue class=\"string\">\"false\"</rawValue>\n" +
            "          </FactMappingValue>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>#</name>\n" +
            "              <className>java.lang.Integer</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>Index</name>\n" +
            "              <type>OTHER</type>\n" +
            "            </expressionIdentifier>\n" +
            "            <rawValue class=\"string\">2</rawValue>\n" +
            "          </FactMappingValue>\n" +
            "        </factMappingValues>\n" +
            "      </Scenario>\n" +
            "    </scesimData>\n" +
            "  </simulation>\n" +
            "  <background>\n" +
            "    <scesimModelDescriptor>\n" +
            "      <factMappings>\n" +
            "        <FactMapping>\n" +
            "          <expressionElements/>\n" +
            "          <expressionIdentifier>\n" +
            "            <name>1|1</name>\n" +
            "            <type>GIVEN</type>\n" +
            "          </expressionIdentifier>\n" +
            "          <factIdentifier>\n" +
            "            <name>Empty</name>\n" +
            "            <className>java.lang.Void</className>\n" +
            "          </factIdentifier>\n" +
            "          <className>java.lang.Void</className>\n" +
            "          <factAlias>INSTANCE 1</factAlias>\n" +
            "          <expressionAlias>PROPERTY 1</expressionAlias>\n" +
            "          <columnWidth>114</columnWidth>\n" +
            "          <factMappingValueType>NOT_EXPRESSION</factMappingValueType>\n" +
            "        </FactMapping>\n" +
            "      </factMappings>\n" +
            "    </scesimModelDescriptor>\n" +
            "    <scesimData>\n" +
            "      <BackgroundData>\n" +
            "        <factMappingValues>\n" +
            "          <FactMappingValue>\n" +
            "            <factIdentifier>\n" +
            "              <name>Empty</name>\n" +
            "              <className>java.lang.Void</className>\n" +
            "            </factIdentifier>\n" +
            "            <expressionIdentifier>\n" +
            "              <name>1|1</name>\n" +
            "              <type>GIVEN</type>\n" +
            "            </expressionIdentifier>\n" +
            "          </FactMappingValue>\n" +
            "        </factMappingValues>\n" +
            "      </BackgroundData>\n" +
            "    </scesimData>\n" +
            "  </background>\n" +
            "  <settings>\n" +
            "    <dmnFilePath>src/main/resources/Test.dmn</dmnFilePath>\n" +
            "    <type>DMN</type>\n" +
            "    <dmnNamespace> https://kiegroup.org/dmn/_3C6EA284-D102-44E3-AAAD-FDE5FABB677B </dmnNamespace>\n" +
            "    <dmnName>Test</dmnName>\n" +
            "    <skipFromBuild>false</skipFromBuild>\n" +
            "    <stateless>false</stateless>\n" +
            "  </settings>\n" +
            "  <imports>\n" +
            "    <imports/>\n" +
            "  </imports>\n" +
            "</ScenarioSimulationModel>" ;
}
class UserHandler2 extends DefaultHandler {

    boolean name= false;
    //boolean regno = false;
    boolean deptname = false;

    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

         if (qName.equalsIgnoreCase("name")) {
            name = true;
        }
         //else if (qName.equalsIgnoreCase("regno")) {
            //regno = true;
       // }
        else if (qName.equalsIgnoreCase("deptname")) {
            deptname = true;
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (name) {
            System.out.println("name: " + new String(ch, start, length));
            name = false;
        }
        else if (deptname) {
            System.out.println("department: " + new String(ch, start, length));
            deptname = false;
        }
    }
}
