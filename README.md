# low-level-design
Learn Low Level Design (LLD) Practice

## Patterns

- `patterns.strategy` - interchangeable payment strategies
- `patterns.decorator` - composable beverage decorators
- `patterns.observer` - order status notifications

## Run

Start the Spring Boot application:

```bash
./mvnw spring-boot:run
```

Or on systems without Maven Wrapper:

```bash
mvn spring-boot:run
```

Open:

- Strategy: `http://localhost:8080/demo/strategy`
- Decorator: `http://localhost:8080/demo/decorator`
- Observer: `http://localhost:8080/demo/observer`
