CREATE TABLE medications (
                             medication_id INT PRIMARY KEY,
                             name VARCHAR(100) NOT NULL,
                             quantity INT,
                             expiration_date DATE
);

CREATE TABLE suppliers (
                           supplier_id INT PRIMARY KEY,
                           name VARCHAR(100) NOT NULL,
                           contact_info VARCHAR(100)
);

-- Define other tables as per requirements
