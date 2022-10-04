# JDBC Core Components #
1. JDBC Drivers
    - collection of classes that implements interfaces in JDBC API for 
        1. Opening Database connections
        2. Interacting with database
        3. Closing databse connections
2. Connections
    - Before any JDBC operation, we have to establish a database connection.
    - To do so, we call "getConnection()" method of DriverManager class.
```YAML
Connection connect = DriverManager.getConnection(url, user, password)
```
3. Statements
    - Statements are used to execute SQL or PL/SQL queries against the database. We need a statement for each query.
    - Type of statements defined by JDBC:
        1. Statement
        2. CallableStatement
        3. PreparedStatement
4. ResultSets
    - A query returns data in form of ResultSet.

