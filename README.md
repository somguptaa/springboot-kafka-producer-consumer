# Spring Boot Kafka

This repository contains two Spring Boot applications demonstrating Apache Kafka messaging.

## Projects

### 1. Kafka Producer Application

Publishes messages to a Kafka topic using `KafkaTemplate`.

**Features**

* Console-based message input
* Sends messages to Kafka Topic
* Spring Kafka Producer Configuration
* Java 21 + Spring Boot

### 2. Kafka Consumer Application

Consumes messages from Kafka using `@KafkaListener`.

**Features**

* Listens to Kafka Topic
* Receives messages in real-time
* Consumer Group Support
* Spring Kafka Consumer Configuration

---

# Architecture

```text
+-------------------+
| Kafka Producer    |
| Spring Boot App   |
+-------------------+
          |
          v
+-------------------+
| Kafka Topic       |
| topickafka        |
+-------------------+
          |
          v
+-------------------+
| Kafka Consumer    |
| Spring Boot App   |
+-------------------+
```

---

# Technology Stack

* Java 21
* Spring Boot 4.x
* Apache Kafka 4.3.0
* Spring Kafka
* Maven

---

# Kafka Setup

## Generate Cluster ID

```cmd
bin\windows\kafka-storage.bat random-uuid
```

Example:

```text
TfjVypuCRc20LbsSONWLWQ
```

---

## Format Controller Storage

```cmd
bin\windows\kafka-storage.bat format --cluster-id TfjVypuCRc20LbsSONWLWQ --config config\controller.properties --standalone
```

---

## Format Broker Storage

```cmd
bin\windows\kafka-storage.bat format --cluster-id TfjVypuCRc20LbsSONWLWQ --config config\broker.properties
```

---

## Start Controller

```cmd
bin\windows\kafka-server-start.bat config\controller.properties
```

---

## Start Broker

```cmd
bin\windows\kafka-server-start.bat config\broker.properties
```

---

## Verify Broker

```cmd
netstat -ano | findstr :9092
```

Expected:

```text
LISTENING
```

---

# Topic Commands

## Create Topic

```cmd
bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --create --topic topickafka --partitions 1 --replication-factor 1
```

## List Topics

```cmd
bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list
```

## Describe Topic

```cmd
bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic topickafka
```

## Delete Topic

```cmd
bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --delete --topic topickafka
```

---

# Run Applications

## Start Consumer Application

```cmd
mvn spring-boot:run
```

Consumer waits for incoming messages.

---

## Start Producer Application

```cmd
mvn spring-boot:run
```

Enter messages:

```text
Hello Kafka
Spring Boot
Testing
end
```

---

# Sample Output

## Producer

```text
Enter message::
Hello Kafka

Enter message::
Spring Boot Kafka

Enter message::
end
```

## Consumer

```text
Received Message :: Hello Kafka

Received Message :: Spring Boot Kafka

Received Message :: end
```

---

# Kafka Console Tools

## Console Producer

```cmd
bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic topickafka
```

## Console Consumer

```cmd
bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topickafka --from-beginning
```

---

# Repository Structure

```text
springboot-kafka-messaging
│
├── kafka-producer-app
│   └── Spring Boot Producer
│
├── kafka-consumer-app
│   └── Spring Boot Consumer
│
└── README.md
```

---

# Learning Objectives

* Apache Kafka Basics
* Kafka Topics
* Kafka Producer API
* Kafka Consumer API
* Spring Kafka Integration
* KafkaTemplate Usage
* @KafkaListener Usage
* Message Publishing and Consumption

---

# Author

Spring Boot + Apache Kafka learning project demonstrating Producer and Consumer communication using Kafka 4.3.0 and Java 21.
