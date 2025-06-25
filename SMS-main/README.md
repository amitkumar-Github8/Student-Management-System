# Java SMS Gateway

This project simulates a basic SMS gateway using Java OOP principles.

## 🚀 Features
- Send and receive SMS between registered users
- Message validation (e.g., length, phone format)
- Persistence of messages (file/DB)
- User inbox and outbox management
- Unit tests covering core logic

## 🛠 Tech Stack
- Java 8+
- OOP design: encapsulation, services, repositories
- Maven or Gradle build
- JUnit for testing
- (Optional) Logging with Log4j or java.util.logging

## 📦 Project Structure

```
com.sms.app
├── model       # Entity classes: Message, User
├── service     # Core logic: MessageService, UserService
├── repository  # Storage: SMSRepository
├── controller  # Orchestration: SMSController
├── util        # Utilities (e.g., timestamp formatting)
└── Main.java   # Program entry point
```

## 👍 Usage

1. Ensure Java 8+ and Maven/Gradle installed  
2. Clone the repo:

   ```bash
   git clone https://github.com/Abhidroid87/SMS.git
   cd SMS
   ```

3. Build the project:

   **Maven**  
   `mvn clean install`

   **Gradle**  
   `gradle build`

4. Run:

   `java -cp target/SMS-1.0-SNAPSHOT.jar com.sms.app.Main`

5. (Optional) Run tests:

   `mvn test` or `gradle test`

## 📐 Architecture Overview

- **Controller**: Accepts user input (CLI/UI)
- **Services**: Business logic for message/user management
- **Repository**: Persistence layer
- **Models**: Data representation of messages and users

## 🧪 Testing

- Unit tests cover:
  - Message validation (length, phone format)
  - Message sending/receiving
  - User registration and message listing

## ✏ Extend

- Add delivery reports or scheduled messages
- Replace file-based storage with database (SQLite)
- Implement GUI with Swing or JavaFX
- Add authentication for users
