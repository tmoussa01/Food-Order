# 🍔 Food Order Backend API

Spring Boot backend for food delivery with JWT authentication and restaurant management.

## ✅ Implemented Features

### Authentication
- JWT token generation/validation
- User roles: `CUSTOMER`, `RESTAURANT_OWNER`, `ADMIN`
- Secure password hashing (BCrypt)
- Endpoints:
  - `POST /auth/signup`
  - `POST /auth/signin`

### Restaurant Management
- Full CRUD operations:
  - `POST /api/admin/restaurants`
  - `GET /api/restaurants/{id}`
  - `PUT /api/admin/restaurants/{id}`
  - `DELETE /api/admin/restaurants/{id}`
- Search by name/cuisine: `GET /api/restaurants/search?keyword=...`
- Toggle open/closed status: `PUT /api/admin/restaurants/{id}/status`
- Favorite system: `PUT /api/restaurants/{id}/add-favorites`

### Food Menu
- Food item management:
  - `POST /api/admin/food`
  - `DELETE /api/admin/food/{id}`
  - `PUT /api/admin/food/{id}` (availability toggle)
- Filtering:
  - Vegetarian/non-vegetarian
  - Seasonal items
  - By category

### Order System
- Complete order flow:
  - Cart management (`/api/cart/**`)
  - Order creation: `POST /api/order`
  - Status updates: `PUT /api/admin/order/{orderId}/{status}`
- Order history:
  - For users: `GET /api/order/user`
  - For restaurants: `GET /api/admin/order/restaurant/{id}`

## 🛠 Tech Stack

| Layer          | Technology |
|----------------|------------|
| Framework      | Spring Boot 3.2.4 |
| Database       | MySQL 8.0 |
| Authentication | JWT (JJWT 0.11.5) |
| ORM            | Spring Data JPA |
| Build Tool     | Maven |

## 🚀 Quick Start

### Prerequisites
- JDK 21+
- MySQL 8.0+

### Installation
1. Clone repo:
   ```bash
   git clone https://github.com/tmoussa01/food-order.git


2. Configure database:

  properties
# application.properties
    spring.datasource.url=jdbc:mysql://localhost:3306/foodOrder
    spring.datasource.username=youruser
    spring.datasource.password=yourpass

# Project Structure
      src/
      ├── main/
      │   ├── java/
      │   │   └── com/tahri/Food/Order/
      │   │       ├── config/      # Security config
      │   │       ├── controller/  # API endpoints
      │   │       ├── model/       # JPA entities
      │   │       ├── repository/  # Database access
      │   │       └── service/     # Business logic
      └── resources/               # Config files
