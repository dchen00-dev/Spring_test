-- ============================================================
-- Script PostgreSQL
-- Converti depuis Oracle par Claude, j'ai pas envie de le faire à la main
-- ============================================================


-- TABLE : Z_DEPARTMENT

INSERT INTO z_department (dep_id, dep_nom, dep_loc) VALUES (1, 'ACCOUNTING', 'NEW YORK');
INSERT INTO z_department (dep_id, dep_nom, dep_loc) VALUES (2, 'RESEARCH',   'DALLAS');
INSERT INTO z_department (dep_id, dep_nom, dep_loc) VALUES (3, 'SALES',      'CHICAGO');
INSERT INTO z_department (dep_id, dep_nom, dep_loc) VALUES (4, 'OPERATIONS', 'BOSTON');

-- TABLE : Z_EMPLOYEE

INSERT INTO z_employee (emp_id, emp_nom, emp_job, emp_boss_rf, emp_date_embauche, emp_salaire, emp_dept_ref) VALUES
    (1,  'KING',   'PRESIDENT', NULL, '1981-11-17', 5000, 1),
    (2,  'JONES',  'MANAGER',   1,    '1981-04-02', 2975, 2),
    (3,  'SCOTT',  'ANALYST',   2,    '1982-12-09', 3000, 2),
    (4,  'ADAMS',  'CLERK',     5,    '1983-01-12', 1100, 2),
    (5,  'FORD',   'ANALYST',   2,    '1981-12-03', 3000, 2),
    (6,  'SMITH',  'CLERK',     5,    '1980-12-17', 800,  2),
    (7,  'BLAKE',  'MANAGER',   1,    '1981-05-01', 2850, 3),
    (8,  'ALLEN',  'SALESMAN',  7,    '1981-02-20', 1600, 3),
    (9,  'WARD',   'SALESMAN',  13,   '1981-02-22', 1250, 3),
    (10, 'MARTIN', 'SALESMAN',  13,   '1981-09-28', 1250, 3),
    (11, 'TURNER', 'SALESMAN',  7,    '1981-09-08', 1500, 3),
    (12, 'JAMES',  'CLERK',     11,   '1981-12-03', NULL, 3),
    (13, 'CLARK',  'MANAGER',   1,    '1981-06-09', 2450, 1),
    (14, 'MILLER', 'CLERK',     13,   '1982-01-23', 1300, 1);

-- TABLE : Z_ADDRESS   

INSERT INTO z_address (adr_id, adr_adresse, adr_ville, adr_code_postal, adr_emp_ref) VALUES
    (1, '1 RUE DE LA GARE', 'PARIS', '75000', 1);

-- TABLE : Z_PROJECT
   
INSERT INTO z_project (prj_id, prj_description, prj_date_deb, prj_date_fin) VALUES
(1, 'Development of Novel Magnetic Suspension System',       '2006-01-01', '2007-08-13'),
(2, 'Research on thermofluid dynamics in Microdroplets',     '2006-08-22', '2007-03-20'),
(3, 'Foundation of Quantum Technology',                      '2007-02-24', '2008-07-31'),
(4, 'High capacity optical network',                         '2008-01-01', NULL);

-- TABLE : Z_TASK

INSERT INTO z_task (tsk_id, tsk_prj_ref, tsk_description) VALUES
    (1, 1, 'Prj1: Develop feature A'),
    (2, 1, 'Prj1: Develop feature B'),
    (3, 2, 'Prj2: Develop feature A'),
    (4, 3, 'Prj3: Develop feature A'),
    (5, 3, 'Prj3: Develop feature B'),
    (6, 4, 'Prj4: Develop feature A');

-- TABLE : Z_PROJECT_PARTICIPATION

INSERT INTO z_project_participation (par_id, par_prj_ref, par_emp_ref, par_date_deb, par_date_fin, par_role) VALUES
    (1, 1, 4,  '2020-01-01', NULL, 'CLERK'),
    (2, 1, 6,  '2022-03-15', NULL, 'CLERK'),
    (3, 2, 12, '2023-02-02', NULL, 'CLERK'); 
    
-- Resynchronise la séquence après insertions manuelles
-- Pour éviter les conflicts avec l'id qui correspond à une entrée existante
SELECT setval('z_dep_sq', (SELECT MAX(dep_id) FROM z_department)::bigint);
SELECT setval('z_emp_sq', (SELECT MAX(emp_id) FROM z_employee)::bigint);
SELECT setval('z_adr_sq', (SELECT MAX(adr_id) FROM z_address)::bigint);
SELECT setval('z_prj_sq', (SELECT MAX(prj_id) FROM z_project)::bigint);
SELECT setval('z_tsk_sq', (SELECT MAX(tsk_id) FROM z_task)::bigint);
SELECT setval('z_par_sq', (SELECT MAX(par_id) FROM z_project_participation)::bigint);

