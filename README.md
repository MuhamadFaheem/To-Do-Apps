# To-Do App

To-Do App is a Spring Boot project designed to help you manage tasks effectively. This application demonstrates how to build a simple task management system and deploy it using Docker, making it a great example of backend development and containerization.

## Overview

The To-Do App offers a user-friendly interface for managing tasks. Users can create, update, and delete tasks, while the application is designed to be deployed in a Docker container for ease of use and scalability.

## Features

- **Task Management:** Create, update, and delete tasks.
- **User Authentication:** Secure access with user authentication.
- **Task Listing:** View and manage tasks with ease.

## Technology Stack

- **Spring Boot:** For developing backend services and RESTful APIs.
- **Docker:** For containerizing and deploying the application.

## Docker Deployment

The application is containerized using Docker to simplify deployment. Follow these steps to deploy the app using Docker:

### Prerequisites

- [Docker](https://docs.docker.com/get-docker/) installed on your machine.

### Build and Run with Docker

1. **Build the Docker Image:**
    ```bash
    docker build -t todo-app .
    ```

2. **Run the Docker Container:**
    ```bash
    docker run -p 8080:8080 todo-app
    ```

3. **Access the Application:**
    Open your web browser and navigate to `http://localhost:8080` to interact with the To-Do App.

### Docker Compose (Optional)

For projects with additional services (e.g., a database), use Docker Compose:

1. **Create a `docker-compose.yml` file:**
    ```yaml
    version: '3'
    services:
      app:
        image: todo-app
        ports:
          - "8080:8080"
        depends_on:
          - db
      db:
        image: postgres
        environment:
          POSTGRES_USER: user
          POSTGRES_PASSWORD: password
          POSTGRES_DB: todoapp
    ```

2. **Start the Services:**
    ```bash
    docker-compose up
    ```

## Getting Started

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/YOUR_USERNAME/your-todo-app.git
    ```

2. **Navigate to the Project Directory:**
    ```bash
    cd your-todo-app
    ```

3. **Build and Run with Docker:**
    ```bash
    docker build -t todo-app .
    docker run -p 8080:8080 todo-app
    ```

4. **Access the Application:**
    Open your browser and go to `http://localhost:8080`.
