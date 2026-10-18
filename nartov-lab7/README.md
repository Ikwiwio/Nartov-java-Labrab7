# nartov-lab7-web — лабораторная работа №7

Spring Boot 3.1.5, Java 17, Maven. Веб-приложение с Thymeleaf-формами, H2 file database, CRUD для студентов и учебных групп, Spring Boot Actuator.

## Запуск
1. Откройте корень `nartov-lab7` в IntelliJ IDEA (там лежит `pom.xml`) и выберите JDK 17.
2. Дождитесь Maven import и запустите `ru.nartov.lab7.NartovLab7Application` или `mvn spring-boot:run`.
3. Студенты: http://localhost:8080/list. Группы: http://localhost:8080/groups.
4. H2 Console: http://localhost:8080/h2-console; JDBC URL `jdbc:h2:file:./testdb/students`; user `sa`; password blank.
5. Тесты: `mvn test`.

## CRUD
Students: `/list`, `/addStudentForm`, POST `/saveStudent`, `/showUpdateForm?studentId=...`, `/deleteStudent?studentId=...`.
Groups: `/groups`, `/groups/new`, POST `/groups/save`, `/groups/edit?groupId=...`, `/groups/delete?groupId=...`.
Демонстрационные данные студента и группы создаются один раз при пустых таблицах.

## Actuator
Открытые endpoints: `/actuator/health`, `/actuator/info`, `/actuator/metrics`, `/actuator/beans`. Снимите 3–5 реальных скриншотов вызова endpoints в браузере/Postman и вставьте в `report/Отчет_ЛР7_nartov.docx` на отмеченные места. Они не сымитированы, так как проект здесь не запускался.
Postman collection: `Postman/nartov-lab7-actuator.postman_collection.json`.

Отчёт: `report/Отчет_ЛР7_nartov.docx`. Заполните ФИО, группу и настоящую ссылку на GitHub перед сдачей.
