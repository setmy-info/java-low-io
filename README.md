# apache-low-io

Network protocol build framework.

## Idea

A library that helps build client-server protocols as an execution graph. The graph (protocol) contains steps (read,
write) as nodes and flow as graph edges.

Library API provides a way to define the protocol, read and write steps with configuration and variables to be used and
read or written, driven by flow rules. And then run the protocol.

Prepared protocol definitions can be in separate library(ies).

## Glossary

* Protocol - protocol definition
* (Protocol) Instance - a running protocol
* Steps
    * Read
    * Write
    * ???
* Handlers
    * Pre-step handlers
    * Post-step handlers
* (Flow) Rules
* Configuration
    * Step configuration
    * Protocol configuration
* Variables
    * Step variables
    * Protocol variables
* Data transformation

### MVP

A demo MVP can be as:

* Java
* TCP only
* Not fully implemented
* Not high-performing
* Not thread-safe (single thread demo)
* Client and server
* Binary send and receive
* No compression
* No encryption
* No authentication
