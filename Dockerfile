# This is not the best image for java 11, need to find the light and most complete image
FROM amazonlinux:2
EXPOSE 8090

RUN rpm -Uvh https://d3pxv6yz143wms.cloudfront.net/11.0.5.10.1/java-11-amazon-corretto-devel-11.0.5.10-1.x86_64.rpm
ARG JAR_FILE=./target/helloworld-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /opt/hello-world.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","/opt/hello-world.jar"]