./mvnw clean package -Pnative

docker build -f src/main/docker/Dockerfile.native -t quarkus/cloud-run-test .

docker tag quarkus/cloud-run-test eu.gcr.io/sircremefresh/quarkus/cloud-run-test:latest
gcloud auth print-access-token | docker login -u oauth2accesstoken --password-stdin https://eu.gcr.io
docker push eu.gcr.io/sircremefresh/quarkus/cloud-run-test:latest
