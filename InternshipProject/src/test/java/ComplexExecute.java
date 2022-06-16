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

public class ComplexExecute {

    private final KieServices kieServices = KieServices.Factory.get();
    private final KieContainer kieContainer = kieServices.getKieClasspathContainer();
    String namespace = "https://kiegroup.org/dmn/_6ABA6E94-A4E2-4BB9-89AF-55D9E8A64744";
    String modelName = "totalPrice";

    @Test
    public void returnTrue() {
        DMNRuntime dmnRuntime = kieContainer.newKieSession().getKieRuntime(DMNRuntime.class);
        DMNModel dmnModel = dmnRuntime.getModel(namespace, modelName);
        DMNContext dmnContext = dmnRuntime.newContext();
        Integer int_a=9, int_b=5;
        String string_a="Hi", string_b="Hello";
        dmnContext.set("int_a",int_a);
        dmnContext.set("int_b",int_b);
        dmnContext.set("String_a",string_a);
        dmnContext.set("String_b",string_b);
        DMNResult dmnResult = dmnRuntime.evaluateAll(dmnModel, dmnContext);
        for (DMNDecisionResult dr : dmnResult.getDecisionResults()){
            //Assertions.assertEquals("true", dr.getResult());
            System.out.println("Result :" + dr.getResult());
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