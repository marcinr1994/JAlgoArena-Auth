FROM openjdk:8

WORKDIR /opt/jalgoarena-auth
ADD build/libs/jalgoarena-auth-*.jar /opt/jalgoarena-auth

ENV EUREKA_URL=http://eureka:5000/eureka
EXPOSE 9999

CMD java -Dserver.port=9999 -jar /opt/jalgoarena-auth/jalgoarena-auth-*.jar