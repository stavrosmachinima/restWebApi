# Title: Administer matches and their odds

## Introduction: This is a REST Web API application developed in Java Spring Boot, whose goal is to help the user to CRUD all of the matches and their odds they may have in a betting game.

### System Overview: CRUD Match and MatchOdds by use of HTTP Verbs.

###Design Considerations:

    - Assumptions and Dependencies: Duplication of same Match or MatchOdds with different id. Foreign Key of Match and MatchOdds. JPA, Web, PostgreSQL
    - Goals and Guidelines: Functional Web service for managing Match and MatchOdds. Have to use RestAPI and postgreSQL for a database.
    - Development Methods: Java Spring Boot.
    
### Architectural Strategies: RestAPI Web application.
System Architecture: The RestController used one Service and its implementation for managing each Entity. Each entity has its own Repository accessed with JPA for db access.
Policies and Tactics: I used an interface and then implemented it (DAO) for each class to access and CRUD the mentioned table. Could have been without it.
Detailed System Design: Each service's implementation does all the bullwork for using each repository and checking if any value given is null when updating.

Glossary:
	CRUD: Create, read, update and delete
	DAO: Data Access Object
