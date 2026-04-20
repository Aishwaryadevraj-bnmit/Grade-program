# Use modern Java base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy files
COPY . /app

# Compile program (if needed)
RUN javac Grade.java

# Run program
CMD ["java", "Grade"]
