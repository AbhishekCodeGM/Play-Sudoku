# 🧩 Play Sudoku - Game Web Application

🚀 **Live Demo:** [https://gorgeous-granita-2eff9a.netlify.app](https://gorgeous-granita-2eff9a.netlify.app)

## 📌 Overview
**Play Sudoku** is a modern, fully responsive web application where users can play Sudoku online with an additional option to automatically solve the puzzle. This project is built using a **React frontend** and a **Java Spring Boot backend** with a fully custom-built API to generate, validate, and solve Sudoku boards.

## 💻 Tech Stack

### Frontend:
- React.js
- HTML5 & CSS3
- Axios
- Netlify (Deployment)

### Backend:
- Java 17+
- Spring Boot 3.x
- RESTful APIs
- Custom-built API logic

## ✨ Features
- 🎮 Play classic 9x9 Sudoku puzzles
- ⚡ Instant solve option using backend logic
- ✅ Validate puzzle correctness
- 🔄 Generate new puzzles
- 📱 Fully responsive (mobile + desktop)
- 🆓 No sign-up needed

## 📂 Project Structure
/project-root
│
├── /backend # Java Spring Boot API
└── /frontend # React Web App


## 📦 How to Run Locally

### Backend
cd backend
./mvnw spring-boot:run

###Frontend
cd frontend
npm install
npm start


## 🟢 API Overview

| Method | Endpoint         | Description                  |
|--------|------------------|------------------------------|
| GET    | /api/generate    | Generate a new Sudoku puzzle |
| POST   | /api/solve       | Solve the given board        |
| POST   | /api/validate    | Validate current board       |

## 📢 Deployment

- **Frontend (Netlify):** [https://gorgeous-granita-2eff9a.netlify.app](https://gorgeous-granita-2eff9a.netlify.app)
- **Backend:** Self-hosted Spring Boot API

## 📸 Screenshots

<!-- Add actual screenshots in /screenshots folder -->
| Web View | Mobile View |
|----------|-------------|
| ![](./screenshots/desktop.png) | ![](./screenshots/mobile.png) |

## 🙌 Acknowledgements
- Built from scratch using React and Spring Boot
- Inspired by the classic Sudoku puzzle game
