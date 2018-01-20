FROM openjdk:8


ADD build/libs/jalgoarena-auth-*.jar /opt/jalgoarena-auth/jalgoarena-auth.jar

ENV EUREKA_URL=http://eureka:5000/eureka
EXPOSE 9999

ENTRYPOINT java -Dserver.port=9999 -jar /opt/jalgoarena-auth/jalgoarena-auth.jar