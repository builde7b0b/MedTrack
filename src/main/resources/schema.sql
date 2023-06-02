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
CREATE TABLE pharmacy (
                          pharmacy_id INT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          email VARCHAR(100),
                          password VARCHAR(100),
                          address VARCHAR(100)
);


CREATE TABLE orders (
                        order_id INT PRIMARY KEY,
                        pharmacy_id INT,
                        medication_id INT,
                        quantity INT,
                        order_date DATE,
    -- add any additional columns here
                        FOREIGN KEY (pharmacy_id) REFERENCES pharmacy(pharmacy_id),
                        FOREIGN KEY (medication_id) REFERENCES medications(medication_id)
);



