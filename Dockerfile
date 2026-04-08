# Use an official OpenJDK image as base
FROM openjdk:17-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the Java file into the container
COPY Grade.java .

# Compile the Java program
RUN javac Grade.java

# Command to run the program
CMD ["java", "Grade"]