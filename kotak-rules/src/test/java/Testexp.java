/*import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;*/
import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.dmn.api.core.*;

/*import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;*/

public class Testexp {

    private final KieServices kieServices = KieServices.Factory.get();
    private final KieContainer kieContainer = kieServices.getKieClasspathContainer();
    String namespace = "https://kiegroup.org/dmn/_272A2155-3028-44C7-931E-C73CDBC3761F";
    String modelName = "test1";

    @Test
    public void noGreaterThanTen() {
        DMNRuntime dmnRuntime = kieContainer.newKieSession().getKieRuntime(DMNRuntime.class);
        DMNModel dmnModel = dmnRuntime.getModel(namespace, modelName);
        DMNContext dmnContext = dmnRuntime.newContext();
        Integer num=9;
        dmnContext.set("number", num);
        DMNResult dmnResult = dmnRuntime.evaluateAll(dmnModel, dmnContext);
        for (DMNDecisionResult dr : dmnResult.getDecisionResults()){
            Assertions.assertEquals("false", dr.getResult());
            //System.out.println("number: " + num + ", " + "Result: " + dr.getResult());
        }
    }
    /*@Test
    public void NoLessThanTen() {
       DMNRuntime dmnRuntime = kieContainer.newKieSession().getKieRuntime(DMNRuntime.class);
        DMNModel dmnModel = dmnRuntime.getModel(namespace, modelName);
        DMNContext dmnContext = dmnRuntime.newContext();
        Integer num =3;
        dmnContext.set("number", num);
        DMNResult dmnResult = dmnRuntime.evaluateAll(dmnModel, dmnContext);
        for (DMNDecisionResult dr : dmnResult.getDecisionResults()){
            Assertions.assertEquals("false", dr.getResult());

        }
    }
    @Test
    public void noequalT0Ten() {
        DMNRuntime dmnRuntime = kieContainer.newKieSession().getKieRuntime(DMNRuntime.class);
        DMNModel dmnModel = dmnRuntime.getModel(namespace, modelName);
        DMNContext dmnContext = dmnRuntime.newContext();
        Integer num =10;
        dmnContext.set("number", num);
        DMNResult dmnResult = dmnRuntime.evaluateAll(dmnModel, dmnContext);

        for (DMNDecisionResult dr : dmnResult.getDecisionResults()){
            Assertions.assertEquals("false", dr.getResult());
        }
    }*/

}