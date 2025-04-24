# **🛒 Nakup Marketplace**  
*A scalable, high-performance marketplace built with Spring Boot, Kafka, and Docker. Ready for heavy loads, designed for growth.*  

## **🚀 Why This Project?**  
I built this to tackle **real-world scalability challenges**:  
✅ **Handle spikes in traffic** (load-balanced services)  
✅ **Keep services communicating smoothly** (Kafka-powered events)  
✅ **Discover services dynamically** (Eureka service discovery)  
✅ **Secure & manage APIs efficiently** (API Gateway routing)  

No toy projects here—this is **production-grade architecture** packed into a demo.  

---

## **🛠️ Tech Stack**  
| **Category**       | **Tech**                                                                 |  
|--------------------|--------------------------------------------------------------------------|  
| **Backend**        | Spring Boot, Java 17                                                     |  
| **Event Streaming**| Apache Kafka (for async communication)                                   |  
| **Service Discovery** | Netflix Eureka (dynamic service registration)                         |  
| **API Gateway**    | Spring Cloud Gateway (routing, load balancing)                           |  
| **Database**       | PostgreSQL (with connection pooling for performance)                     |  
| **Containerization**| Docker (Kafka + Zookeeper, soon full deployment)                         |  
| **Observability**  | (Prometheus + Grafana for metrics, Spring Boot Actuator)   |  

---

## **⚡ Key Features**  
🔹 **Kafka-Driven Events** – Services communicate **without tight coupling**.  
🔹 **Load-Balanced Microservices** – No single point of failure.  
🔹 **Centralized API Gateway** – One entry point, multiple services behind it.  
🔹 **Ready for the Cloud** – Containerized (not fully yet, but bare with me), could deploy on Kubernetes next.  

---

## **📂 Project Structure**  
Since this is a **multi-repo setup**, here’s how everything connects:  

| **Service**         | **GitHub Repo** | **Description** |  
|---------------------|----------------|----------------|  
| **API Gateway**     | [[link]](https://github.com/svinstvo-og/nakup-api-gateway)         | Routes requests to services, validates JWT |  
| **Product Service** | [[link]](https://github.com/svinstvo-og/nakup-product)         | Handles product listings, categories |  
| **Order Service**   | [[link]](https://github.com/svinstvo-og/nakup-order)         | Processes orders (Kafka events) |  
| **User Service**   | [[link]](https://github.com/svinstvo-og/nakup-user)         | Manages profiles, JWT issuing and overall security | 
| **Payment Service**   | [[link]](https://github.com/svinstvo-og/nakup-payment)         | Payment dummy service, mocks logic of 3-rd party API's | 
| **Inventory Service**   | [[link]](https://github.com/svinstvo-og/nakup-inventory)         | Operates warehouse stocks | 
| **Docker**   | [[link]](https://github.com/svinstvo-og/kafka-docker)         | Docker setup for this exact project | 
| **Eureka Server**   | [[link] ](https://github.com/svinstvo-og/nakup-service-registry)        | Eureka service discovery hub | 

---

## **🎯 What’s Next?**  
This project is **live and evolving**. Upcoming improvements:  
- [ ] **Full Dockerization** (All services + DB in containers)  
- [ ] **Kubernetes Deployment** (For cloud-ready scaling)  
- [ ] **Enhanced Monitoring** (Prometheus + Grafana dashboards)  

---

## **💡 How to Run It?**  
1. **Clone the repos** (Each service is standalone).  
2. **Spin up Kafka & Eureka** (`docker-compose up`).  
3. **Start services** in order: Eureka → Services → Gateway.  
4. **Test endpoints** via Postman (or automate with scripts).  

---

## **🤝 Want to Contribute or Chat?**  
I’m open to:  
🔸 **Feedback** (How would you improve this architecture? If you find my code ugly or inconsistent, know that it was intended that way)))))  
🔸 **Collaboration** (Extending features? Let’s talk!)  
🔸 **Job opportunities** (I’m looking for backend/dev roles!)  

📫 **Reach out**: maksymkoval.dev@gmail.com / [[LinkedIn]](https://www.linkedin.com/in/kovalmaksym1/)]  
