ARG registry="192.168.0.21:5000/"
ARG image="postgres"
ARG tag=":9.6.3-alpine"
FROM ${registry}${image}${tag}
ADD manteniento.sql /docker-entrypoint-initdb.d/mantenimiento.sql
