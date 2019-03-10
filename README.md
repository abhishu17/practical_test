# Rocketo APIs 
Rocketo company needs to query open weather API to identify the best launch windows to send flights to mars. 
This mulesoft based solution Create & expose APIs for Rocketo users to fetch launch windows for selected or all cities. The retunrned launch windows are filtered with configured city threshold values like 
temperature, wind speed and direction.


#Getting started
You may download the example projects and import them to Anypoint Studio.
git clone https://github.com/abhishu17/practical_test.git


You may also access the README.md file from the folder for each of these examples. The README.md file contains the use case and instructions on how to setup and run these examples.


#Assumptions


#Set Up and Run the Example
Complete the following procedure to create, then run this example in your own instance of Anypoint Studio. 

Open the Example project in Anypoint Studio after download.

In your application in Studio, click the Global Elements tab. Double-click the HTTP Listener global element to open its Global Element Properties panel. Change the contents of the port field to required HTTP port e.g. 8081.

In the Package Explorer pane in Studio, right-click the project name, then select Run As > Mule Application. Studio runs the application and Mule is up and kicking!

Access the following URL in browser ( you can change the port and query parameter according to need)

http://localhost:8094/api/weather?city=Perth
http://localhost:8094/api/weather

Also the application has been deployed in cloud hub and accessible at below URLs

http://rocketo-weather-apic.us-e2.cloudhub.io/weather?city=Perth (For selected city)
http://rocketo-weather-apic.us-e2.cloudhub.io/weather (For all cities)


#Configuration required:
Following parameters have been configured in application.
 
1. City List: 
   To add a futher city in the list, name can be added in this configuration.
   city_list=Melbourne,Darwin,Hobart,Perth
   
2. City list Location code:
    Melbourne=7839805
	Darwin=2073124
	Hobart=2163355
	Perth=2063523  
    
3. City list threshold values:
   After adding the city list, threshold values need be added as below  	
	
	Melbourne_wind_threshold=10
	Melbourne_cloudiness_threshold=50

4. API Key needs to be updated 
Note: Currently, we are using environment configuration file, therefore, after performing any change the application needs to be restarted to re-read he configuration values.

#Documentation
  Documents can be access in project file.





    

  

