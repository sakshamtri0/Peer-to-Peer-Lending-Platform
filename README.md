# 💸 Peer-to-Peer Lending Platform

A full-stack Peer-to-Peer Lending Platform where users can request or offer loans, automate agreements, track payments, and manage lending/borrowing seamlessly.

---

## 📌 Table of Contents

- [🔧 Features](#-features)
- [📸 Screenshots](#-screenshots)
- [⚙️ Technologies Used](#️-technologies-used)
- [🚀 Installation & Setup](#-installation--setup)
- [🧪 Usage](#-usage)
- [📁 Project Structure](#-project-structure)
- [🛡️ License](#️-license)

---

## 🔧 Features

- 👤 User authentication & authorization
- 💼 Borrower and Lender dashboards
- 📄 Loan request and offer management
- ✅ Admin approval for loan requests
- 💳 EMI Payment Tracking
- 📊 Loan history and analytics
- ✉️ Notifications via email (optional)

---

## ⚙️ Technologies Used

### 💻 Frontend:
- HTML5, CSS3
- JavaScript
- Bootstrap

### 🔙 Backend:
- PHP
- MySQL

### 📦 Others:
- XAMPP/WAMP (Local server)
- PHPMyAdmin for database

---

## 🚀 Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/Peer-to-Peer-Lending-Platform.git
   ```

2. **Move project to your server directory:**
   - For XAMPP: htdocs/
   - For WAMP: www/

3. **Set up the database:**
   - Open phpMyAdmin
   - Create a new database (e.g., p2p_lending)
   - Import the database.sql file located in the root of the project

4. **Configure database connection:**
   - Edit the database configuration file (e.g., config.php) with your DB credentials.

5. **Run the application:**
   - Go to http://localhost/Peer-to-Peer-Lending-Platform

---

## 📁 Project Structure
```
Peer-to-Peer-Lending-Platform/
│
├── admin/                 # Admin dashboard
├── borrower/              # Borrower dashboard
├── lender/                # Lender dashboard
├── css/                   # Stylesheets
├── js/                    # JavaScript files
├── database.sql           # MySQL database file
├── config.php             # DB config
└── index.php              # Landing page
```

---

## 🧪 Usage

- Register/Login as a lender or borrower
- Borrower: Submit a loan request
- Lender: View and approve/decline requests
- Admin: Manage users and loan approvals
- Users: Track EMI payments and history
