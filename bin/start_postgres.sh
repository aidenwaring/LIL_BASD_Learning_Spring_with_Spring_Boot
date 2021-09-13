#!/usr/bin/env bash

#Run via Powershell. Ensure Postgres Windows service is stopped.

docker run --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=dev -d -p 5432:5432 postgres

psql -U postgres -d dev -h localhost -f schema.sql
psql -U postgres -d dev -h localhost -f data.sql