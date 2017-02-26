
##CALCULATOR-APP

This is a Calculator application that performs basic arithmetic operations - add(+), subtract(-), multiply(*) and divide(/).

System Requirements
--------------------

            Java 8 installed
            Maven installed
            Test cases require JUnit

How to build the Application
---------------------------

1. Download the code from github and go to the project directory.
2. To build the project execute 
           
           "mvn clean install"

Executable JAR will be created in the "target" folder under project directory.

How to run the Application
---------------------------

1. Navigate to target folder.
2. Run the command in following format "java -jar calculator-0.0.1-SNAPSHOT.jar [Operand1] [Operator] [Operand2]" For Example: To perform Division, execute the command as : 
    
              java -jar calculator-app-0.0.1-SNAPSHOT.jar 3 / 1.5
 Result will be displayed on the console.
 
 3. For multiply operator -> "*" (considered as wild card character), should be given in double quotes to be accepted as a valid input string. Such as:
              
             java -jar calculator-app-0.0.1-SNAPSHOT.jar 2 "*" 3
            
