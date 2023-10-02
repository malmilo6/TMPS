# Structural design patterns

# Introduction 
This report provides a detailed overview of the BookStore project, which was designed following SOLID principles and incorporates design patterns such as Factory Method, Singleton, Object Pooling, and Prototype.


## Design Patterns in BookStore Project

### 1. Singleton Design Pattern
The Singleton pattern ensures a class has only one instance throughout the application and provides a global point of access to this instance. Used when you want to prevent instantiating more than one instance of a class. Particularly useful for managing resources or configurations
- **Implemented In**: `ConfigurationManager`
- **Usability**: 
  - Ensures only one instance of configuration management.
  - Provides a global point to access configurations, ideal for universal settings or resource management.

 
### 2. Factory Method Design Pattern
The Factory Method is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. Instead of calling a constructor directly, a factory method is used to create the object.
- **Implemented In**: `BookStoreFactory` and its subclasses.
- **Usability**: 
  - Decouples the creation logic, making the system more extensible.
  - Allows introducing new types of books without altering existing code, adhering to the Open/Closed principle.


### 3. Object Pooling
Object Pooling is a design pattern where a set of initialized objects is kept ready to use rather than allocating and destroying them on demand. A pool helps to manage the object lifecycle: objects are "borrowed" from the pool, used, and then "returned" to the pool for reuse.
- **Usability**: 
  - Enhances performance by reusing objects instead of frequent creation and destruction.
  - Ideal for resources that are expensive to initialize.

### 4. Prototype 
The Prototype design pattern is a creational design pattern that deals with object creation by copying or "cloning" an existing object. This pattern is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects. The pattern is particularly useful when the construction of a new instance is more costly than copying an existing one or when objects have numerous shared configurations and only a few differences.
- **Usability**:
  - Supports cloning objects, useful when instantiation is more costly than copying.
  - Facilitates dynamic object creation based on existing prototypes.

By integrating these patterns, the project demonstrates adherence to SOLID principles.

## Conclusion
The BookStore project serves as a testament to the significance of design patterns and SOLID principles in software design. By incorporating patterns like Singleton, Factory Method, Object Pooling, and Prototype, the project achieves modularity, scalability, and a higher degree of maintainability. Such design approaches not only enhance code quality but also ensure that the software is adaptable to future requirements and changes. In essence, adherence to well-established patterns and principles is pivotal for crafting robust and flexible software solutions in an ever-evolving tech landscape.
