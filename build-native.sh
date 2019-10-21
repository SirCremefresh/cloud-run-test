./mvnw clean package -Pnative

docker build -f src/main/docker/Dockerfile.native -t quarkus/cloud-run-test .
docker tag quarkus/cloud-run-test eu.gcr.io/sircremefresh/quarkus/cloud-run-test:latest
docker push eu.gcr.io/sircremefresh/quarkus/cloud-run-test:latest
