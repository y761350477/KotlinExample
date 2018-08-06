package 解析Sql.druid;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableAddColumn;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.stat.TableStat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 解析Sql
 *
 * @author YC
 * Created by 2018-07-27 14:31
 */
public class Example {

    /**
     * 成功!解析修改表结构的alter table语句
     * add、drop、change
     *
     * @author YC
     * Created by 2018/7/27 15:47.
     */
    @Test
    void test1() {
        String selectSql = "alter table test.table change table1 table2 bigint";

        MySqlStatementParser mySqlStatementParser = new MySqlStatementParser(selectSql);

        SQLStatement sqlStatement = mySqlStatementParser.parseStatement();

        MySqlAlterTableStatement statement = (MySqlAlterTableStatement) sqlStatement;
        // 获取表名
        System.out.println(statement.getName());
        System.out.println(statement.getDbType());
        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        statement.accept(visitor);

        // 获取字段名
        Set<TableStat.Column> columns = visitor.getColumns();
        for (TableStat.Column column : columns) {
            System.out.println(column.getName());
        }
        // 想获取操作类型 add/drop/change
        System.out.println(statement.getTableSource() );

    }

    @Test
    void test2() {
        String sql = "alter table t add colomn name varchar(30)";

        MySqlStatementParser parser = new MySqlStatementParser(sql);
        SQLStatement statement = parser.parseStatement();
        MySqlAlterTableAddColumn alter = (MySqlAlterTableAddColumn) statement;
        System.out.println(alter.getFirstColumn().getSimpleName());
    }

    @Test
    void test3() {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println(list.size());
    }
}
