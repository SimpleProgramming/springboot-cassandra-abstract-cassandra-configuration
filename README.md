# Spring Boot & Cassandra with AbstractCassandraConfiguration
A simple example explaining how to use springboot and cassandra using abstract cassandra configuration

In this example let us see how to use Abstract Cassandra Configuration to config cassandra connection in spring boot application

    Abstract Cassandra Configuration class is the base class for Spring Data Cassandra configuration 
    using JavaConfig
    
# Prerequisites

    Cassandra installed in your machine

# Cassandra Scripts:

Create Key Space

    CREATE KEYSPACE simple_programming WITH replication = {'class': 'SimpleStrategy', 
    'replication_factor': '1'};

Create SimpleType

    CREATE TYPE simple_programming.simple_type (name text, type text);

Create SimpleTable

    CREATE TABLE simple_programming.simple_table (id text, name text, created_time timestamp, 
    simple_type frozen<simple_type>, PRIMARY KEY (id, name));
        
