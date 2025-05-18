-- === STOK YÖNETİMİ ===

CREATE TABLE if not exists product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    price NUMERIC(10, 2),
    stock_quantity INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE if not exists warehouse (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(255)
);

CREATE TABLE if not exists inventory  (
    id SERIAL PRIMARY KEY,
    product_id INT REFERENCES product(id) ON DELETE CASCADE,
    warehouse_id INT REFERENCES warehouse(id) ON DELETE CASCADE,
    quantity INT NOT NULL
);

-- === MUHASEBE ===

CREATE TABLE if not exists account  (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    type VARCHAR(50) CHECK (type IN ('GELİR', 'GİDER', 'VARLIK', 'YÜKÜMLÜLÜK')),
    balance NUMERIC(12, 2) DEFAULT 0.00
);

CREATE TABLE if not exists transaction  (
    id SERIAL PRIMARY KEY,
    from_account_id INT REFERENCES account(id),
    to_account_id INT REFERENCES account(id),
    amount NUMERIC(12, 2) NOT NULL,
    description TEXT,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- === İNSAN KAYNAKLARI ===

CREATE TABLE if not exists department  (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT
);

CREATE TABLE if not exists employee (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone VARCHAR(20),
    hire_date DATE,
    salary NUMERIC(10, 2),
    department_id INT REFERENCES department(id)
);

CREATE TABLE if not exists leave_request (
    id SERIAL PRIMARY KEY,
    employee_id INT REFERENCES employee(id) ON DELETE CASCADE,
    start_date DATE,
    end_date DATE,
    reason TEXT,
    status VARCHAR(20) CHECK (status IN ('BEKLEMEDE', 'ONAYLANDI', 'REDDEDİLDİ'))
);

-- === SATIŞ ve SİPARİŞ ===

CREATE TABLE  if not exists customer  (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20),
    address TEXT
);

CREATE TABLE if not exists "order" (
    id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customer(id),
    order_date DATE,
    status VARCHAR(20) CHECK (status IN ('BEKLEMEDE', 'HAZIRLANIYOR', 'KARGOLANDI', 'TESLİM EDİLDİ')),
    total_amount NUMERIC(12, 2)
);

CREATE TABLE if not exists order_item  (
    id SERIAL PRIMARY KEY,
    order_id INT REFERENCES "order"(id) ON DELETE CASCADE,
    product_id INT REFERENCES product(id),
    quantity INT,
    price NUMERIC(10, 2)
);

-- === CRM ===

CREATE TABLE if not exists lead (
    id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customer(id),
    name VARCHAR(100),
    source VARCHAR(100),
    status VARCHAR(50) CHECK (status IN ('YENİ', 'İLGİLİ', 'KAPANDI')),
    contact_date DATE,
    notes TEXT
);

CREATE TABLE if not exists interaction (
    id SERIAL PRIMARY KEY,
    customer_id INT REFERENCES customer(id) ON DELETE CASCADE,
    type VARCHAR(50) CHECK (type IN ('email', 'telefon', 'görüşme')),
    date DATE,
    notes TEXT
);

TRUNCATE TABLE product RESTART IDENTITY CASCADE;
TRUNCATE TABLE warehouse RESTART IDENTITY CASCADE;
TRUNCATE TABLE inventory RESTART IDENTITY CASCADE;

TRUNCATE TABLE account RESTART IDENTITY CASCADE;
TRUNCATE TABLE transaction RESTART IDENTITY CASCADE;

TRUNCATE TABLE department RESTART IDENTITY CASCADE;
TRUNCATE TABLE employee RESTART IDENTITY CASCADE;
TRUNCATE TABLE leave_request RESTART IDENTITY CASCADE;

TRUNCATE TABLE customer RESTART IDENTITY CASCADE;
TRUNCATE TABLE "order" RESTART IDENTITY CASCADE;
TRUNCATE TABLE order_item RESTART IDENTITY CASCADE;

TRUNCATE TABLE lead RESTART IDENTITY CASCADE;
TRUNCATE TABLE interaction RESTART IDENTITY CASCADE;
