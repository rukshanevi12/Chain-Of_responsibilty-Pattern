# Chain of Responsibility Pattern Example in Java

This repository contains two Java packages demonstrating the implementation of the Chain of Responsibility pattern.

## package1

This package demonstrates the Chain of Responsibility pattern using handler classes and a client object.

### Classes

- `Handler`: Abstract base class defining a handler in the chain.
- `Handler1`, `Handler2`, `Handler3`: Concrete handlers implementing specific handling logic.
- `Client`: Class representing a client with an integer field.
- `Test`: Main class demonstrating the usage of handlers and the chain of responsibility pattern.

## package2

This package demonstrates the Chain of Responsibility pattern using filter classes and an HTTP request object.

### Classes

- `Request`: Class representing an HTTP request with parameters and URL.
- `Filter`: Abstract base class defining a filter in the chain.
- `Filter1`, `Filter2`, `Filter3`: Concrete filters implementing specific filtering logic.
- `Test`: Main class demonstrating the usage of filters and the chain of responsibility pattern.

## Chain of Responsibility Pattern

The Chain of Responsibility pattern allows multiple objects to handle a request without the sender needing to know which object will handle the request. It promotes loose coupling and flexibility in processing requests.

## Usage

To use the provided code samples, simply run the `Test` classes in each package. You can customize the behavior by adjusting the values of client properties or filter conditions.

## Development Environment

This project was developed using the NetBeans IDE.

## Getting Started

To get started with this project, clone the repository to your local machine:

```bash
git clone https://github.com/rukshanevi12/Chain-Of_responsibilty-Pattern.git)https://github.com/rukshanevi12/Chain-Of_responsibilty-Pattern.git
cd project-directory
