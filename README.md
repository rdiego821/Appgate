# Appgate

Technical test including Spring Boot app with Rest API, Jenkins and Docker.
Implementing the Abstract Factory pattern.

# How to install and run the project: 🚀
Once the repo has been cloned run the following commands:

mvn clean package
java -jar target\appgate-operations-integration.jar	

Run the Services from Postman or Talend API Tester.

http://127.0.0.1:8080/api/   method GET: service for create a new Session.

http://127.0.0.1:8080/api/operands/2  method POST: Service for aggregate operands.

http://127.0.0.1:8080/api/operations/addition     method POST:  Service for perform an operation.

http://127.0.0.1:8080/api/operations/addition?isResultAdded=true    method POST   // include ?isResultAdded=true in the URL if the result should be added as operand for the next calculation. 
		
other operations addmited:
substraction, multiplication, division, potentiation.

# High availability 📦
The service is highly available because the image published in Docker at https://hub.docker.com/r/rdiego12/appgate-operations-integration can be accessed from any device.

# Elastic 🛠️
The service is elastic because it offers continuous availability of services.
