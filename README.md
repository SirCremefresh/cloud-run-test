
Dev Database
```shell script
docker run --name cloud-run-test-db -e MYSQL_ROOT_PASSWORD=dev-root-password -e MYSQL_USER=cloud-run-test -e MYSQL_DATABASE=cloud_run_test -e MYSQL_PASSWORD=dev-password -p 3306:3306 -d mysql:5.7
```
