## ORM-using-Hibernate

**Overview** <br>
This Project contains a basic implementation of ORM using the Hibernate Framework. The project creates an E-Commerce Management System that allows you to manage Categories, Products, Users, and Orders with multiple Order Details. The ORM is achieved using technologies and tools, like
- `Hibernate` Framework
- `JDBC`
- `MySQL` as Database
- `Eclipse` IDE


**Project features** <br>
Insert new Categories, Products, and Users <br>
Place Orders for Products with multiple OrderDetails <br>
Fetch Orders along with associated Users and Products <br>


**Setup Instructions** <br>
First download the Project [ECommerce.zip](https://github.com/CoderKnight03/ORM-using-Hibernate/tree/363dc102b6396b6b3cafe905395b8d1705cb0589/Project) to the Local Machine and extract it <br>
Then follow the steps:<br>
1. Open the project in your IDE <br>
   - Use Eclipse, IntelliJ IDEA, or any preferred Java IDE
2. 
3. Configure Database<br>
   - Set up a local MySQL database<br>
   - Update the `hibernate.cfg.xml` with:<br>
      --> your desired Database name and port in the Database URL<br>
      --> your `username`<br>
      --> your `password`<br>
      --> Refer the [hibernate.cfg.xml](https://github.com/CoderKnight03/ORM-using-Hibernate/blob/0763c3f0fae21857800576650d0818cbee26a52c/hibernate.cfg.xml) for easy understanding
4. Set proper values as desired, in the CRUD Methodologies. Check [CRUD Methods](https://github.com/CoderKnight03/ORM-using-Hibernate/tree/81a24e8458b72a503e46a206b36c432fb91b88ad/CRUD) for defined Methodologies 
5. Run the Application
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
