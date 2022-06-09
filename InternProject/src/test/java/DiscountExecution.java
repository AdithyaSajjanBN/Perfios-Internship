import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieRuntimeFactory;
import org.kie.dmn.api.core.*;

public class DiscountExecution{
    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        DMNRuntime dmnRuntime = KieRuntimeFactory.of(kieContainer.getKieBase()).get(DMNRuntime.class);
        String namespace = "https://kiegroup.org/dmn/_B4729134-2785-4C63-BF3F-C8F5987E93E8";
        String modelName = "discount";
        DMNModel dmnModel = dmnRuntime.getModel(namespace, modelName);
        DMNContext dmnContext = dmnRuntime.newContext();
        Integer price = 10, units = 600;
        dmnContext.set("UnitPrice", price);
        dmnContext.set("NumberOfUnits", units);
        DMNResult dmnResult = dmnRuntime.evaluateAll(dmnModel, dmnContext);
        for (DMNDecisionResult dr : dmnResult.getDecisionResults()){
            System.out.println("\n");
            System.out.println(dr.getDecisionName() +" "+ dr.getResult());
        }
    }
}
