Subject:

[DISCUSS] Proposal for a New Java Library in Apache Incubator

Dear Apache Incubator Community,

I would like to start a discussion about an idea for a new Java library, designed to simplify the development and setup
of custom communication protocols, particularly for networked environments and device interactions (e.g., serial ports,
proprietary network protocols).

Network protocol build & setup library for custom, non-standard, proprietary, domain- and vendor-specific protocol
implementation.

# Background : The Need for Simplified Protocol Development

In many networked environments, developers frequently encounter situations where communication protocols between devices
and servers are not based on widely adopted standards like HTTP or FTP. Instead, these interactions rely on
custom, non-standard, proprietary, domain- and vendor-specific protocols that are unique to particular hardware or
(network) systems.

Such protocols often require developers to implement custom solutions from scratch, following detailed technical
documentation or specifications provided by the vendor. This scenario is particularly common in domains like industrial
automation, IoT (Internet of Things), and telecommunications, where devices or network services are designed with
bespoke communication protocols tailored to specific use cases.

While these custom protocols enable specialized functionality, they can also introduce challenges:

* Repeated effort in implementing similar protocol features across projects.
* Lack of interoperability with standard tools and libraries.
* Increased maintenance overhead due to non-standardized behavior.

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
