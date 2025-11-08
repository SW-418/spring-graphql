# spring-graphql
Spring service testing out GraphQL using [Netflix DGS](https://netflix.github.io/dgs/).

Leveraging a few different mechanisms for data retrieval including:
- Users - In memory
- Artists - Python REST API
- Albums - Postgres DB

### Running Locally
1. `docker compose up` - Spins up Python API service + postgres db
2. `./gradlew bootRun` - Spins up java graphql service
3. Make requests to `http://localhost:8080/graphql`
