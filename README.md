# Peer-to-Peer Lending Platform

This repository contains a web-based peer-to-peer lending platform that connects borrowers with individual lenders. Users can register as either lenders or borrowers, browse loan requests or offers, and complete lending transactions securely.

## 🔍 Features

- User authentication and role-based access
- Borrowers can post loan requests
- Lenders can view and fund loan requests
- Admin dashboard for monitoring transactions and users
- Loan tracking and repayment status
- Frontend and backend fully integrated

## 🛠️ Technologies Used

- **Frontend:** HTML, CSS, JavaScript, Bootstrap
- **Backend:** Python (Flask)
- **Database:** SQLite
- **Other:** Jinja2 Templating, Flask-WTF (Forms), SQLAlchemy (ORM)

## 🧠 Model Information

> This project does not include machine learning models but implements a structured business logic model for handling users, loans, and transactions via SQLAlchemy ORM.

- **User Roles:** Lender, Borrower, Admin
- **Loan Status Flow:** Requested → Funded → Repaid
- **Security:** Input validation, session management using Flask

