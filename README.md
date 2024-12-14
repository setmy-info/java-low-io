# apache-low-io

Network protocol build framework.

## Idea

Library that helps to build in client-server protocol as graph for execution.
Graph contains steps (read, write) as nodes and flow as graph edges.

Like Camunda and BPMN - draw graph with UI, save it to BPMN (XML) file and write code behind steps. Camunda
handles/manages workflow (steps) execution (workflow instance) by graph.

Ideally write and register protocol in configuration form (JSON, XML, ...). Library that loads that and helps to start
serve and make client code that interacts by protocol by protocol with server. Integrator sends specific data and gets
specific data, without thinking lower level protocols implementation.

### MVP

MVP as project example and demo.

* Can be:
    * unfinished
    * not well performing
    * not thread safe.
* First release TCP/IP only, with client and server.
* Binary data send-receive.
* Event handlers.
* Protocol builders.
* Multi level:
    * Lower - bytes send and received.
    * Higher - byte sets combined and build as specific data types: BigInteger, DateTime, etc
* ...
