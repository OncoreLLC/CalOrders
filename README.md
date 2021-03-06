#California Department of Technology - OnCore Consulting ADPQ Vendor Pool Refresh Prototype - CalOrders
###[http://calorders.oncorellc.com](http://calorders.oncorellc.com) 

## Introduction

Agile Methods and User Centered Design combine to form an ideal vehicle to quickly understand what users want and deliver on point business solutions.  OnCore closely adhered to these key principles to develop our CalOrders prototype for your review. We used agile user stories that incrementally added functionality over a series of sprints. With each sprint, the business was able to see an early realization of their requirements, which allowed them to provide meaningful feedback early enough to be incorporated into future sprints. Key to this effort was the close collaboration between our development team and the business users. Consistent communication promoted a clear understanding of the users’ needs that in turn helped align the focus of the development team.

Utilizing short cycles between ideas and testing allowed us to respond quickly to change while maintaining an emphasis on solutions over features. Early on we gained support from the client executive team who empowered the end users we were working with to make decisions and own the product. This approach fueled our strategy of, "try, fail fast, learn, and then try again." 

The sections that follow present our experience, methods, and approach in response to the ADPQ Vendor Refresh. We start by listing the requirements from the RFI with links to how each are addressed. We then confirm our adherence to the US Digital Services Playbook, introduce our development team, and describe our approach to user centered design and agile development. The balance of the document defines our Technical Approach where we present our solution including the overall Architecture, our DevOps approach, the User Interface, and a description of the Modern and Open Source Technologies we employed. 

We thank you very much for the opportunity to participate and hope you enjoy reviewing our experience as much as we did preparing it. 

##Project Requirements

The following table lists each project requirement and how they were met or exceeded using easy to follow links to corresponding artifacts.

