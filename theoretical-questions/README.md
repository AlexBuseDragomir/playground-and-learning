Theoretical questions and answers that can be useful when preparing for technical interviews.

* **Core Java**
    * String mutability (`String`, `StringBuilder`, `StringBuffer`)
    * Object equality (`==` vs `equals()`)
    * Exception handling (Checked vs Unchecked)
    * Collections framework (`ArrayList`, `LinkedList`, `HashSet`)
    * Abstraction (Interfaces vs Abstract Classes)
    * Polymorphism (Method Overloading vs Overriding)
    * Java keywords (`final`, `finally`, `finalize`)
    * Logging frameworks vs standard output
    * Resource management (`try-with-resources`)
* **Testing**
    * Code coverage metrics and limitations
    * Mocking frameworks and limitations (Mockito)
    * Mocking void methods
    * Capturing arguments (`ArgumentCaptor`)
    * Mocking strategies (`@Mock` vs `@Spy`)
* **OOP (Object-Oriented Programming)**
    * Encapsulation
    * Composition vs Inheritance
    * Preventing inheritance and overriding
    * Access modifiers (Package-private vs Protected)
    * Method hiding vs overriding for static methods
* **REST**
    * API idempotency
    * HTTP methods (`PUT` vs `PATCH`, Safe methods)
    * HTTP status codes (2xx, 4xx)
    * CORS (Cross-Origin Resource Sharing)
    * Handling large datasets (Pagination, filtering, sorting)
* **Microservices**
    * Monolith vs Microservices architecture trade-offs
    * Inter-service communication (Synchronous vs Asynchronous)
    * API Gateways
    * Distributed tracing and troubleshooting
    * System resilience (Circuit Breaker pattern)
    * Service Discovery
* **Multithreading**
    * Thread tasks (`Runnable` vs `Callable`)
    * Thread pools (`ExecutorService`)
    * Deadlocks and prevention
    * Thread control (`wait()` vs `sleep()`)
    * Lock-free thread safety (Atomic variables)
    * Thread lifecycle states
    * Synchronization (Methods vs Blocks)
* **Spring Core**
    * IoC (Inversion of Control) and Dependency Injection
    * Injection types (Constructor, Setter, Field)
    * Dependency resolution (`@Autowired`, `@Qualifier`, `@Primary`)
    * Bean scopes
    * Component scanning and Stereotype annotations
    * Bean lifecycle callbacks (`@PostConstruct`, `@PreDestroy`)
* **Spring MVC**
    * Controller types (`@Controller` vs `@RestController`)
    * Request mapping and data extraction (`@PathVariable`, `@RequestParam`, `@RequestBody`)
    * Global exception handling (`@ControllerAdvice`)
    * The `Model` interface
    * HTTP response generation (`ResponseEntity`)
* **Spring AOP (Aspect-Oriented Programming)**
    * AOP core concepts and cross-cutting concerns
    * Terminology (JoinPoint vs Pointcut)
    * Advice types (`@Before`, `@After`, `@Around`, etc.)
    * AspectJ annotations
* **CI/CD**
    * Pipeline automation phases
    * Build tools and automated testing integration
    * Containerization in pipelines (Docker)
    * Static code analysis (SonarQube)
    * CI vs CD workflows
    * Artifact repositories
    * Pipeline as Code
* **Java 8, 11, 17**
    * Major language features per release (Lambdas, Records, Text Blocks, etc.)
    * Functional Interfaces
    * Method References
    * Stream API (Intermediate vs Terminal operations, Collectors)
* **SQL**
    * Filtering data (`WHERE` vs `HAVING`)
    * Database Indexes
    * Relational keys (Primary vs Foreign)
    * Database transactions and ACID properties
    * Aggregate functions
    * Table joins (`INNER` vs `LEFT`)
    * Data grouping (`GROUP BY`)
    * N+1 query problem
    * Data types (`CHAR` vs `VARCHAR`)
    * Query operators (`DISTINCT`, `IN`, `LIKE`)
* **Build Automation Tools**
    * Dependency management (Direct vs Transitive, Repositories)
    * Build lifecycles and clean builds
    * Packaging artifacts
    * Build configuration files
* **Hibernate & Spring Data JPA**
    * ORM concepts (JPA vs Hibernate)
    * Entity mapping and primary keys (`@Entity`, `@Id`)
    * Entity relationships (`@OneToMany`, `@ManyToOne`)
    * `EntityManager` operations
    * Query derivation and custom JPQL/SQL (`@Query`)
    * Fetch strategies (Lazy vs Eager loading)
    * First-Level Cache
    * Transaction management and rollback rules (`@Transactional`)
    * Entity lifecycle states and cascading
* **Docker**
    * Containers vs Virtual Machines
    * Images vs Containers
    * Image creation (`Dockerfile`)
    * Registries (Docker Hub)
    * Data persistence (Volumes)
    * Multi-container management (Docker Compose)
    * Networking and port mapping
    * CLI commands
    * Execution instructions (`CMD` vs `ENTRYPOINT`)
