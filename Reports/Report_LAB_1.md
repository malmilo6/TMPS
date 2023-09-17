# SOLID Principles in Java Project

## Table of Contents

- [Introduction](#introduction)
- [SOLID Principles](#solid-principles)
  - [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
  - [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
  - [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
  - [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
  - [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)
- [Project Structure](#project-structure)
- [Code Explanation](#code-explanation)
- [Conclusion](#conclusion)

---

## Introduction

This report outlines how SOLID principles are applied in a simple Java project that manages publications like books and magazines. The project is structured into different packages, including `client`, `domain`, `factory`, and `models`.

---

## SOLID Principles

### Single Responsibility Principle (SRP)

The project is divided into distinct packages each having a single responsibility:

- `models`: Contains the model classes like `Publication`, `Book`, `Magazine`.
- `domain`: Is about the business logic for handling publications (`PublicationService`, `BookServiceImpl`, `MagazineServiceImpl`).
- `factory`: Responsible for creating objects (`PublicationFactory`).
- `client`: Includes the client code that uses all the above packages (`Main`).

---

### Open/Closed Principle (OCP)

The `PublicationService` interface is open for extension but closed for modification. Different implementations like `BookServiceImpl` and `MagazineServiceImpl` extend it without altering the interface itself.

---

### Liskov Substitution Principle (LSP)

The `BookServiceImpl` and `MagazineServiceImpl` classes are interchangeable with the `PublicationService` interface. The client code that depends on the `PublicationService` interface is unaware of the concrete implementation, be it books or magazines.

---

### Interface Segregation Principle (ISP)

The `PublicationService` interface is simple and only contains methods that are essential for a publication service. There is no unnecessary bloat or methods that the implementing classes don't need.

---

### Dependency Inversion Principle (DIP)

The `Main` class depends on the `PublicationService` interface, not on its implementations (`BookServiceImpl`, `MagazineServiceImpl`). This allows for easy changes and extension of the application without modifying the client code.

---

### Conclusion

The project successfully adheres to the SOLID principles, making it maintainable, extendable, and modular.
