# taller-git

# 🚗 Vehicle Reservation Management System

## 📖 Description
Java-based system for managing reservations of a diverse vehicle fleet. Allows customers to browse and reserve vehicles, while administrators manage the fleet.

"Clarification: Several parts were left in Spanish since at first I did it that way, so it seemed tedious to have to organize everything like the names, classes, etc. in Spanish."

## 🚀 Technologies Used
- **Java 8+**: Main programming language
- **Git**: Version control
- **GitHub**: Remote code storage
- **IntelliJ IDEA**: Integrated development environment
- **Scanner Class**: For user input handling

## ⚙️ Main Features
- **Interactive Console Interface**: User-friendly menu system
- **Vehicle Catalog**: Display of available vehicles with details
- **Dynamic Pricing**: Real-time cost calculation with insurance and GPS options
- **Multiple Vehicle Types**: Cars, Motorcycles, Trucks, Buses
- **Instant Quotations**: Immediate price calculations based on user input

## 🏗️ Class Structure
```java
// Abstract base class
Vehiculo (idVehiculo, marca, modelo, año, costoDiario, disponibilidad)

// Vehicle subclasses
Auto (tipoCombustible)
Moto (cilindrada)
Camioneta (capacidadCarga)
Autobus (capacidadPasajeros)

// System management
Cliente (idCliente, nombre, reservas)
Reserva (idReserva, fechas, costoTotal)
Administrador (flota de vehículos)
```

## 🧪 Testing the System

### Example Usage
```java
// Create vehicles
Auto auto = new Auto("A001", "Toyota", "Corolla", 2022, 50.0, "Gasolina");
Moto moto = new Moto("M001", "Honda", "CBR", 2023, 30.0, 600);

// Calculate rental price
double price = auto.calcularPrecio(5, true, true); // 5 days + insurance + GPS
System.out.println("Total price: $" + price);

// Create reservation
Cliente client = new Cliente("C001", "John Doe");
// client.reservarVehiculo(auto, startDate, endDate, true, false);
```
### Example usage:

```java
=== SISTEMA DE RESERVAS INTERACTIVO ===

--- CATÁLOGO DE VEHÍCULOS ---
1. Toyota Corolla (Auto - Gasolina) - $50.0/día
2. Honda CBR (Moto) - $30.0/día
3. Ford Ranger (Camioneta) - $70.0/día
4. Mercedes Sprinter (Autobús) - $120.0/día

Elige un vehículo (1-4): 2
¿Cuántos días de alquiler?: 5
¿Incluir seguro? (si/no): si
¿Incluir GPS? (si/no): no

--- RESULTADO DE COTIZACIÓN ---
Vehículo: Honda CBR
Días: 5
Seguro: Sí (+10%)
GPS: No
Precio total: $165.0
```

## 🚀 Tecnologías Utilizadas
- **Java 8+**: Lenguaje de programación principal
- **Git**: Control de versiones
- **GitHub**: Almacenamiento remoto del código
- **IntelliJ IDEA**: Entorno de desarrollo integrado

## 🔧 How to Run
- Clone the repository: git clone https://github.com/SantiBartolo/taller-git.git
- Open in IntelliJ IDEA
- Run the Main.java class
- Follow the interactive menu instructions

📊 Project Status
- ✅ Completed - All functionalities implemented and tested
- ✅ Interactive - Console interface working perfectly
- ✅ Documented - Professional documentation in English
- ✅ Version Controlled - Git integration complete

🎯 Requirements Fulfilled
- Inheritance system for vehicles
- Interactive user interface with Scanner
- Real-time price calculation with options
- Multiple vehicle type support
- Professional documentation
- Git and GitHub integration
- Complete testing scenarios

## 👨‍💻 Author
- **Santiago Bartolo Sansón**

## 📧 Email: sa.bartolo22@ciaf.edu.co

## 🐱 GitHub: SantiBartolo

## 💻 Academic Information

- **Software Engineering - Semester 5**
- **Professor**: Santiago Ramirez Arenas
- **Course**: Programming 4
- First Term Project Version: 2.0 (Interactive Console Edition)

## 📞 Contact
For questions about the project, contact the author via email.
