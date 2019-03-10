# Rocketo APIs 
Rocketo company needs to query open weather API to identify the best launch windows to send flights to mars. 
This mulesoft based solution Create & expose APIs for Rocketo users to fetch launch windows for selected or all cities. The retunrned launch windows are filtered with configured city threshold values like 
temperature, wind speed and direction.

# Environment
Version: **Mule server 3.8.1 EE**
Deployment: **Cloudhub**
Anypoint platform: **API gateway** 

# Getting started
You may download the example projects and import them to Anypoint Studio.
git clone https://github.com/abhishu17/practical_test.git

# Assumptions


# Set Up and Run the Example
Complete the following procedure to create, then run this example in your own instance of Anypoint Studio. 

Open the Example project in Anypoint Studio after download.

In your application in Studio, click the Global Elements tab. Double-click the HTTP Listener global element to open its Global Element Properties panel. Change the contents of the port field to required HTTP port e.g. 8081.

In the Package Explorer pane in Studio, right-click the project name, then select Run As > Mule Application. Studio runs the application and Mule is up and kicking!

Access the following URL in browser ( you can change the port and query parameter according to need)

**http://localhost:8094/api/weather?city=Perth**

**http://localhost:8094/api/weather**

Also the application has been deployed in cloud hub and accessible at below URLs

http://rocketo-weather-apic.us-e2.cloudhub.io/weather?city=Perth (For selected city)

http://rocketo-weather-apic.us-e2.cloudhub.io/weather (For all cities)


# Configuration required:

Following parameters have been configured in application.
 
1. City List: 

   To add a further city in the list, name can be added in this configuration.
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

# Note: 

1. Currently, we are using environment configuration file, therefore, after performing any change the application needs to be restarted to re-read he configuration values.
2. We can use java based configuration to read the properties dynamically
   and can change the properties on the fly.
3. The API Key can be secured in vault or secure properties in mule cloudhub. 

# Non functional requirements

**Security

Currently the weather API is deployed on Mule any point platform and the backend code (mule application) is deployed over cloud hub. API Gateway protects the underlying backend APIs and also limit the number of access using policies.
The APIs can be protected through various policies at run time. For instance, currently the following policies are enabled.

a.	Throttling  (which allows only 2 request per 10 sec)

*Besides this we can add OAuth2.0 mule component for authentication of user.

**Scalability

Solution deploy over cloud are auto scalable. More processing power can be added on the fly. Moreover, the auto scaling can be triggered by policies as CPU & memory usage of the server.

**Performance-

Mule flows and the message processor activities are highly optimized piece of code. However, there are various way to tune the mule application as data weave operations, remove the redundant design activities, configuration settings etc. Moreover, the underlying JVM also can be tuned for heap memory and garbage collection settings.



# Deployment

Deployment can be achived by following ways

1. Using anypoint studio

2. Using maven command

3. Using Jenkins pipeline

# Documentation
  Documents can be generated in mule anypoint studio directly.
  navigate to File/Export Studio Documentation
  
 ![alt text](https://github.com/abhishu17/practical_test/blob/master/images/RuntimeManager.jpg)
 
 ![alt text](https://github.com/abhishu17/practical_test/blob/master/images/preview.png)
  
 
