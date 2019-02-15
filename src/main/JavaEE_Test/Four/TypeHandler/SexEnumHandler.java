package Four.TypeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*@MappedTypes(SexEnum.class)
@MappedJdbcTypes(JdbcType.INTEGER)*/
public class SexEnumHandler implements TypeHandler<SexEnum> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        System.out.println("sexEnum set 参数");
        preparedStatement.setInt(i,sexEnum.getId());
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, String s) throws SQLException {
        System.out.println("sexEnum set getResult string columname");

        int id = resultSet.getInt(s);
        return SexEnum.getById(id);
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, int i) throws SQLException {
        System.out.println("sexEnum set getResult string columindex");
        int id = resultSet.getInt(i);

        return SexEnum.getById(id);
    }

    @Override
    public SexEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
