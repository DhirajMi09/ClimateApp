# 🌦️ Weather Forecast Application

A **Spring Boot-based Weather Forecast Application** that fetches real-time weather data from an external API and displays a **5-day forecast** with temperature, humidity, and weather conditions.

---

## 📌 Features

* 🌡️ Display current temperature
* 💧 Show humidity levels
* 🌥️ Weather condition description
* 📅 5-day forecast
* 🔍 Search weather by city
* ⚠️ Error handling for invalid inputs
* 🎨 Simple and responsive UI (Thymeleaf)

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **Frontend:** Thymeleaf (HTML + CSS)
* **API Integration:** REST API (OpenWeatherMap)
* **Data Format:** JSON parsing (Jackson)
* **Build Tool:** Maven

---

## 📁 Project Structure

```
weather-app/
│
├── src/main/java/com/weather/
│   ├── controller/
│   ├── service/
│   ├── model/
│   └── WeatherAppApplication.java
│
├── src/main/resources/
│   ├── templates/
│   │   └── index.html
│   └── application.properties
│
└── pom.xml
```

---

## ⚙️ Setup & Installation

### 1️⃣ Clone the repository

```
git clone https://github.com/your-username/weather-app.git
cd weather-app
```

---

### 2️⃣ Add API Key

Update `application.properties`:

```
weather.api.key=YOUR_API_KEY
weather.api.url=https://api.openweathermap.org/data/2.5/forecast
```

---

### 3️⃣ Run the Application

```
mvn spring-boot:run
```

---

### 4️⃣ Open in Browser

```
http://localhost:3306
```

---

## 📊 Sample Output

```

```

---

## 🧠 Concepts Used

* REST API Integration
* JSON Parsing
* MVC Architecture
* Dependency Injection
* Exception Handling

---

## 🚀 Future Enhancements

* 🌍 Auto-detect location
* 📊 Weather charts (graphs)
* 🌙 Dark mode UI
* 🗄️ Database integration (MySQL)
* ⚡ React frontend

---

## 📄 Resume Description

> Developed a Weather Forecast Application using Spring Boot that integrates with external REST APIs to fetch real-time and 5-day forecast data. Implemented JSON parsing, layered architecture, and responsive UI using Thymeleaf.

---

## 👨‍💻 Author

**Your Name**
GitHub: https://github.com/DhirajMi09

---

