# Simple Kafka App

A standalone Apache Kafka project demonstrating basic producer-consumer messaging. This repository contains two independent applications:

- **Producer Application** – Publishes messages to a Kafka topic.
- **Consumer Application** – Consumes and processes messages from the Kafka topic.

The project is intended for learning and understanding core Apache Kafka concepts such as topics, producers, consumers, offsets, and message flow.

## Architecture

```text
+-------------------+          +-------------------+          +-------------------+
| Producer App      | -------> | Kafka Topic       | -------> | Consumer App      |
+-------------------+          +-------------------+          +-------------------+
```

## Prerequisites

- Java 21
- Spring Boot 3.x
- Apache Kafka
- Maven

## Running the Producer

Run as SpringBoot Apllication 

The producer publishes messages to the configured Kafka topic.

## Running the Consumer

Run as SpringBoot Apllication 

The consumer subscribes to the topic and processes incoming messages.

## Example Flow

1. Producer sends a message to Kafka.
2. Kafka stores the message in the topic.
3. Consumer reads the message from the topic.
4. Consumer processes and logs the received message.

Example:

```text
Producer -> "Hello Kafka"
Kafka Topic -> sample-topic
Consumer -> Received: Hello Kafka
```

## Concepts Covered

- Kafka Topics
- Kafka Producers
- Kafka Consumers
- Consumer Groups
- Message Serialization
- Offset Management
- Event-Driven Communication

## Learning Goals

This project was created as part of a Kafka learning journey to gain hands-on experience with:

- Publishing messages using Kafka producers
- Consuming messages using Kafka consumers
- Understanding Kafka's messaging architecture
- Exploring asynchronous communication patterns

## Future Enhancements

- Multiple consumers and consumer groups
- Message partitioning
- Message keys
- Retry mechanisms
- Dead Letter Topics (DLT)
- Kafka Streams
- Spring Kafka integration
- Docker Compose setup

## License

This project is intended for educational and learning purposes.
