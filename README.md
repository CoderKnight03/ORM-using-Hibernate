## ORM-using-Hibernate

**Overview** <br>
This Project contains a basic implementation of ORM using the Hibernate Framework. The project creates an E-Commerce Management System that allows you to manage Categories, Products, Users, and Orders with multiple Order Details. The ORM is achieved using technologies and tools, like
- Hibernate Framework
- JDBC
- MySQL as Database
- Eclipse IDE

**Project features** <br>
Insert new Categories, Products, and Users <br>
Place Orders for Products with multiple OrderDetails <br>
Fetch Orders along with associated Users and Products <br>

**Setup Instructions**
 Clone the Repository
        ⟶ https://github.com/satCODER04/Web-development.git

    2. Open in your IDE
        ⟶ Use Eclipse, IntelliJ IDEA, or any preferred Java IDE.

   3. Configure Database
        ⟶ Set up a local MySQL (or any chosen DB) database.
        ⟶ Create a schema (e.g., ecommerce_db).
        ⟶ Update your hibernate.cfg.xml with:
                ∘ Database URL
                ∘ Username
                ∘ Password

    4. Run the Application
        ⟶ Make sure `hibernate.cfg.xml` is properly configured and MySQL server is 
              running.
        ⟶ Run App.java to initiate the SessionFactory.
        ⟶ Run:
                ∘ new CreateCategory(sessionFactory);
                ∘ new CreateProduct(sessionFactory);
                ∘ new CreateUsers(sessionFactory);
                ∘ new CreateOrders(sessionFactory);
                ∘ new Fetch(sessionFactory);

      5. Verify Database
        ⟶ Check the inserted data via MySQL Workbench or any SQL client.
**Development Highlights**

Java classes are annotated with JPA annotations like @Entity, @Table, @GeneratedValue, @Id, @OneToMany, and @ManyToOne to map objects to database tables.
Relationships between entities (Users, Orders, Products) are handled using proper Hibernate mappings.

👉 See [TEST_CASES.md](./TEST_CASES.md) for test scenarios and expected outputs.

Passwords are securely hashed using BCrypt before saving to the database.

**Authors and Acknowledgment**

Project Title was created by **[Satakshi Poddar](https://github.com/satCODER04)**
