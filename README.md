# AI Agent with Spring Boot and LangChain4j

![Java](https://img.shields.io/badge/Java-17+-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.0-brightgreen)
![LangChain4j](https://img.shields.io/badge/LangChain4j-0.35.0-orange)

## Features

- Integration with AI models for natural language processing and generation.
- Example of a simple AI agent that can be extended for custom business logic.
- Usage of LangChain4j, a Java SDK for building language model chains.
- Clean and modular code structure for easy understanding and customization.
- Sample REST endpoints to interact with the AI agent.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- A valid Google Cloud project with access to **Gemini API**

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/muhammadirfanmubasyir-sys/langchain4j-ai-weather-agent.git
   cd AIAgentExample

2. Configure your AI API credentials in the application properties or environment variables:

   For example, in `src/main/resources/application.properties`:

   ```properties
   gemini.api.key=YOUR_API_KEY_HERE
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

## Usage

Once the application is running, you can send requests to the REST endpoints exposed by the AI agent. For example, use tools like Postman or cURL to interact with the API.

Example request:

```bash
curl -X POST http://localhost:8080/api/agent/chat \
     -H "Content-Type: application/json" \
     -d '{"message":"Hello, AI agent!"}'
```

Example response:

```json
{
  "response": "Hello! How can I assist you today?"
}
```
Example request:
```bash
curl -X POST http://localhost:8080/api/agent/chat \
     -H "Content-Type: application/json" \
     -d '{"message":"Get current weather for london"}'
```
Example response:

```json
{
  "response": "The current weather in London is 15°C and cloudy, with a chance of drizzle."
}
```
## Project Structure

* `src/main/java/com/thescribble/AIAgentExample` - Main source code including controller, service, and AI integration logic.
* `src/main/resources/` - Application configuration files.
* `pom.xml` - Maven build and dependency management.

## Dependencies

* Spring Boot (Web starter)
* LangChain4j (Java SDK for LLM chains)
* A valid Google Gemini API Key


