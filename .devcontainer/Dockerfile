FROM rubensa/ubuntu-tini-dev

ARG JAVA_VERSION=11.0.6.hs-adpt
ARG GRADLE_VERSION=6.1

# Gradle config
RUN mkdir /home/${USER_NAME}/.gradle/
COPY gradle.properties /home/${USER_NAME}/.gradle/

# Allow vscode-server cache
RUN mkdir -p /home/${USER_NAME}/.vscode-server

# Create java and maven environment
RUN /bin/bash -l -c "export SDKMAN_DIR=/opt/sdkman;. /opt/sdkman/bin/sdkman-init.sh; sdk install java ${JAVA_VERSION}; sdk install gradle ${GRADLE_VERSION};"

# Keep container running (for use in VSCode)
CMD [ "tail", "-f", "/dev/null" ]