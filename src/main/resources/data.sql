CREATE TABLE medication (
                            medication_id INT PRIMARY KEY AUTO_INCREMENT,
                            name VARCHAR(100) NOT NULL,
                            quantity INT,
                            expiration_date DATE
);

CREATE TABLE supplier (
                          supplier_id INT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          contact_info VARCHAR(100)
);

-- Define other tables as per requirements


CREATE TABLE IF NOT EXISTS pharmacy (
                                        pharmacy_id INT PRIMARY KEY AUTO_INCREMENT,
                                        name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    password VARCHAR(100),
    address VARCHAR(100)
    );

CREATE TABLE "order" (
                         order_id INT PRIMARY KEY AUTO_INCREMENT,
                         pharmacy_id INT,
                         medication_id INT,
                         quantity INT,
                         order_date DATE,
    -- add any additional columns here
                         FOREIGN KEY (pharmacy_id) REFERENCES pharmacy(pharmacy_id),
                         FOREIGN KEY (medication_id) REFERENCES medication(medication_id)
);


