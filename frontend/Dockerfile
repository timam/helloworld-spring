# This is not the best image for java 11, need to find the light and most complete image
FROM amazonlinux:2
EXPOSE 8020

RUN rpm -Uvh https://d3pxv6yz143wms.cloudfront.net/11.0.5.10.1/java-11-amazon-corretto-devel-11.0.5.10-1.x86_64.rpm
ARG JAR_FILE=./target/frontend-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /opt/frontend.jar
ENTRYPOINT ["java","-jar","/opt/frontend.jar"]
