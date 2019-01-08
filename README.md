# coinServer

Coin Server is backend application designed to act as a server for coin universe.
This backend application is built on the java Spring Boot version 2.0 and runs on http://localhost:8080 by default.

The purpose of this application is to track user access to the coin universe site by getting their location, ip address, browser, device,
date logged in and store in a MySQL database called footprints in a table named footprint. 

the application is also capable of returning all the enteries in this tables in json formatted string.

The server can be started by running 

1. ``./gradelw build``
2. ``cd   build/libs/``
3. `java -jar footprint-0.1.0.jar`
