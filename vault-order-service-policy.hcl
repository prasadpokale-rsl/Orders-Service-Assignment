# Least-privilege policy for the order-service application.
# This policy allows the application to read only the secrets it needs.

# Dynamic PostgreSQL credentials issued by the Database Secrets Engine.
path "database/creds/order-service-role" {
  capabilities = ["read"]
}

# API key stored in the KV v2 engine.
path "secret/data/order-service" {
  capabilities = ["read"]
}
