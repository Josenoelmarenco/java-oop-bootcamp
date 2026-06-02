# Unit 7 — Persistence (JDBC + MariaDB)

**Objetivo:** conectar Java a una base de datos real, CRUD, ORM ligero.
**Referencia:** módulo 7 del [repo de Vesa](https://github.com/vesavvo/Object-Oriented-Programming) (7.1 a 7.4).

**Entorno:** MariaDB en Docker (ya tienes Docker en tu Mac M1). Driver JDBC vía Maven o JAR descargado.

## Ejercicios

- [ ] 01 SetupDB — levantar MariaDB en Docker + script `setup.sql`
- [ ] 02 ConexionJDBC — conectar, ejecutar `SELECT 1`, cerrar
- [ ] 03 CRUDProductos — INSERT, SELECT, UPDATE, DELETE
- [ ] 04 PreparedStatementDemo — convertir CRUD a PreparedStatement
- [ ] 05 MapeoORM — método `Producto fromResultSet(ResultSet rs)`
- [ ] 06 ClientesYPedidos — relación 1-N con JOIN

## Daily log

-
-

## Para cerrar la unidad

- [ ] Todos los ejercicios compilados y corridos
- [ ] MariaDB en Docker levantado y verificado
- [ ] `_CHEATSHEET.md` con: DriverManager, Connection, PreparedStatement vs Statement, ResultSet, try-with-resources en JDBC
