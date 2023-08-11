insert into student(
        student_id,
        student_number,
        first_name,
        last_name,
        cgpa,
        enrollment_date,
        is_international
    ) values (
        777,
        '000-61-0001',
        'Dara',
        'Kim',
        3.4,
        '2023-08-08 00:00:00',
        true
    );

insert into student(
    student_id,
    student_number,
    first_name,
    middle_name,
    last_name,
    cgpa,
    enrollment_date,
    is_international
) values (
    778,
    '000-61-0002',
    'Lili',
    'H',
    'Michael',
    3.5,
    '2023-08-09 00:00:00',
    true
 );

INSERT INTO users (id, first_name, last_name, email, password, phone, location, authorities, enabled) VALUES (9999999991, 'Edison', 'Hose', 'admin@miu.edu', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', '641890987', '1000 N 4th street, Fairfield, Iowa 52557', 'ROLE_ADMIN', true);
INSERT INTO users (id, first_name, last_name, email, password, phone, location, authorities, enabled) VALUES (9999999992, 'John', 'Deo', 'registrar@miu.com', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', '641890987', '1000 N 4th street, Fairfield, Iowa 52557', 'ROLE_REGISTRAR', true);
INSERT INTO users (id, first_name, last_name, email, password, phone, location, authorities, enabled) VALUES (9999999993, 'Michael', 'Huse', 'student@miu.com', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', '641890987', '1000 N 4th street, Fairfield, Iowa 52557', 'ROLE_STUDENT', true);