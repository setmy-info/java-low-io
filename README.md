# java-low-io

Network protocol build & setup library for custom, non-standard, proprietary, domain- and vendor-specific protocol
implementation.

## Idea

A library that helps to build client-server protocols as an execution graph. The graph (protocol) contains steps (read,
write) as nodes and flow as graph edges.

Library API provides a way to define the protocol, read and write steps with their configuration and variables,
driven by execution flow/path rules. And start the protocol.

Prepared (defined) protocol can be in separate library(ies), depending on current library.

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
        * Rules step handler (possible solution for flow rules)
* (Flow) Rules
* Configuration
    * Step configuration
    * Protocol configuration
* Variables
    * Step variables
    * Protocol variables
* Data transformation

### MVP

Simplest demo MVP can be as:

* Java (17 ?)
* TCP only
* Not fully implemented
* Not high-performing
* Not thread-safe (single thread demo)
* Client and server
* Binary send and receive
* No compression (probably not part of the low level library)
* No encryption (probably not part of the low level library)
* No authentication (probably not part of the low level library)
