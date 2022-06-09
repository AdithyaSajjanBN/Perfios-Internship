import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieRuntimeFactory;
import org.kie.dmn.api.core.*;

public class dmnExecution{
    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        DMNRuntime dmnRuntime = KieRuntimeFactory.of(kieContainer.getKieBase()).get(DMNRuntime.class);
        String namespace = "https://kiegroup.org/dmn/_3C6EA284-D102-44E3-AAAD-FDE5FABB677B";
        String modelName = "Test";
        DMNModel dmnModel = dmnRuntime.getModel(namespace, modelName);
        DMNContext dmnContext = dmnRuntime.newContext();
        Integer num =9;
        dmnContext.set("number", num);
        DMNResult dmnResult = dmnRuntime.evaluateAll(dmnModel, dmnContext);
        for (DMNDecisionResult dr : dmnResult.getDecisionResults()){
            System.out.println("\n");
            System.out.println("Input "+ num + "\nDecision Name" + dr.getDecisionName() + "\nResult " + dr.getResult());
        }
    }
}
