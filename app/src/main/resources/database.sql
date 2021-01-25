CREATE ROLE customer_reports WITH LOGIN PASSWORD 'customer_reports'  CREATEDB CREATEROLE;;
CREATE DATABASE customer_reporting_service owner customer_reports;
GRANT ALL PRIVILEGES ON DATABASE customer_reporting_service TO customer_reports;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO customer_reports;
GRANT ALL PRIVILEGES ON ALL sequences IN SCHEMA public TO customer_reports;
