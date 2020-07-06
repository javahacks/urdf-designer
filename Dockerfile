FROM openjdk:11.0.7-jre-slim as java-slim

FROM maven:3.6.3-jdk-11-slim as java-base
WORKDIR /usr/src/app
COPY lsp-server .
RUN mvn clean package


FROM node:10.21.0 as theia-base
WORKDIR /usr/src/app
COPY theia-ide .
ENV NODE_OPTIONS=--max_old_space_size=4096
RUN yarn build && \
    yarn autoclean --init && \
    echo *.ts >> .yarnclean && \
    echo *.ts.map >> .yarnclean && \
    echo *.spec.* >> .yarnclean && \
    yarn autoclean --force && \
    yarn cache clean

FROM node:10.21.0-buster-slim
WORKDIR /usr/src/app

COPY --from=java-slim /usr/local/openjdk-11/ /usr/local/openjdk-11
COPY --from=java-base /usr/src/app/urdf-server/target/lsp-server.jar .
ENV PATH=/usr/local/openjdk-11/bin:$PATH
RUN ls /usr/local/openjdk-11/

COPY --from=theia-base /usr/src/app .

COPY sample-workspace /workspace
COPY startup.sh .

EXPOSE 3000
ENTRYPOINT [ "sh","./startup.sh"]



