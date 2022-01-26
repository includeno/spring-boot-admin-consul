FROM openjdk:11.0.10-jdk

EXPOSE 8080
WORKDIR /app

#Version
ENV VERSION="1.0.0"
ENV NAME="admin-server-consul"

#server
ENV server_port="8080"

#consul
ENV consul_host="127.0.0.1"
ENV consul_port="8500"
ENV consul_service_name="admin-server-consul"

#add jar file
ADD ${NAME}/target/${NAME}-${VERSION}.jar /app/application.jar
#ENTRYPOINT ["java","-jar","/app/application.jar","--dockerconfig=true"]
CMD java -jar /app/application.jar --server.port=${server_port} \
 --spring.cloud.consul.host=${consul_host} --spring.cloud.consul.port=${consul_port} \
 --spring.cloud.consul.discovery.service-name=${consul_service_name}
