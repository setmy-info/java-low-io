Subject:

# [DISCUSS] Proposal to Start Development of a New Java Library in Apache Incubator

Dear Apache Incubator Community,

I would like to start a discussion about an idea to start the development of a new Java library, designed to simplify  
the implementation and setup of custom communication protocols, particularly for networked environments and device  
interactions (e.g., serial ports, proprietary network protocols).

A library for building and setting up I/O (read/write, send/receive) protocols, tailored for custom, non-standard,  
proprietary, domain-, and vendor-specific protocol implementations while being loosely coupled from data structures to
transfer.

## Background: Why is this Needed?

In many projects, developers must work with proprietary or vendor-specific communication I/O protocols that are not  
based on well-known and widely supported implementations like HTTP (REST, GraphQL, etc.). These specific protocols are  
often tightly coupled with the data structures they transfer.

### Examples of such use cases:

* Integrating with legacy serial port devices in industrial systems.
* Implementing vendor-specific communication for IoT gateways or edge devices.
* Interacting with specialized network or hardware devices in telecommunications or data centers.
* Developing custom communication protocols for specific use cases.

Such protocols often require developers to implement custom solutions from scratch, following detailed technical  
documentation or specifications provided by the vendor. These specifications typically define not only the protocol  
behavior but also the data structures being transferred.

This situation is particularly common in domains such as industrial automation, IoT, and telecommunications, where  
devices or network services operate with bespoke communication protocols tailored to specific use cases.

# ----------------------

TODO : milles probleem täpsemalt seisneb?
TODO : protokolli on suht keerukas implementeerida. Teek oleks selleks et lihtsustada protokollide implementeerimists.

See rida ära jätta ja lihtsama lausega: While these custom protocols enable specialized functionality, they can also
introduce challenges:

* Mahukas ja keerukas protokolli dokumentatsioon, mida vaja implementeerida programmselt.
* Keerukas jägligida ja kontrollida protokolli implementatsiooni korrektsust.
* sama funktsionaalsuse taas implementeerikimine uute protokollide implementeerimisel - kogu IO ja andmestrutktuur
  uuesti luua ja just selle ülesande (protokolli) jaoks
* Tihti IO protokollide implementatsioonid on tugevalt seotud protokolli andmestruktuuridega ning kindla ülesande
  saavutamisega ja pole võimalik taas kasutada mõne uue protokolli loomiseks.
* Repeated effort in implementing similar protocol features across projects.
* Limited reuse of protocol implementations across projects or teams.
* Complex logic for handling protocol steps, data transformations, and error handling.
* Difficulty in maintaining and updating protocol implementations as requirements evolve.
* Lack of standardized tools or libraries for working with vendor-specific protocols.
* Difficult to put dogether programmatically

This project aims to address these issues by providing a modular, reusable library that simplifies working with such
vendor-specific protocols, reducing development time and ensuring consistency across implementations.

# Proposed Solution: A Graph-Based Approach to Protocols

The proposed library simplifies the development of custom client-server communication protocols by representing them as
execution graphs. In this model:

* Nodes in the graph represent protocol steps, such as reading or writing data (receive and send).
* Edges define the flow of execution between steps, governed by configurable rules and conditions.

The library's API enables developers to:

* Define Protocols: Create reusable protocol definitions using modular steps with configurations and variables.
* Configure Execution Flows: Specify the logic and transitions between steps, allowing complex protocols to be expressed
  in an intuitive manner.
* Execute Protocols: Start and manage protocol flows seamlessly.

Additionally, predefined protocols can be packaged as separate libraries, making them reusable and composable for
specific use cases. This modularity reduces repetitive implementation effort while ensuring consistency and reliability
across projects.

By abstracting protocol logic into an execution graph, the library minimizes the complexity of handling vendor-specific
communication requirements and promotes easier maintenance and scalability.

The MVP will focus exclusively on the Java implementation to validate the concept and gather community feedback before
considering broader adoption or porting to other languages like C++ or Python.

# Summary

To summarize, this project aims to simplify the implementation of non-standard protocols by providing a graph-based
framework that enables reusable, modular, and maintainable solutions. The focus will initially be on Java, with
potential for future expansion based on community input.

Initial base structure, skeleton and PoC can be done by me and my team.

# ----------------------

# Feedback Request

I would greatly appreciate your feedback:

- Does this project align with ASF's ecosystem and goals?
- Would anyone be interested in collaborating?
- Would anyone be interested in mentoring?

If this aligns with your interests or expertise, please share your thoughts, questions, or suggestions. Your feedback is
invaluable to shaping the direction of this project!

Thank you for your time, and I look forward to your thoughts!

Best regards,  
Imre Tabur
