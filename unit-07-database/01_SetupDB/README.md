# 01_SetupDB

## Pasos
1. Levantar MariaDB en Docker (en mac M1):
```bash
docker run --name mariadb-bootcamp -e MARIADB_ROOT_PASSWORD=root -p 3306:3306 -d mariadb:latest
```
2. Conectarse:
```bash
docker exec -it mariadb-bootcamp mariadb -uroot -proot
```
3. Ejecutar `setup.sql`.
4. Verificar: `SHOW TABLES;`
