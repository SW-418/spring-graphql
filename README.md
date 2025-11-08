# spring-graphql
Spring service testing out GraphQL using [Netflix DGS](https://netflix.github.io/dgs/).

Leveraging a few different mechanisms for data retrieval including:
- Users - In memory
- Artists - Python REST API running in a container
- Record Labels - Postgres DB running in a container

### Running Locally
1. `docker compose up` - Spins up Spring Boot GraphQL service, Python API service + postgres db
2. Make requests to `http://localhost:8080/graphql`
