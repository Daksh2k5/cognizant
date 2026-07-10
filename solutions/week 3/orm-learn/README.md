# Hands-on 4: Difference between JPA, Hibernate and Spring Data JPA

## Java Persistence API (JPA)
- JPA is a Java Specification (JSR 338) for accessing, persisting, and managing data between Java objects and a relational database.
- It provides only the API (interfaces and annotations like `@Entity`, `@Id`) but no concrete implementation.

## Hibernate
- Hibernate is a popular, open-source Object-Relational Mapping (ORM) framework.
- It is a **concrete implementation** of the JPA specification.
- You can use Hibernate independently of JPA, but using the JPA interfaces ensures standard compliance and ease of switching ORM providers.

## Spring Data JPA
- Spring Data JPA is an abstraction layer built on top of JPA providers like Hibernate.
- It is NOT an implementation of JPA. Instead, it significantly reduces boilerplate code.
- By providing interfaces like `JpaRepository`, Spring Data JPA allows developers to perform CRUD operations without writing explicit query implementation (e.g., automatically generating SQL from method names like `findByCode()`).
- It delegates the actual database interaction to the underlying JPA provider (typically Hibernate).

### Summary:
- **JPA:** The rules/specifications (Interface).
- **Hibernate:** The tool following the rules to interact with DB (Implementation).
- **Spring Data JPA:** A helper framework that makes using Hibernate/JPA much easier by removing boilerplate code.
