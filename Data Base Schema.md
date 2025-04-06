Category Entity: 
- `id` (`primary key`, `auto-generated`) 
- `name` (`unique`, `not NULL`) 
- Relationship: `One-to-Many` with Product

Product Entity: 
- `id` (`primary key`, `auto-generated`)
- `name` (`not NULL`)
- `price` (`Decimal`, `not NULL`) 
- `stockQuantity` (`integer`)
- Relationship: `Many-to-One` with Category

Users Entity: 
- `id` (`primary key`, `auto-generated`)
- `username` (`unique`, `not NULL`)
- `password` (`Hashed`, `not NULL`)
- `email` (`unique`, `not NULL`)
- `role` (`ADMIN`, `CUSTOMER`)
- Relationship: `One-to-Many` with Orders

Orders Entity: 
- `id` (`primary key`, `auto-generated`)
- `orderDate` (`Timestamp`, `not NULL`)
- `totalAmount` (`Decimal`, `not NULL`)
- Relationship: `Many-to-One` with Users, `One-to-Many` with OrderDetails

OrderDetails Entity: 
- `id` (`primary key`, `auto-generated`) 
- `quantity` (`integer`, `not NULL`) 
- `unitPrice` (`Decimal`, `not NULL`)
- Relationship: `Many-to-One` with Orders, `Many-to-One` with Product