Requirement | How it was met
--- | ---
a. Assigned one (1) leader and gave that person authority and responsibility and held that person accountable for the quality of the prototype submitted | Mike Tsay
b. Assembled a multidisciplinary and collaborative team that includes, at a minimum, five (5) of the labor categories as identified in Attachment B: PQVP DS-AD Labor Category Descriptions | [Our Team](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)
c. Understood what people needed, by including people in the prototype development and design process |[User Centric Design](https://github.com/OncoreLLC/CalOrders/wiki/User-Centric-Design)<br> [Focus Group](https://github.com/OncoreLLC/CalOrders/wiki/Focus-Group)<br> [Interview](https://github.com/OncoreLLC/CalOrders/wiki/Interviews)<br> [Sprint Review/Product Demo](https://github.com/OncoreLLC/CalOrders/wiki/Sprint-Reviews)
d. Used at least a minimum of three (3) “user-centric design” techniques and/or tools | [Focus Group](https://github.com/OncoreLLC/CalOrders/wiki/Focus-Group)<br> [Interview](https://github.com/OncoreLLC/CalOrders/wiki/Interviews)<br> [Personas](https://github.com/OncoreLLC/CalOrders/wiki/Develop-Personas)<br>[Scenarios](https://github.com/OncoreLLC/CalOrders/wiki/Scenarios)<br>[Storyboards](https://github.com/OncoreLLC/CalOrders/wiki/Story-Boards)<br>[Wireframes](https://github.com/OncoreLLC/CalOrders/wiki/Wire-Frames)<br>[Wireframe Walkthrough](https://github.com/OncoreLLC/CalOrders/wiki/Wireframe-Walkthrough)<br>[Usability Testing](https://github.com/OncoreLLC/CalOrders/wiki/Usability-Testing)
e. Used GitHub to document code commits | [Github Contributions](https://github.com/OncoreLLC/CalOrders/graphs/commit-activity)
f. Used Swagger to document the RESTful API, and provided a link to the Swagger API | [RESTful API Documentation](https://github.com/OncoreLLC/CalOrders/wiki/RESTful-API-Documentation)
g. Complied with Section 508 of the Americans with Disabilities Act and WCAG 2.0 |[ADA and WCAG compliance](https://github.com/OncoreLLC/CalOrders/wiki/ADA-and-WCAG-Compliance) 
h. Created or used a design style guide and/or a pattern library | [Style Guide](https://github.com/OncoreLLC/CalOrders/wiki/Style-Guide)
i. Performed usability tests with people | [Usability Testing](https://github.com/OncoreLLC/CalOrders/wiki/Usability-Testing)
j. Used an iterative approach, where feedback informed subsequent work or versions of the prototype; | [OnCore's Agile Methodology](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Methodolgy)
k. Created a prototype that works on multiple devices, and presents a responsive design |[Responsive Application Design](https://github.com/OncoreLLC/CalOrders/wiki/Responsive-Application-Design)
l. Used at least five (5) modern and open-source technologies, regardless of architectural layer (frontend, backend, etc.) | [Technologies](https://github.com/OncoreLLC/CalOrders/wiki/Modern-and-Open-Source-Technologies)
m. Deployed the prototype on an Infrastructure as a Service (IaaS) or Platform as Service(PaaS) provider, and indicated which provider they used | We deployed the prototype to the Microsoft Azure IaaS provider, please see sections 4 and 5 of the [DevOps Wiki] (https://github.com/OncoreLLC/CalOrders/wiki/Environments) for details.
n. Developed automated unit tests for their code |[Automated Testing](https://github.com/OncoreLLC/CalOrders/wiki/Automated-Testing) 
o. Setup or used a continuous integration system to automate the running of tests and continuously deployed their code to their IaaS or PaaS provider | We used [Jenkins](http://calorderstest.oncorellc.com/jenkins/job/CalOrders/job/CalOrdersPipeline/) for CI and automated testing, please see section 2 on the [DevOps Wiki] (https://github.com/OncoreLLC/CalOrders/wiki/Environments) for details.
p. Setup or used configuration management | All code, configuration and documentation artifacts were managed in our [GitHub Repository](https://github.com/OncoreLLC/CalOrders)
q. Setup or used continuous monitoring | We are running [Google cAdvisor](https://github.com/google/cadvisor) containers on the [JavaScript tier](http://calorders.oncorellc.com:8080/) and [Services tier](http://calorders-services.oncorellc.com:8080/) to monitor the Docker Engine VMs and containers. See section 6 on the [DevOps Wiki] (https://github.com/OncoreLLC/CalOrders/wiki/Environments)
r. Deployed their software in an open source container, such as Docker (i.e., utilized operating-system-level virtualization) | We use Docker, please see section 3 on the [DevOps Wiki] (https://github.com/OncoreLLC/CalOrders/wiki/Environments)
s. Provided sufficient documentation to install and run their prototype on another machine | Please see section 7 on the [DevOps Wiki] (https://github.com/OncoreLLC/CalOrders/wiki/Environments)
t. Prototype and underlying platforms used to create and run the prototype are openly licensed and free of charge | [Software Licensing](https://github.com/OncoreLLC/CalOrders/wiki/Software-Licensing)

## [US Digital Services Playbook](https://github.com/OncoreLLC/CalOrders/wiki/Addressing-U.S.-Digital-Services-Playbook-Plays)

Our team followed the US Digital Services Playbook, covering each of the 13 plays, from understanding what people need to defaulting to open. Follow this link for [evidence of how each play was followed](https://github.com/OncoreLLC/CalOrders/wiki/Addressing-U.S.-Digital-Services-Playbook-Plays).


## [Development Team](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)

OnCore selected Mike Tsay, our Chief Technology Architect, to be the Team Leader/Project Manager. In that role, Mike was responsible and accountable for the quality of the prototype submitted. The following table presents the remainder of OnCore’s multidisciplinary and collaborative team that fulfilled the seven labor categories listed below. 

**We selected a multidisciplinary and collaborative team that fulfilled the following seven labor categories:**  

Role(Labor Category) | Team Member 
--- | ---  
Product Manager	| [Mike Tsay](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)
Agile Coach/Technical Architect | [Royce Owens, CSM](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)  
Technical Architect/DevOps Engineer | [Kyle Poland](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios) 
Interaction Designer/User Researcher/Usability Tester | [Mike Earl, CSM](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)
Front End Web Developer | [Kevin Babcock](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)
Front End Web Developer | [Ryan Sinor](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)  
Backend Web Developer | [Janice Wiley](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)  
Backend Web Developer | [Won Lee](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)  
DevOps Engineer | [Suganya Ravikumar](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Team-Bios)  

## [User Centric Design](https://github.com/OncoreLLC/CalOrders/wiki/User-Centric-Design) - Understanding what people need  

The first step of a  [User-Centered-Design](https://github.com/OncoreLLC/CalOrders/wiki/User-Centric-Design) (UCD) process is to formulate a plan.  Our plan, framed by our [statement of work](https://github.com/OncoreLLC/CalOrders/wiki/Statement-of-Work), identified the project objectives, requirements, user community, constraints, schedule, and deliverables.

Our plan combines our UCD and Agile processes into a cohesive and flexible workflow that enabled us to not only identify the capabilities users most valued, but to also focus our story and build activities to deliver working functionality after each sprint. Working in this fashion allowed for feedback and subsequent changes to the design, which resulted in a product that reflected what the end users were really asking for. 

The team utilized User-Centered-Design (UCD) and Agile development techniques to formulate the product backlog. All team members participated in the initial meetings with the users. This was a natural lead into our Agile methodology, allowing the whole team the opportunity to understand the scope of the project and understand how they would contribute to the project's success.   

The table below summarizes how we incorporated the UCD practices of Plan, Analyze, Design, Implement and Test & Measure in the development of CalOrders.  Each section includes a link to another page that provides detail on the subject.

Plan | Analyze| Design | Implement | Test & Measure  
--- | --- | --- | --- | ----
Kickoff Meeting | [Research Domain](https://github.com/OncoreLLC/CalOrders/wiki/Domain-Research)    |[Scenarios](https://github.com/OncoreLLC/CalOrders/wiki/Scenarios) | [Style Guide](http://www.oracle.com/webfolder/technetwork/jet/jetCookbook.html)    |[Usability Test](https://github.com/OncoreLLC/CalOrders/wiki/Usability-Testing)
[Statement of Work](https://github.com/OncoreLLC/CalOrders/wiki/Statement-of-Work)   |[Focus Groups](https://github.com/OncoreLLC/CalOrders/wiki/Focus-Group)|[Story Boarding](https://github.com/OncoreLLC/CalOrders/wiki/Story-Boards)     |[Wireframe Walkthrough](https://github.com/OncoreLLC/CalOrders/wiki/Wireframe-Walkthrough) | Refine Application            
[Develop a Plan](https://github.com/OncoreLLC/CalOrders/wiki/User-Centric-Design)   | [Personas](https://github.com/OncoreLLC/CalOrders/wiki/Develop-Personas)||                       | [Retest](https://github.com/OncoreLLC/CalOrders/wiki/Usability-Test-Final)
||[Interviews](https://github.com/OncoreLLC/CalOrders/wiki/Interviews) ||

## [Agile Development](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Methodolgy)   

The team's principle focus during development of CalOrders is summarized best by Jeff Sutherland, “[Value] people over processes; products that actually work over documenting what that product is supposed to do; collaborating with customers over negotiating with them; and responding to change over following a plan.” (From 'Scrum: The Art of Doing Twice the Work in Half the Time'). Adhering to these principles within [Oncore's Agile methodology](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Methodolgy) enabled us to follow an iterative approach wherein timely feedback informed subsequent versions of the prototype resulting in a better end product.

For example, during the early focus group sessions users described the need to improve the “Add Product” business process as critical. This awareness allowed us to prioritize and deliver in Sprint 1 a simplified “Add Product” page. In Sprint 2, we provided the enhanced capability to upload images and integrated the new feature within the navigation bar. Users remarked how they were pleased about not having to wait for the improved “Add Product” page (a core need) while the image upload capability was being developed and tested. 

Another example where UCD and Agile combined was during the walkthrough of the Sprint 1 pages. The end users noticed that the product search tree did not include Services. This kicked off an impromptu design session to better understand the concept, which resulted in data model and application changes that were quickly incorporated. Had the interaction with the end users not been part of the methodology, implementing the change would have been more complicated and less timely.

### Principles

There are many different project development methodologies within agile, but they all center around a core set of principles:

1. Define a measurable goal.
2. Everyone owns the problem.
3. Small steps with visible impact.
4. Validate with your target audience.
5. Measure success.
6. Reflect, adjust, iterate.

### Process   

Our [Agile](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Methodolgy) process allowed us to rapidly deliver a working product and maintain the momentum from the User Centered Design Sessions. Utilizing sprint cycles, we were able to add new stories while existing stories in the backlog and icebox were continually evolving and reprioritized with ongoing meetings outside the development cycle. These meetings took place between the product owner, business analysts and end users. Focusing on keeping things simple and continually evolving fostered an environment of rapid delivery and allowed for face-to-face interactions with  end users to review how the system was advancing. More importantly, it allowed for failure, and with the quick adjustments yielded a system that worked for the end users.

###  Practices
The list below provides links to additional artifacts and other important information about each agile practice that was utilized for this project.<br>
* [User Stories (Pivotal Tracker)](https://www.pivotaltracker.com/n/projects/1968721) 
* [User Story Estimation](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Story-Estimation) 
* [User Story Prioritization](https://github.com/OncoreLLC/CalOrders/wiki/Agile-Story-Prioritization) 
* [Sprint planning](https://github.com/OncoreLLC/CalOrders/wiki/Sprint-Planning) 
* [Sprints](https://github.com/OncoreLLC/CalOrders/wiki/Sprints)
* [Sprint Reviews](https://github.com/OncoreLLC/CalOrders/wiki/Sprint-Reviews)
* [Retrospectives](https://github.com/OncoreLLC/CalOrders/wiki/Sprint-Retrospectives) 
* [Daily Standups](https://github.com/OncoreLLC/CalOrders/wiki/Sprint-Daily-Stand-ups)


## Technical Approach

Our Technical Approach relied on user centered design and agile methods underpinned by modern technology. Our goal was to build what the user really needed, and as such, we structured our methods, tooling and architecture around iterative, collaborative activities that allowed development staff to iterate quickly with end users. 

The following sections describe our technical approach to building the CalOrders application. They describe our approach to DevOps, our Architecture, our Development Environment, and our Responsive User Interface and Application Design. We conclude with a description of our approach to using shared architectural components, use of modern and open source technologies, and our accessible user interface.



### Architecture

Our CalOrders architecture is centered on the following core principles:


* Open Source architecture built on the latest JavaScript, HTML5, CSS, and Java technologies
* Supports latest architectural concepts of speed, replace-ability, and continuous delivery
* Supports Agile development and project management techniques  
* Transparency, GitHub repository open to public 


![Figure 1](https://github.com/OncoreLLC/CalOrders/blob/master/Artifacts/images/Architecture_files/calorders_arch01_small.png)

Figure 1: CalOrders Architecture

### Development Environment

CalOrders by default uses the open source NetBeans IDE for development.  NetBeans provides excellent Java and JavaScript support as well as an integrated Oracle JET plugin providing command line completion and other useful features when working with Oracle JET. For more information about setting up a local development environment, see the [CalOrders Help](https://github.com/OncoreLLC/CalOrders/wiki/Help) wiki page.


### CalOrders Deployment Structure - Projects

The CalOrders application is organized into individual NetBeans projects separated by area of concern.  Separating the user interface from the backend services makes it easier to allocate the layers to user interface or service development specialists.

 
* CalOrdersJET - [(CDT–ADPQ–0117-2-Technical Approach: Client UI)](https://github.com/OncoreLLC/CalOrders/tree/master/CalOrdersJET)  JET JavaScript, HTML5, CSS project providing the front end for the CalOrders application
* JavaScript Library - [(CDT–ADPQ–0117-2-Technical Approach: JavaScript Library)](http://www.oracle.com/webfolder/technetwork/jet/index.html) Oracle JET is an open source JavaScript framework proving a rich set of ADA compliant components. See User Interface section below for more details about Oracle JET
* CalOrdersREST - [(CDT–ADPQ–0117-2-Technical Approach: REST Service)](https://github.com/OncoreLLC/CalOrders/tree/master/CalOrdersRest) Java dynamic web project providing support for REST services and the data access layer via Java JEE (Java Enterprise Edition) and JPA (Java Persistence API)
* CalOrdersCore - Java API project holding shared utility classes, interfaces, and base classes designed to support the other CalOrders Java projects
* CalOrders Database = [(CDT–ADPQ–0117-2-Technical Approach: Database)](https://github.com/OncoreLLC/CalOrders/tree/master/DB_Scripts) MySQL database model, DDL, and reference data scripts

### User Interface

The CalOrders user interface layer [(CDT–ADPQ–0117-2-Technical Approach: Client UI)](https://github.com/OncoreLLC/CalOrders/tree/master/CalOrdersJET) is comprised of the open source Oracle JET JavaScript framework. From the Oracle JET user guide, "Oracle JET is a collection of Oracle and open source JavaScript libraries engineered to make it as simple and efficient as possible to build client-side web and hybrid mobile applications based on JavaScript, HTML5, and CSS.

Oracle JET is designed to meet the following application needs:

* Add interactivity to an existing page.
* Create a new end-to-end client-side web application using JavaScript, HTML5, CSS, and best practices for responsive design.
* Create a hybrid mobile application that looks and feels like a native iOS, Android or Windows application.

Unlike many competing open source JavaScript alternatives, Oracle JET has an excellent and complete [component](http://www.oracle.com/webfolder/technetwork/jet/jetCookbook.html) library covering all aspects of user interface construction. In addition, it has a rich set of documentation and a complete and fully documented API.  Oracle JET is actively used by Oracle in its own offerings and is therefore updated and enhanced on a regular basis. 

JET also covers the following critical areas of modern web user interface construction:

* Full W3C ADA compliance
* Security features as outlined in the OWASP guidelines
* Strict adherence to MVC standards for clean separation of concerns
* Full internationalization support
* Responsive design
* Theme support 
* Mobile hybrid support
* Support for SPA (Single Page Application) design ( see [Single Page Application - WikiPedia](https://en.wikipedia.org/wiki/Single-page_application) ) Note, CalOrders is a SPA application.

Due to these features and its extensive component library, JET provides an excellent foundation for the CalOrders UI. For more information about the Oracle JET framework please see [About Oracle JET](http://docs.oracle.com/middleware/jet220/jet/developer/GUID-C6947139-DF37-4258-8E02-2679F40535E1.htm#JETDG108)

#### SPA (Single Page Application)

CalOrders is a Single Page Application with a single entry point. Each screen in the application is a distinct HTML fragment substituted by the JET routing framework; however, they are not full HTML pages.  

#### Views

A [view](https://github.com/OncoreLLC/CalOrders/tree/master/CalOrdersJET/src/js/views) in CalOrders is a distinct SPA HTML fragment, which holds the front end static and 
dynamic content for the view. JET uses Knockout for data binding, which binds the view model 
to the view.   In JET the view must match its supporting view model by name.  Accordingly,  a view named "about.html" will have a corresponding view model named "about.js". Views are composed of HTML, CSS, and JavaScript tags and are editable in any editor. 

The following code snippet is taken from a CalOrders JET view showing Knockout data binding in action.

```
 <div class="oj-flex-item">
  <label for="productName">Product Name:</label>
   <input id="productName"  type="text" required 
        data-bind="ojComponent: {
                                  component: 'ojInputText', 
                                  value:productName, required: true,
                                  validators: [{type: 'regExp', options: {
                                  pattern: '[:\\-!@#$%^&*,?.;:()+={}<>\'\&quot\\w\\s]{1,128}',
                                   hint: 'Enter a product name that is less than 128 alphanumeric characters (including the following characters :-!@#$%^&*();?+={}<>,\'\&quot',
                                   messageDetail: 'The product name must be less than 128 alphanumeric characters (including the following characters :-!@#$%^&*();?+={}<>,\'\&quot'} },
                                   validateProductName],
                                  messagesCustom: productNameMessage,
                                  invalidComponentTracker: tracker}">
 </div>
```

In this example, "productName" is a Knockout variable defined in the view model.  As the user
types in the input field, Knockout binds the user input to the view model.  This greatly simplifies
development of the page and also allows for useful features like real-time updates on the page
as the input changes without refreshing the content.  For more information about Knockout visit [here](http://knockoutjs.com). To
learn more about how JET incorporates Knockout, see [here](http://docs.oracle.com/middleware/jet230/jet/developer/GUID-808434E0-CA80-405C-9450-59E0BF525700.htm#JETDG334).

#### View Models

A [view model](https://github.com/OncoreLLC/CalOrders/tree/master/CalOrdersJET/src/js/viewModels) holds the business logic for the view and also manages the REST operations for the view. 
The view model uses a consistent pattern defined by JET, which helps to ensure consistency across models and simplifies coding. In the view model,
variables can be defined as Knockout observables.  Using the view example from above, the productName is defined as a Knockout variable in the view
model and any input provided by the user on the page is accessible via the variable as shown below.

```
self.productName = ko.observable();


self.somefunction = function()
{
	 if(StringUtils.isEmptyOrUndefined(self.productName()))
     {
        console.log("Hey the user provided product name : " + self.productName());
     }
     
	....
	
}

```

REST calls are managed via the view model as well using the JET oj Model. 



```
 var SomeModel = oj.Model.extend({
                     urlRoot: serviceURL,
                     idAttribute: 'id'
                   });

 var someModel = new SomeModel();

 someModel.fetch({
                 
                 
 success: function () {
             console.log("Service call success! " + someModel.attributes);  
                    ... 
             },
 error: function (jqXHR, textStatus, errorThrown) {
             console.log("Error calling Service!" + errorThrown);
                    ...
             }
 });
                    
```

The views and view models combine to form the most common pattern when building CalOrders. However, 
JET provides many additional features not covered in this overview.  For more information, visit the 
Oracle JET [resource](http://www.oracle.com/webfolder/technetwork/jet/globalResources.html)
and [support](http://www.oracle.com/webfolder/technetwork/jet/globalSupport.html) pages.

### Services

![Figure 6](https://github.com/OncoreLLC/CalOrders/blob/master/Artifacts/images/Architecture_files/calorders_arch02_small.png)

Figure 6: CalOrders Service Architecture

CalOrders uses [REST services](https://github.com/OncoreLLC/CalOrders/tree/master/CalOrdersRest/src/java/com/oncore/calorders/rest/service) exposed from JEE Session Beans using the built in annotations available from Java.  Java provides excellent REST service support in JEE making it extremely easy to create REST services supporting CRUD operations on an underlying datastore.  CalOrders uses the NetBeans REST services generator to create the core set of JPA entities and REST facades needed for the application.  Customizing the service entities is supported via built in JPA functionality using the persistence.xml file and xml files containing custom named queries or custom queries can be defined directly in the REST Facades using the JPA create query method and syntax.  See the [HOW TO Create Custom Queries and REST Facades](https://github.com/OncoreLLC/CalOrders/wiki/HOW-TO-Create-Custom-Queries-and-REST-Facades) Wiki page for more details on how to create custom JPA Named Queries and REST Facades.  Core classes and utilities needed to support the underlying architecture across domains are defined in CalOrdersCore.


### Shared Architectural Components

CalOrders places common architectural components in the shared CalOrdersCore project. CalOrdersCore only contains base classes and interfaces along with shared utility classes. NetBeans simplifies compilation and deployment by allowing other NetBeans projects such as CalOrdersREST to reference core in the editor. Also available is the option to compile and bundle the CalOrdersCore project into an independent JAR, which can then be referenced by other projects. 


### Databases

The CalOrders application currently uses the MySQL [database](https://github.com/OncoreLLC/CalOrders/tree/master/DB_Scripts) for back-end storage. MySQL is one of the most popular open source databases available backed by years of proven implementations. MySQL has a rich library of information available for support, whether in the form of online discussions or in actual documentation from MySQL. The MySQL supporting libraries and tools are also multi-platform, stable, and provide all the functionality a development team needs to build applications.

CalOrders uses JPA as an abstraction layer so nothing prevents migrating the database to a different provider such as Oracle or SQL Server. In this regard, JPA provides CalOrders impressive flexibility and upgradability.

The CalOrdersREST project contains a dedicated folder to hold the MySQL DDL, [database model](https://github.com/OncoreLLC/CalOrders/blob/master/Artifacts/images/Architecture_files/database.png), and the reference/test data insert scripts.

The [database model](https://github.com/OncoreLLC/CalOrders/blob/master/Artifacts/images/Architecture_files/database.png) can be viewed and updated by using the MySQL Workbench tool.  Please see the [MySQL](http://www.mysql.com) website for more information about MySQL and to obtain the database and WorkBench tools for a particular operating system.

### Modern and Open Source Technologies

Technology | Requirement  
--- | ---  
[Unbuntu Linux](https://www.ubuntu.com)	| Operating System used for both the development workstation and the deployment environment 
[NetBeans](https://netbeans.org) | Development IDE  
[Oracle JET]() | Open Source JavaScript UI Component Library  
[Node JS](https://nodejs.org/en/) | Frontend Javscript Engine  
[Payara](http://www.payara.fish/) | JEE Application Server  
[MySQL](https://www.mysql.com/) | Database  
[Jenkins](https://jenkins.io/) | Continuous Integration  
[JUnit](http://junit.org/junit4/) | [automated unit test cases are here in the repository]  (https://github.com/OncoreLLC/CalOrders/tree/master/CalOrdersRest/test/com/oncore/calorders/rest/service/extension)
[Selenium](http://www.seleniumhq.org/) | [automated regression test cases are here in the repository](https://github.com/OncoreLLC/CalOrders/tree/master/CalOrdersSelenium/test/test/oncore/calorders/selenium)  
[Knockout JS](http://knockoutjs.com/) | Front-end Javascript library  
[Require JS](http://requirejs.org/) | Front-end Javascript library  
[jQuery](https://jquery.com/) | Front-end Javascript library  
[Swagger](http://swagger.io/) | [Our Swagger WebApp is here](http://calorderstest.oncorellc.com:9081/)   
[NVDA](https://www.paciellogroup.com/blog/2008/01/nvda-a-free-and-open-source-screen-reader-for-windows/) | Screen Reader
[WAVE](https://chrome.google.com/webstore/detail/wave-evaluation-tool/jbbplnpkjmmeebjpijfedlgcdilocofh?hl=en-US) | ADA Browser testing plugin
[Google cAdvisor](https://github.com/google/cadvisor) | Open Source Monitoring package for our [Application Containers](http://calorders-services.oncorellc.com:8080/)

### Accessibility

As part of the CalOrders quality control process, the OnCore team validated Americans with Disabilities Act (ADA) compliance, using the WAVE plugin for Chrome and the NVDA screen reader.  Oracle JET supports Web Content Accessibility Guidelines version 2.0 at the AA level (WCAG 2.0 AA), developed by the World Wide Web Consortium (W3C).  JET provided the CalOrders development team the following features out of the box:
* Mouse, keyboard, and touch navigation compliance
* Screen reader and screen magnification compliance
* Component roles and names are assigned appropriately for each component
* Correct color contrast via the Alta theme which supports luminosity contrast ratio of at least 4.5:1

During testing, the JET framework proved its worth in reducing the ADA work load by allowing the team to focus on building screen content with less time worrying about ADA compliance issues. Testing CalOrders with WAVE revealed no major errors and only a handful of warnings that required resolution. Likewise, tests with NVDA with FireFox showed excellent results with the only significant bug involving [dialog boxes](https://www.pivotaltracker.com/story/show/140812285).  It must be noted, JET requires the use of the F2 key when navigating components inside a table or list row, which is not immediately evident and could impact testing with a screen reader.   

### DevOps

DevOps is the convergence of application development and operations.  It is prevalent through the entire lifecycle, starting with design and continuing through production deployment. 

[Our DevOps Approach](https://github.com/OncoreLLC/CalOrders/wiki/Environments) is centered on continuous integration, including regular builds, automated testing, and efficient environment buildout and maintenance.  It leverages Docker images for container based deployments, and cAdvisor for monitoring.  
