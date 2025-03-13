# Traini8 Application

### Prerequisites
- Java 17 or higher
- Maven 3.6.3 or higher
- PostgreSQL

### Installation

1. Clone the repository:
   ```
   git clone https://github.com/Ujjwal05T/Backend_Traini8_Ujjwal.git
   cd Traini8
   ```

2. Configure the database:


- Create a PostgreSQL database
- Update the application.properties file with your database credentials:
```
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
```
3. Build the project:

```
 mvn clean install
```
4.Run the application:
```
mvn spring-boot:run
```
