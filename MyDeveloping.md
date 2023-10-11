1.Maven  
1.1 资料  
1）官网：https://archive.apache.org/  
2）下载：https://archive.apache.org/dist/maven/  
3）入门：https://juejin.cn/post/6844903543711907848  
1.2 配置  

pom标签  
1 dependencyManagement标签  
1）作用：相当于一个对所依赖jar包进行笨笨管理的管理器  
2）使用  
（1）如果dependencies里的dependency自己没有声明version元素，那么maven就会到dependencyManagement里面去找有没有对该artifactId和groupId进行过版本声明，如果有，就继承它，如果没有就会报错，告诉你必须为dependency声明一个version  
（2）如果dependencies中的dependency声明了version，那么无论dependencyManagement中有无对该jar的version声明，都以dependency里的version为准。  
2 scm标签
    <!-- scm配置，具体路径为待打包代码分支的根路径(trunk、branckes/v1.1.x、/tags/v1.1.5等) -->  
    <scm>
        <!-- 用于发布的链接，用 HTTPS-->
        <connection>scm:git:https://xxx</connection>
        <!-- 用于指定开发者的链接，用HTTPS-->
        <developerConnection>scm:git:https://xxx</developerConnection>
        <!-- #git项目浏览器里的地址-->
        <url>https://gitee.com/devtao/TestEveryThing.git</url>
        <tag>v1.0.1</tag>
    </scm>