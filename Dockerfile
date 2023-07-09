FROM maven:3.8.4-openjdk-11-slim

# Install dependencies
RUN apt-get update && \
    apt-get install -y wget unzip

# Set up Chrome and ChromeDriver
ARG CHROME_VERSION="96.0.4664.93"


# Set working directory
WORKDIR /app