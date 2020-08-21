# Java Program : Distance calculation

Java-based program demonstrates usage of JSONObject and JSONArray class usage to process JSON-based customer GPS coordinate .

## Project goals:	
1. Imports customer's GPS coordinate list (text file).
2. Query the GPS longitude and latitude.
3. Convert to GPS longitude and latitude to radians.
4. Calculate distance from office to customer's GPS coordinate.
5. Filter the customer which is within 100km range.
6. Export Customer (within 100km) in text file filterSort.
7. Not implemented - Sorting of invitation list in ascending order.
8. Modularize the program.

## Getting Started

1. Launch Eclipse
2. Import the java package /source code
3. Add the build path of downloaded json-simple-1.1.1.jar by Project name->IntercomTakeHomeTest->Build Path->Configure Build Path->Libraries->Add External Jars->Apply and Close
4. Run the java package by Run As -> Java Application


### Prerequisites

Download Java version "1.8.0_241" from https://www.oracle.com/java/technologies/javase/8u241-relnotes.html
Download Eclipse version 2020-03 (4.15.0) from https://www.eclipse.org/downloads/packages/release/2020-03
Download json-simple-1.1.1.jar  from https://repo1.maven.org/maven2/com/googlecode/json-simple/json-simple/1.1.1/
Download the IntercomTakeHomeTest java package from this link https://github.com/julietaGit/IntercomTakeHomeTest/tree/master/src/customer_invitation
Download the customers.txt from this link https://github.com/julietaGit/IntercomTakeHomeTest/blob/master/external_file/customers.txt The file was modified to have '[' from start of the file and ']' at the end of the file to comply to JSON format.

## Running the tests

A basic functional testing was conducted during the project development.

Not implemented - JUnit test was not implemented on this project.

## Version

Release 1.0

## Author

* **Julieta Rubis** - *Initial work* 
