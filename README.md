# Online-Banking-Application

This is an online banking application which provides all the basic banking functionalities. 

* The platform used is NetBeans and the language used is java.
    NetBeans is an integrated development environment (IDE) for Java. NetBeans allows applications to be developed from a set of modular software components called modules. NetBeans runs on Microsoft Windows, macOS, Linux and Solaris. 

* We have used JAVA DB as our database for the website. Our database uses SQL language for executing the queries.
* The Netbeans Server used is GlassFish Server 4.1.1
* Our User Interface is made using HTML , CSS and JSP. 



### Proposed System

In this project we will implement a Distributed Banking System that consists of a server and some Automated Teller Machine (ATM) clients. The server manages all users’ account information. A customer can invoke the following operations at an ATM.

* Deposit: this operation increases the balance of user account acnt by amt, and returns nothing
*	Withdraw: this operation decreases the balance of user account acnt by amt, and returns nothing
*	Check_balance: this operation returns the balance of user account account
*	Create New User (Open new account):  this operation returns a boolean value if an account is created or not, the account details are displayed if an account is created, the database is updated.
*	Delete Existing User (close account) :  this operation returns a boolean value if an account is created or not, the database is updated .
*	Transfer Amt: this operation decreases the balance of user account acnt by amt, increases the balance of user account tacnt by amt, and returns nothing

Modules


1. Client
1.1 ATM
  *  Open Account
  *  Close Account
  *  Deposit
  *  Withdraw
  *  Transfer
  *  Balance


2. Database
  * Transaction
  * Updation

3. Exception
  * Insufficient balance
  * Invalid Login
  * Invalid Account



### Implementation

* Open the project folder directly from the Netbeans Application. 
* Then you will have to create your own databse (JAVA DB) and in the code (JAVA file) where I have specified the database connection, you will have to change and specify the database connection accordingly. 
* Use the Netbeans Server as GlassFish Server 4.1.1
* Once the database is connected to the program then the application should be up and running. 


### Screenshots of the Application

</br>

#### Home Page
<img width="427" alt="Screenshot 2019-03-28 at 3 28 49 PM" src="https://user-images.githubusercontent.com/45623734/55148506-57a20880-516e-11e9-85a4-30f7674c5a9e.png">

#### Opening an account

<img width="418" alt="Screenshot 2019-03-28 at 3 23 49 PM" src="https://user-images.githubusercontent.com/45623734/55148247-d9456680-516d-11e9-99a0-c97d8cde7e5e.png">

<img width="418" alt="Screenshot 2019-03-28 at 3 24 01 PM" src="https://user-images.githubusercontent.com/45623734/55148253-d9ddfd00-516d-11e9-8723-717470deafb5.png">

#### Depositing money to the account

<img width="465" alt="Screenshot 2019-03-28 at 3 24 20 PM" src="https://user-images.githubusercontent.com/45623734/55148255-da769380-516d-11e9-8a0a-20036bb05113.png">

#### Backend

<img width="465" alt="Screenshot 2019-03-28 at 3 24 30 PM" src="https://user-images.githubusercontent.com/45623734/55148256-dba7c080-516d-11e9-8290-8c2f91c582ac.png">

#### Transfer Amount from one account to another

<img width="427" alt="Screenshot 2019-03-28 at 3 25 43 PM" src="https://user-images.githubusercontent.com/45623734/55148258-dc405700-516d-11e9-8c34-30fba43c51e7.png">

<img width="427" alt="Screenshot 2019-03-28 at 3 25 52 PM" src="https://user-images.githubusercontent.com/45623734/55148260-dc405700-516d-11e9-95b6-b2ca6ba99a20.png">

