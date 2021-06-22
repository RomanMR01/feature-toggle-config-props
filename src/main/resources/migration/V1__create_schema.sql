CREATE SCHEMA IF NOT EXISTS storage;
DROP TABLE IF EXISTS storage.products;

CREATE TABLE storage.products (
                            `code` int(11) NOT NULL,
                            `name` varchar(45) DEFAULT NULL,
                            `image` varchar(45) DEFAULT NULL,
                            `rating` varchar(45) DEFAULT NULL,
                            `description` longtext,
                            PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO storage.products VALUES (1,'Product A','product_a.png','4.7','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse in tristique felis, sed tempus ipsum.'),(2,'Product B','product_b.png','3.8','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse in tristique felis, sed tempus ipsum.'),(3,'Product C','product_c.png','3.2','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse in tristique felis, sed tempus ipsum.');
