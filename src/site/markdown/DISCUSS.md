# Email

[general@incubator.apache.org](mailto:general@incubator.apache.org)

# Web interface

[General mail list](https://lists.apache.org/list.html?general@incubator.apache.org)

# Options for subject

| **Tag**        | **Explanation**                                                                                                                    |
|----------------|------------------------------------------------------------------------------------------------------------------------------------|
| **[ANNOUNCE]** | Used for official announcements, such as new releases, major updates, or important organizational news.                            |
| **[CANCEL]**   | Used to inform about the cancellation of an event, vote, or planned discussion.                                                    |
| **[VOTE]**     | Used when calling for a vote on a decision or proposal.                                                                            |
| **[RESULT]**   | Used to share the outcome of a vote, discussion, or decision-making process.                                                       |
| **[DISCUSS]**  | Used to initiate an open discussion on a topic, seeking input from the community.                                                  |
| **[NOTICE]**   | Used for important notifications, such as policy changes, upcoming deadlines, or required actions.                                 |
| **[QUESTION]** | Used when asking the community for clarification or seeking answers on a specific topic.                                           |
| **[LEGAL]**    | Used for legal-related discussions, such as licensing issues, trademarks, or compliance.                                           |
| **[PROPOSAL]** | Used when formally presenting a new idea or project for consideration.                                                             |
| **[REQUEST]**  | Used when asking for resources, support, or contributions from the community.                                                      |
| **[HELP]**     | Used when seeking technical assistance or guidance on an issue.                                                                    |
| **[RFC]**      | Request for Comments - Used when seeking early-stage feedback on an idea, draft, or specification before making a formal proposal. |
| **[FYI]**      | Used when sharing information that does not require discussion or immediate action.                                                |

Subject:

# [DISCUSS] Proposal to Start Development of a New Java Library in Apache Incubator

Dear Apache Incubator Community,

I would like to start a discussion about an idea to start the development of a new Java library, designed to simplify  
the implementation and setup of custom communication protocols, particularly for networked environments and device  
interactions (e.g., serial ports, proprietary network protocols).

A library for building and setting up I/O (read/write, send/receive) protocols. Custom, non-standard,
proprietary, domain-, and vendor-specific protocol implementations, while remaining loosely coupled from the data
structures being transferred.

## Background: Why is this Needed?

In many projects, developers must work with proprietary or vendor-specific communication I/O protocols that are not
based on well-known and widely supported implementations like HTTP (REST, GraphQL, etc.) for which libraries already
exist. And the protocol needs to be implemented by developers themselves.

### Use cases

* Integrating with (legacy) serial port devices in industrial systems.
* Implementing vendor-specific communication for IoT gateways or edge devices.
* Interacting with specialized network or hardware devices in telecommunications or data centers.
* Developing custom communication protocols for specific use cases.

Such protocols often require developers to implement custom solutions from scratch, following detailed technical  
documentation or specifications provided by the vendor.

This situation is particularly common in domains like industrial automation, IoT, and telecommunications, where  
devices or network services operate with specific communication protocols created for specific use cases.

The problem is that doing it yourself is labor-intensive, requires precision, and is tedious work. The larger the
specification, the greater the struggle with implementation. It is also quite difficult to recall and follow what was
done later on. Additionally, there is little reusable code, and identifying parts of the code that can be reused is also
difficult.

This project aims to address these issues by providing a reusable library that simplifies working with such
vendor-specific protocols, reducing development time and ensuring consistency across implementations.

# Proposed Solution: A Graph-Based Approach to Protocols

The proposed library simplifies the development of custom client-server (sender-receiver and vice versa) communication
protocols by representing them as execution graphs.

In this model:

* Nodes in the graph represent protocol steps - reading or writing data (receive or send).
* Edges define the flow of execution between steps, governed by configurable rules and conditions.

The library provides functionality to build and execute graphs, handle basic I/O operations (and potentially more),
construct data structures for transfer, bind structure definitions to steps (or with the whole defined graph), handle
events, and manage a callback system.

**I assume that a graph, even when implemented in (fluent) code, is more readable than a fully custom implementation.**

By abstracting protocol logic into an execution graph, the library minimizes the complexity of handling vendor-specific
communication requirements and promotes easier maintenance.

The MVP implementation of the library will focus exclusively on Java to validate the concept and gather community
feedback before considering broader adoption or porting to other languages like C++ or Python.

# Summary

To summarize, this project aims to simplify the implementation of non-standard protocols by providing a graph-based
framework that can handle basic I/O operations on its own through a defined graph. Most of the basic I/O functions are
handled within the library, compared to a custom-made solution where everything is cross-referenced and tightly coupled.

The initial focus will be on Java, with the potential for future expansion based on community input.

The initial base structure, skeleton, and proof of concept (PoC) will be independently developed by me and my team as a
preliminary effort in our own repository, serving as an example for further development and eventual transition into the
Apache Incubator.

# Feedback Request

The idea is still quite abstract, but I would greatly appreciate your feedback:

- Does this project align with ASF's ecosystem and goals?
- Would anyone be interested in collaborating, contributing or providing feedback during development?
- Would anyone be interested in mentoring?
- Are there existing projects or initiatives that we should consider or align with?

If this aligns with your interests or expertise, please share your thoughts, questions, or suggestions. Your feedback is
invaluable to shaping the direction of this project!

Thank you for your time, and I look forward to your thoughts!

Best regards,  
Imre Tabur
