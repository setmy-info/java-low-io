# apache-low-io

Network protocol build framework.

## Idea

A library that helps build client-server protocols as an execution graph. The graph contains steps (read, write) as
nodes and flow as graph edges.

Similar to Camunda and BPMN: draw the graph using a UI, save it as a BPMN (XML) file, and write the code for the steps.
Camunda manages workflow execution (workflow instances) based on the graph.

The library enables defining the protocol and starting to use it at a higher level, abstracting away the
lower-level mechanics and focusing on business logic and data flows.

Ideally, protocols can be written and registered in a configuration format (JSON, XML, etc.). The library loads the
configuration, starts the server, and provides client code that interacts with the server using the protocol.
Integrators send specific data and receive specific data without worrying about low-level protocol implementation (even
step code).

### MVP

An MVP as a project example and demo.

* Features:
    * Can be:
        * unfinished
        * not high-performing
        * not thread-safe.
    * Initial release: TCP/IP only, with client and server.
    * Binary data transmission (send/receive).
    * Event handlers.
    * Protocol builders.
    * Multi-level:
        * Lower level - sending and receiving bytes.
        * Higher level - combining byte sets into specific data types: BigInteger, DateTime, etc.
    * ...
