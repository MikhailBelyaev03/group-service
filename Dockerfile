FROM openjdk:11.0.7-jre-slim

ENV DEMO_ROOT=/root

ADD /group-impl/target/group-impl-0.0.1-SNAPSHOT.jar $DEMO_ROOT
WORKDIR ${DEMO_ROOT}

CMD  ["java", "-jar", "group-impl-0.0.1-SNAPSHOT.jar"]