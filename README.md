# 🌱 Growth Tracker – EverTea App

![image alt](https://github.com/Nawoda2-0/Growth-Tracker-SDGP/blob/abec0e69451179c4adc6bd8188bbca972a4100d8/e66cc475-d463-4d40-9a00-e44b86886667.jpg)

Welcome to the **Growth Tracker** – a beautifully simple and intuitive feature within the **EverTea App** that helps users track their tea plants' growth over time. Designed with plant lovers in mind, it blends nature, data, and care into one seamless experience.

![description](https://github.com/Nawoda2-0/Growth-Tracker-SDGP/blob/abec0e69451179c4adc6bd8188bbca972a4100d8/ezgif-188b77b5918757.gif)


---

## ✨ Features

- 📅 **Log Daily Growth**  
  Record measurements, notes, and conditions day by day.

- 🟢 **Growth Status (Good / Warning)**  
  Visual indicators help users know if their plant is thriving or needs attention.

- 📊 **Insightful Graphs** *(Coming Soon)*  
  View growth trends over time to better understand your plant’s journey.

- 🗃️ Data stored in MySQL
- - 📱 Mobile-friendly frontend (React Native)
- ☁️ Deployed on AWS EC2 with Docker
- 🔁 CI/CD Pipeline using GitHub Actions + Docker Hub

---

## 📁 File Structure
![image alt](https://github.com/Nawoda2-0/Growth-Tracker-SDGP/blob/20f0c4fb097233bf379a3cdbe54f578548ca9ed0/folderStructure.png)

---

### 🧱 Architecture Diagram
![image alt](https://github.com/Nawoda2-0/Growth-Tracker-SDGP/blob/20f0c4fb097233bf379a3cdbe54f578548ca9ed0/diagram.png)

---

## 🧠 How It Works

1. **User selects a plant** from their garden.
2. They **log height and conditions** 
3. Based on the input, the app determines the **growth status**:
   - ✅ **Good**: Healthy progress  
   - ⚠️ **Warning**: Unusual or stalled growth
4. Users can **view history**, compare logs, and get **personalized tips** *(coming soon)*.

---

## 🛠 Tech Stack

- **Frontend:** React Native (TypeScript)
- **Backend:** Spring Boot (with offline support)
- **Database:** MySQL

---

### 🧰 DevOps Tools Used
| Tool           | Purpose                                                        |
|------------------|-------------------------------------------------------------------|
| 🐳 Docker         |  Containerization of backend & database                         |
| 🤖 GitHub Actions |  CI/CD pipeline for building & pushing Docker images            |
| 📦 Docker Hub     | Image registry for deployment                                   |
| ☁️ AWS EC2        | Hosting backend app and MySQL                                  |


---

## 🐳 Docker & CI/CD

### ✅ Dockerized Spring Boot App

```Dockerfile
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

```

---

### ✅ GitHub Actions Workflow (.github/workflows/deploy.yml)

- ➡️Builds the Spring Boot app
- ➡️Pushes Docker image to Docker Hub: nawodasilva/growth-tracker-backend
- ➡️Secrets used: DOCKER_USERNAME, DOCKER_PASSWORD

---

### 🔌 API Endpoints

| Method | Endpoint                        | Description                    |
|--------|----------------------------------|--------------------------------|
| GET    | /plants                          | List all plants                |
| GET    | /plants/{id}                     | Get plant by ID                |
| POST   | /plants                          | Create a new plant             |
| PUT    | /plants/{id}/height              | Update plant height            |
| GET    | /plants/{id}/status?height=XX    | Evaluate plant growth status   |

##🧪 Sample Payload
   ```JSON
   {
    "name": "tea1",
    "status": "good",
    "height": 12.5
  }
```

---


## 🚀 Getting Started

1. Clone the EverTea App repository:
   ```bash
   git clone https://github.com/Nawoda2-0/evertea-app.git
2. Find Front end and BackEnd Folder:
   ```bash
   Back-end Folder : growth-tracker
   Front-end Folder : growthTrackerFE
3. Run Front end:
   ```bash
   npm run android
1. Run backend:
   ```bash
   Run using youe IDLE

---

### 🛠️ How to Run Locally with Docker
1. Clone the repo
    ```bash
    git clone https://github.com/Nawoda2-0/Growth-Tracker-SDGP.git
    cd Growth-Tracker-SDGP/GrowthTracke.v.2/backend
    
2. Build the JAR (optional if image exists)
    ```bash
    ./mvnw clean package -DskipTests

3. Start MySQL container
    ```bash
    docker network create growth-network

    docker run -d \
      --name mysql-container \
      --network growth-network \
      -e MYSQL_ROOT_PASSWORD=<YOUR PASSWORD> \
      -e MYSQL_DATABASE=growthtracker \
      -p 3306:3306 \
      mysql:8.0

4. Start Spring Boot Container
    ```bash
    docker run -d \
      --name growth-tracker-backend \
      --network growth-network \
      -p 8080:8080 \
      -e SPRING_DATASOURCE_URL=jdbc:mysql://mysql-container:3306/growthtracker \
      -e SPRING_DATASOURCE_USERNAME=root \
      -e SPRING_DATASOURCE_PASSWORD=<YOUR PASSWORD>$ \
      nawodasilva/growth-tracker-backend





---
   
## 💡 Future Improvements
1. **AI-driven growth predictions**
2. **Plant-specific care suggestions**
3. **Export growth logs as PDF**
4. **Community sharing feature**  
   
## 🙌 Contributing
Got ideas or found a bug? Open an issue or pull request – we’d love your input!
Let’s grow this feature together 🌿
   
# 📬 Contact
**Have questions or want to collaborate?**
Email: nawodasilva2001@gmail.com
GitHub: @Nawoda2-0
   
