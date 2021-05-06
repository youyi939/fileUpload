# 文件上传组件

### SpringBoot文件上传
共有两个接口

* GET /tset 测试应用是否还活着。返回配置文件中的filepath（上传文件保存路径）
* POST /upload 请求体中加入要上传的文件，格式为filedata,名字为file

### DockerCompose
本地安装docker即可，docker目前都已经自带了dockercompose插件。会根据dockercompose.yml自动生成镜像及容器。
本组件会生成两个容器。
* 基于java的文件上传容器
* 基于httpd的服务器

#####通过volume连接，dockercompose文件夹中的src文件夹就是volume的挂载点。
