.gitpod.Dockerfile
FROM gitpod/workspace-full

# Install Java 17
RUN sudo apt-get update && \
    sudo apt-get install -y openjdk-17-jdk && \
    sudo update-alternatives --set java /usr/lib/jvm/java-17-openjdk-amd64/bin/java && \
    sudo update-alternatives --set javac /usr/lib/jvm/java-17-openjdk-amd64/bin/javac

# Install Docker (needed for Testcontainers)
RUN sudo apt-get install -y docker.io

ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
