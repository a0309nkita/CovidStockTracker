# Contents

1.  Short description
2.  Demo video
3.  The architecture
4.  Long description
5.  Project roadmap
6.  Getting started
7.  Running the tests
8.  Live demo
9.  Built with
10. Contributing
11. Versioning
12. Authors
13. License
14. Acknowledgments

# Short description

## Problem Statement:
During uncontrollable epidemic and pandemic situation, it is highly precautionary to maintain hygiene. Henceforth, public is essential to wear Personal Protective Equipment such as kits, masks, gloves, gowns, to safeguard their health.
In the current Covid situation there exists no standard marketplace/platform for frontline health workers to buy required medical equipment.
 
## Idea:
It is obvious to have a marketplace where it can facilitate to get the personal safeguards during exigency such as COVID-19, accessible to all frontline workers.
 
## How can technology help?
This web portal can continue to serve the frontline workers to place order according to their need to purchase PPE gears, additionally it provides the easy way to users to order products in bulk from differenr manufaturers at once.
 
## Solution:
Covid Stock Tracker(CST) is a web portal created for frontline workers to find the protective gears such as masks, gloves, gowns etc. Suppliers/Sellers will be able to input the product related information into CST which will then be accessed by the Frontline workers and they can place the orders as required. This can help them to better prepare and to provide quality care to the patients and help save lives to not only the patients but to protect themselves.

# Demo video

 ![Alt text](https://www.youtube.com/watch?v=8sEVY37aIoE)

## CovidStockTracker 


Developed an end to end **Ecommerce web Application using Spring MVC** with multiple
modules


### Functionalities:

1. User Registeration

2. **CRUD Operations** like

* User can add product to his cart
* Admin can add product to the product list
* Admin can edit the product details
* Admin can delete the product from the list

3. **Spring Security**

* User can login the site
* The entire site will change according the role. Whether the client is User or Admin
* user can logout after completing.

4. **Spring WebFlow**

* after adding products the cart the User can checkout using spring WebFlow
* Confirming User Details
* Confirming Shipping and Billing Address
* Receipt
* If the user cancel the webflow it will go to cancel Page
* If the user submits the checkout it will go to thank you page with the timing of delivery Report

### Tools and Technologies:

* **Technology** : Bootstrap, Java, Spring MVC, Hibernate, JSP, Maven.
* **Application Servicer**: Apache Tomcat Server
* **Database** : H2 Database.

### Installation:

1. Development Platform - Eclipse / IntelliJ Idea
   * [Download Eclipse](https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars2)
   * [Download IntelliJ Idea](https://www.jetbrains.com/idea/download/#section=windows)
2. Server - Apache Tomcat Server

   * [Download Apache Server](https://tomcat.apache.org/download-90.cgi)

3. Build Tool - Maven

   * [Download Maven](https://maven.apache.org/download.cgi)

4. Database - H2 Database

   * [Download H2 Database](http://www.h2database.com/html/download.html)

5. Configuring tomcat with Eclipse - [Click Here](https://javatutorial.net/run-tomcat-from-eclipse)

6. Installation of maven in eclipse - [Click Here](https://stackoverflow.com/questions/8620127/maven-in-eclipse-step-by-step-installation)

7. Clone the repository and import it to eclipse

8. Run H2 Database.

9. Configure your databse configuration in **application-context.xml**

   * Database properties:


        <!-- database properties DataSource -->

            <bean id="dataSource"
              class="org.springframework.jdbc.datasource.DriverManagerDataSource">
              <property name="driverClassName" value=YOUR DB DRIVER CLASS NAME" />
              <property name="url" value="YOUR DB URL" />
              <property name="username" value="YOUR DB USERNAME" />
              <property name="password" value="YOUR DB PASSWORD" />
            </bean>

      * Database Dialect:

            <prop key="hibernate.dialect">YOUR DB DIALECT</prop>

10. Run the server.

### ScreenShots:

* Home Page:

![Alt text](https://github.com/a0309nkita/CovidStockTracker/blob/master/src/main/webapp/WEB-INF/resource/images/homepage.png "Home Page")

* Product List Page:

![Alt text](https://github.com/a0309nkita/CovidStockTracker/blob/master/src/main/webapp/WEB-INF/resource/images/ProductList.png "Product List Page")
