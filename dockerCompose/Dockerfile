# 该镜像需要依赖的基础镜像
FROM java
# 将当前目录下的jar包复制到docker容器的/目录下
ADD demo-0.0.1-SNAPSHOT.jar /my_test.jar
ADD application.yml /application.yml
# 运行过程中创建一个my_test.jar文件
RUN bash -c 'touch /my_test.jar.jar'
# 声明服务运行在7004端口
EXPOSE 7004
# 指定docker容器启动时运行jar包
ENTRYPOINT ["java", "-jar","/my_test.jar"]

MAINTAINER KenChen
