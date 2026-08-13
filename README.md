# 🚗 Smart Parking Lot System
A Java Core simulation of a smart parking management system demonstrating Object-Oriented Programming (OOP) and Collection Framework principles.

## 📌 Features
* **Encapsulation & Validation:** Custom field protection and logic checking.

* **Inheritance & Polymorphism:** Abstract Vehicle class extended by Tesla and EScooter with overridden move() behavior.

* **Interfaces: Electric** (battery management) and **GPSNavigable** (navigation).

* **Data Deduplication:** HashSet with custom equals() and hashCode() in ParkingPass to prevent duplicate pass IDs.

## 🧱 Project Structure
* `Vehicle.java` — Abstract base class.

* `Tesla.java` / `EScooter.java` — Concrete vehicle implementations.

* `Electric.java` / `GPSNavigable.java` — Capability interfaces.

* `ParkingPass.java` — Pass entity with deduplication logic.

* `SmartParkingLot.java` — Executable main method.

## 🚀 How to Run
1. Clone the repository: git clone https://github.com/vl4d03/SmartParkingLot.git
   
2. Open the project in **IntelliJ IDEA** (or your preferred IDE / editor).
   
3. Run `SmartParkingLot.java`.
