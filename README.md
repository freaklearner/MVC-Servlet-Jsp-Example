###Servlet-JSP-MVC Example(Beer-V1)

#this is an example of small(tiny) MVC application which is a Beer site of 2 pages that ask user to select a color of Beer and returns brands of beer having that color beer. Its an example from Head First Servlet & Jsp. This example shows the concept of MVC(Model View Controller)-how its works.etc with Servlet and Jsp
Controller	-	Servlet
	:It takes request and response object from container and call model program to perform all its business logic and return 	final result to controller which forward that result to View for presentation stuff.
View		-	Jsp
	:Its basically perform the presentation work it takes the result from controller and make a html page and return that page to container which forward it to user.
Model		-	Expert program that carries all business logic.

##This is a Development Environment to run this you need to set-up a Deployment Environment. And its steps are:
#1)	Install Tomcat.
#2)	Create a folder with name BeerV1 within your tomcat/webapp folder(eg:tomcat/webapp/BeerV1).
#3)	Copy web/form.html and web/result.jsp in tomcat/webapp/BeerV1 folder.
#4) create new folder with name WEB-INF in tomcat/webapp/BeerV1 folder.
#5)	copy etc/web.xml file in tomcat/webapp/BeerV1/WEB-INF folder.
#6) create tomcat/webapp/BeerV1/WEB-INF/classes/examples folder.
#7)	create two folders model and web in tomcat/webapp/BeerV1/WEB-INF/classes/examples.
#8)	copy classes/examples/web/BeerSelect.class at tomcat/webapp/BeerV1/WEB-INF/classes/examples/web and classes/examples/model at tomcat/webapp/BeerV1/WEB-INF/classes/examples/model.
#9) open cmd and change its directory to tomcat/bin folder.
#10) type startup.bat.
#11)open browser and type: localhost:8080/BeerV1/form.html.



