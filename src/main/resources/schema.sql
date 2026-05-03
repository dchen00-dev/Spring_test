-- ============================================================
-- Script PostgreSQL - Formation POE (Denis Willard, mars 2025)
-- Converti depuis Oracle par Claude, j'ai pas envie de le faire à la main
-- ============================================================


-- Enlève les drops si on souhaite garder les tables, si c'est le cas modifier options dans application.properties:
-- spring.jpa.defer-datasource-initialization=true
-- spring.sql.init.mode=always
-- spring.sql.init.continue-on-error=true
-- Drop tables (
DROP TABLE IF EXISTS z_project_participation;
DROP TABLE IF EXISTS z_task;
DROP TABLE IF EXISTS z_address;
DROP TABLE IF EXISTS z_employee;
DROP TABLE IF EXISTS z_project;
DROP TABLE IF EXISTS z_department;

-- Drop sequences
DROP SEQUENCE IF EXISTS z_par_sq;
DROP SEQUENCE IF EXISTS z_tsk_sq;
DROP SEQUENCE IF EXISTS z_prj_sq;
DROP SEQUENCE IF EXISTS z_adr_sq;
DROP SEQUENCE IF EXISTS z_emp_sq;
DROP SEQUENCE IF EXISTS z_dep_sq;


-- ----------------------------
-- SEQUENCES
-- ----------------------------
CREATE SEQUENCE z_emp_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE z_dep_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE z_adr_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE z_prj_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE z_tsk_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE z_par_sq START WITH 1 INCREMENT BY 1;


-- ----------------------------
-- TABLE : Z_DEPARTMENT
-- ----------------------------
CREATE TABLE z_department (
    dep_id     NUMERIC NOT NULL DEFAULT nextval('z_dep_sq'),
    dep_nom    VARCHAR(30),
    dep_loc    VARCHAR(30),
    CONSTRAINT pk_department PRIMARY KEY (dep_id)
);


-- ----------------------------
-- TABLE : Z_EMPLOYEE
-- ----------------------------
CREATE TABLE z_employee (
    emp_id            NUMERIC      NOT NULL DEFAULT nextval('z_emp_sq'),
    emp_nom           VARCHAR(30),
    emp_job           VARCHAR(30),
    emp_boss_rf       NUMERIC,
    emp_date_embauche DATE,
    emp_salaire       NUMERIC(6,2),
    emp_dept_ref      NUMERIC,
    CONSTRAINT pk_employee PRIMARY KEY (emp_id)
);


-- ----------------------------
-- TABLE : Z_ADDRESS
-- ----------------------------
CREATE TABLE z_address (
    adr_id          NUMERIC      NOT NULL DEFAULT nextval('z_adr_sq'),
    adr_adresse     VARCHAR(100),
    adr_ville       VARCHAR(30),
    adr_code_postal VARCHAR(5),
    adr_emp_ref     NUMERIC,
    CONSTRAINT pk_address PRIMARY KEY (adr_id)
);


-- ----------------------------
-- TABLE : Z_PROJECT
-- ----------------------------
CREATE TABLE z_project (
    prj_id          NUMERIC      NOT NULL DEFAULT nextval('z_prj_sq'),
    prj_description VARCHAR(100),
    prj_date_deb    DATE,
    prj_date_fin    DATE,
    CONSTRAINT pk_project PRIMARY KEY (prj_id)
);


-- ----------------------------
-- TABLE : Z_TASK
-- ----------------------------
CREATE TABLE z_task (
    tsk_id          NUMERIC      NOT NULL DEFAULT nextval('z_tsk_sq'),
    tsk_prj_ref     NUMERIC,
    tsk_description VARCHAR(100),
    CONSTRAINT pk_task PRIMARY KEY (tsk_id)
);


-- ----------------------------
-- TABLE : Z_PROJECT_PARTICIPATION
-- ----------------------------
CREATE TABLE z_project_participation (
    par_id       NUMERIC     NOT NULL DEFAULT nextval('z_par_sq'),
    par_prj_ref  NUMERIC,
    par_emp_ref  NUMERIC,
    par_date_deb DATE,
    par_date_fin DATE,
    par_role     VARCHAR(30),
    CONSTRAINT pk_participation PRIMARY KEY (par_id)
);


-- ----------------------------
-- CONTRAINTES REFERENTIELLES
-- ----------------------------
-- Z_EMPLOYEE
ALTER TABLE z_employee ADD CONSTRAINT fk_emp_boss FOREIGN KEY (emp_boss_rf)  REFERENCES z_employee   (emp_id);
ALTER TABLE z_employee ADD CONSTRAINT fk_emp_dept FOREIGN KEY (emp_dept_ref) REFERENCES z_department (dep_id);

-- Z_ADDRESS
ALTER TABLE z_address ADD CONSTRAINT fk_adr_emp FOREIGN KEY (adr_emp_ref) REFERENCES z_employee (emp_id);

-- Z_PROJECT_PARTICIPATION
ALTER TABLE z_project_participation ADD CONSTRAINT fk_par_emp FOREIGN KEY (par_emp_ref) REFERENCES z_employee (emp_id);
ALTER TABLE z_project_participation ADD CONSTRAINT fk_par_prj FOREIGN KEY (par_prj_ref) REFERENCES z_project  (prj_id);

-- Z_TASK
ALTER TABLE z_task ADD CONSTRAINT fk_tsk_prj FOREIGN KEY (tsk_prj_ref) REFERENCES z_project (prj_id);
    