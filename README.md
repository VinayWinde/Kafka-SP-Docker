# Kafka-SP-Docker
Integrating Kafka in Spring boot application and deploying in Docker

# Kafka-SP-Docker: Spring Boot + Kafka + Docker Starter Project

This is a simple, production-friendly starter project that demonstrates how to integrate **Apache Kafka**, **Spring Boot**, and **Docker**. It's designed as a learning base for message-driven microservices and event streaming architectures.

## 🔧 Tech Stack
- **Spring Boot** (Java)
- **Apache Kafka** (Wurstmeister image)
- **Zookeeper** (for Kafka coordination)
- **Docker Compose** (multi-container setup)

## 📂 Project Structure
```
project-root/
├── docker-compose.yml         # Defines Kafka and Zookeeper services
├── src/main/java/...          # Spring Boot application and Kafka listeners
├── src/main/resources/
│   └── application.properties # Kafka consumer/producer config
└── README.md                  # You're here :)
```

## 🚀 Getting Started

### 1. Start Kafka and Zookeeper
Make sure Docker is running, then spin up the environment:
```bash
docker-compose up -d
```

### 2. Run Spring Boot App
From IntelliJ or terminal:
```bash
./mvnw spring-boot:run
```

### 3. Produce and Consume Messages
The Spring Boot app will automatically produce and/or consume messages on startup using the `test_topic`.

## ⚙️ Kafka Configuration (in `application.properties`)
```properties
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=group-1
spring.kafka.consumer.auto-offset-reset=earliest
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
```

## 🧪 Example Kafka CLI Commands (Optional)
```bash
# List topics
docker exec -it <kafka-container> kafka-topics.sh --bootstrap-server localhost:9092 --list

# Produce
kafka-console-producer.sh --broker-list localhost:9092 --topic topic-message

# Consume
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic-message --from-beginning
```

## 📌 Notes
- Use `KAFKA_CREATE_TOPICS` in `docker-compose.yml` to auto-create topics
- Make sure to match serializers between producer and consumer
- For multi-broker setup, expand `docker-compose.yml`

---

## 💡 Why Use This?
- Great for **Kafka beginners** using Spring Boot
- Fast local setup with Docker
- Clean structure to build from: microservices, event sourcing, etc.

---

## 🧑‍💻 Author
**Kafka-SP-Docker** by [https://github.com/VinayWinde/Kafka-SP-Docker] — feel free to fork and expand!

---
Happy streaming! 🚀


