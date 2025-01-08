Subject:

[DISCUSS] Proposal for a New Java Library in Apache Incubator

Dear Apache Incubator Community,

I hope this message finds you well. I would like to start a discussion regarding an idea for a new Java library, which
aims to simplify programmatically build/setup (network) protocol.

Network protocol build & setup library for custom, non-standard, proprietary, domain- and vendor-specific protocol
implementation.

### Background

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

### Proposed Solution

The proposed library simplifies the development of custom client-server communication protocols by representing them as
execution graphs. In this model:

* Nodes in the graph represent protocol steps, such as reading or writing data.
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

### Feedback Request

I would greatly appreciate your feedback:

- Does this project align with ASF's ecosystem and goals?
- Would anyone be interested in collaborating
- Would anyone be interested in mentoring?

Thank you for your time, and I look forward to your thoughts!

Best regards,  
Imre Tabur
