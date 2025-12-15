import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {
    /**
     * 编写JDBC程序, 查询数据
     */
    @Test
    public void shouldConnectToMySQLAndQueryUser() throws Exception {
        // 获取连接 - 如果使用本地MySQL，请取消注释下面这行并注释掉远程连接
        // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "root", "your_password");
        Connection conn = DriverManager.getConnection("jdbc:mysql://21.91.145.134:3306/db1", "root", "600461");
        // 创建预编译的PreparedStatement对象
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
        // 设置参数
        pstmt.setString(1, "daqiao"); // 第一个问号对应的参数
        pstmt.setString(2, "123456"); // 第二个问号对应的参数
        // 执行查询
        ResultSet rs = pstmt.executeQuery();
        // 处理结果集
        while (rs.next()) {
            int id = rs.getInt("id");
            String uName = rs.getString("username");
            String pwd = rs.getString("password");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            System.out.println("ID: " + id + ", Username: " + uName + ", Password: " + pwd + ", Name: " + name + ", Age: " + age);
        }
        // 关闭资源
        rs.close();
        pstmt.close();
        conn.close();
    }

}
