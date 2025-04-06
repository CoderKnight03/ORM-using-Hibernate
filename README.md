## ORM-using-Hibernate

**Overview** <br>
This Project contains a basic implementation of ORM using the Hibernate Framework. The project creates an E-Commerce Management System that allows you to manage Categories, Products, Users, and Orders with multiple Order Details. The ORM is achieved using technologies and tools, like
- `Hibernate` Framework
- `JDBC`
- `MySQL` as Database
- `Eclipse` IDE


Check [here](https://github.com/CoderKnight03/ORM-using-Hibernate/blob/bab73f5a2739c09afb9a418eb4197084ad48e148/Data%20Base%20Schema.md) for the Data Base Schema


**Project features** <br>
Insert new Categories, Products, and Users <br>
Place Orders for Products with multiple OrderDetails <br>
Fetch Orders along with associated Users and Products <br>


**Setup Instructions** <br>
First download the Project [ECommerce.zip](https://github.com/CoderKnight03/ORM-using-Hibernate/tree/363dc102b6396b6b3cafe905395b8d1705cb0589/Project) to the Local Machine and extract it <br>
Then follow the steps:<br>
1. Open the project in your IDE <br>
   - Use Eclipse, IntelliJ IDEA, or any preferred Java IDE
2. Define all the dependencies properly in the `pom.xml` file. Refer [pom.xml](https://github.com/CoderKnight03/ORM-using-Hibernate/blob/b6df50b5e8cc99b7e03bafe9110dcc061163d15a/pom.xml) for dependency check
3. Configure Database<br>
   - Set up a local MySQL database<br>
   - Update the `hibernate.cfg.xml` with:<br>
      ⟶ your desired Database name and port in the Database URL<br>
      ⟶ your `username`<br>
      ⟶ your `password`<br>
      ⟶ Refer the [hibernate.cfg.xml](https://github.com/CoderKnight03/ORM-using-Hibernate/blob/0763c3f0fae21857800576650d0818cbee26a52c/hibernate.cfg.xml) for easy understanding
4. Change the Entity Properties as per choice or stick to the pre-defined definations. Check the Entity details [here](https://github.com/CoderKnight03/ORM-using-Hibernate/tree/b6df50b5e8cc99b7e03bafe9110dcc061163d15a/Entity)
5. Set proper values as desired, in the CRUD Methodologies. Check [CRUD Methods](https://github.com/CoderKnight03/ORM-using-Hibernate/tree/81a24e8458b72a503e46a206b36c432fb91b88ad/CRUD) for defined Methodologies 
6. Run the Application
   - Make sure `hibernate.cfg.xml` is properly configured and MySQL server is running
   - Also ensure that the defined `database` in `hibernate.cfg.xml` is already created
   - Run `App.java` to initiate the `SessionFactory` and create the Entities in the mentioned database
   - The `SessionFactory` management is done in the `HibernateUtil.java` 
   - Execute various CRUD Operations
     ⟶ new CreateCategory(sessionFactory);
     ⟶ new CreateProduct(sessionFactory);
     ⟶ new CreateUsers(sessionFactory);
     ⟶ new CreateOrders(sessionFactory);
     ⟶ new Fetch(sessionFactory);
7. Verify Database and Output
   - Check the database modifications via `MySQL Workbench` or the `Command Line Client`
  

**Development Highlights**<br>
- Java classes are annotated with JPA annotations like `@Entity`, `@Table`, `@GeneratedValue`, `@Id`, `@OneToMany`, and `@ManyToOne` for mapping the Java Objects to Database Properties and Relations (ORM)
- Relationships between entities are handled using proper mapping cardinalities as per Hibernate Framework
- Passwords are securely encrypted in hashed form using `BCrypt` before saving to the database

See [Test Cases](./TEST_CASES.md) for executing test cases for this Project with defined outputs


**Authors and Acknowledgment**<br>
The Titled Project was created by [Priyal Banerjee](https://github.com/CoderKnight03)
