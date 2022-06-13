# Automation of DMN Testing

1) Create a DMN
2) Parse the file
3) Autogenerate Test cases

Create a DMN :

  DMN is a modeling language and notation for the precise specification of business decisions and business rules.
  In DMN, we use diagrams to notate the decision making process.
  Business analysts can model rules that lead to a decision in the form of tables which are easy to read and these tables can be executed directly by a       decision engine. This minimises the risk of misunderstanding between business analysts and developers.

  DMN elements :
  
  DMN models consist of the following five elements:
  
    1) Decisions: Nodes in the model where one or several inputs determine an output based on decision logic.
    2) Input data: Information necessary to determine a decision. 
    3) Business knowledge models: Reusable pieces of decision logic. 
    4) Knowledge sources: External regulations, documents, committees, policies, and so on that shape decision logic. 
    5) Decision service: A decision service is a top-level decision, with well-defined inputs, that is published as a service for invocation.

  Create a file with .dmn extension in VSCode, the file with .dmn extension are automatically displayed as graphical models.
  
  Evaluation of DMN model:
  
  A KIE container is local when the knowledge assets are either embedded directly into the calling program, or are physically pulled in using Maven         dependencies for the KJAR.

  Procedure:
  
  1) Add the required dependencies in pom.xml 
  2) Create a KIE container from classpath
  3) Obtain DMN Runtime from the kie container and a reference to the dmn model to be evaluated, by using model namespace and modelname
  4) Execute the decision services for the desired model.

