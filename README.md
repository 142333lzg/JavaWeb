# JavaWeb项目集合

这个仓库包含了多个Java Web开发学习项目。

## 项目结构

### 1. jdbc-01
- **描述**: JDBC基础学习项目
- **技术栈**: Java, JDBC
- **功能**: 数据库连接和基本操作

### 2. maven01  
- **描述**: Maven项目管理学习
- **技术栈**: Java, Maven
- **功能**: Maven项目结构和依赖管理

### 3. mybatis01
- **描述**: MyBatis框架学习项目
- **技术栈**: Spring Boot, MyBatis, MySQL/H2
- **功能**: 
  - 用户数据的CRUD操作
  - MyBatis注解和XML配置
  - 单元测试

### 4. spring-boot-web-01
- **描述**: Spring Boot Web开发项目
- **技术栈**: Spring Boot, Spring MVC, Vue.js
- **功能**:
  - RESTful API开发
  - 前后端分离架构
  - 用户管理系统

## 运行环境要求

- Java 8+
- Maven 3.6+
- MySQL 5.7+ (可选，可使用H2内存数据库)

## 快速开始

每个项目都可以独立运行，进入对应项目目录后：

```bash
# 编译项目
mvn clean compile

# 运行测试
mvn test

# 对于Spring Boot项目，可以直接运行
mvn spring-boot:run
```

## 学习路径建议

1. **jdbc-01**: 了解Java数据库连接基础
2. **maven01**: 学习Maven项目管理
3. **mybatis01**: 掌握MyBatis ORM框架
4. **spring-boot-web-01**: 学习Spring Boot Web开发

## 作者

zegengli

## 许可证

MIT License