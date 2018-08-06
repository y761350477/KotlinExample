package 解析Sql.jsqlparser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.alter.Alter;
import net.sf.jsqlparser.statement.alter.AlterExpression;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * jsqlparser的解析Sql方式
 *
 * @author YC
 * Created by 2018-07-27 15:57
 */
public class Example {

    /**
     * 解析alter table语句.
     * 所需参数: 库名、表名, 增删改的状态、字段名、字段类型.
     * 问题: 无法进行alter table的change操作.
     *
     * @author YC
     * Created by 2018/7/27 16:29.
     */
    @Test
    void test1() throws JSQLParserException {
        String selectSql = "alter table test.table add id bigint";
        Statement statement = CCJSqlParserUtil.parse(selectSql);
        Alter alter = (Alter) statement;
        String schemaName = alter.getTable().getSchemaName();
        System.out.println("库名:\t" + schemaName);
        String name = alter.getTable().getName();
        System.out.println("表名:\t" + name);

        List<AlterExpression> alterExpressions = alter.getAlterExpressions();

        for (AlterExpression alterExpression : alterExpressions) {
            // 获取操作类型
            System.out.println("获取操作类型:\t" + alterExpression.getOperation());
            for (AlterExpression.ColumnDataType columnDataType : alterExpression.getColDataTypeList()) {
                System.out.println("字段类型:\t" + columnDataType.getColDataType().toString());
                System.out.println("字段名:\t" + columnDataType.getColumnName());
            }
        }

    }
}
