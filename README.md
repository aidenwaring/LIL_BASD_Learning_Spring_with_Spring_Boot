# Learning Spring Docker Demo

Demo application for Learning Spring with Spring Boot with remote Docker database

## Database

`docker run --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=dev -d -p 5432:5432 postgres`

`psql -U postgres -d dev -h localhost -f schema.sql`

`psql -U postgres -d dev -h localhost -f data.sql`