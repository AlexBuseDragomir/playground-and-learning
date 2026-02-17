FROM alpine
RUN touch hello.txt 


FROM alpine
RUN mkdir code; \ 
    cd code; \
    echo "Hello World" > hello-world.txt


FROM alpine
RUN mkdir code; \ 
    cd code; \
    echo "Hello World" > hello-world.txt
WORKDIR code
RUN touch newCodeFile.txt


FROM alpine
RUN mkdir code; \ 
    cd code; \
    echo "Hello World" > hello-world.txt
WORKDIR code
RUN touch newCodeFile.txt
CMD echo "Welcome to my container instance" && sh


FROM alpine
# Runs when the image is created
RUN mkdir code; \ 
    cd code; \
    echo "Hello World" > hello-world.txt
WORKDIR code
RUN touch newCodeFile.txt
# Runs when the container is created
CMD echo "Welcome to my container instance" && sh


FROM alpine
# Runs when the image is created
RUN mkdir code; \ 
    cd code; \
    echo "Hello World" > hello-world.txt
WORKDIR code
# Copy Hello.java from the current directory
COPY Hello.java .
RUN touch newCodeFile.txt
# Runs when the container is created
CMD echo "Welcome to my container instance" && sh


FROM openjdk:17
# Runs when the image is created
RUN mkdir code
WORKDIR code
# Copy Hello.java from the current directory
COPY Hello.java .
RUN javac Hello.java
# Runs when the container is created
CMD java Hello && sh


FROM openjdk:17
RUN ["mkdir", "code"]
WORKDIR code
COPY ["Hello.java", "."]
RUN ["javac", "Hello.java"]
CMD ["java", "Hello"]


FROM openjdk:17
RUN ["mkdir", "code"]
WORKDIR code
COPY ["Hello.java", "."]
RUN ["javac", "Hello.java"]
ENTRYPOINT ["java", "Hello"]
CMD ["Alexandru"]


FROM openjdk:17
MAINTAINER Alexandru Dragomir <myemail@domain.com>
RUN ["mkdir", "code"]
WORKDIR code
COPY ["Hello.java", "."]
ADD myfile.tar.gz .
ADD https://www.github.com/mylibrary/releases/1.0.1.jar/lib
ENV DB_HOST_URL mydatabaseurl:1234/db
# Documenting that the container app is listening on port 8080
EXPOSE 8080
# location on machine -> location on container
VOLUME ["/host/dir", "/container/dir"]
USER myusername
RUN ["javac", "Hello.java"]
ENTRYPOINT ["java", "Hello"]
CMD ["Alexandru"]


FROM openjdk:17
MAINTAINER Alexandru Dragomir <myemail@domain.com>
RUN ["mkdir", "code"]
WORKDIR code
ADD ["Hello.java", "."]
RUN ["javac", "Hello.java"]
ENTRYPOINT ["java", "Hello"]
CMD ["Alexandru"]