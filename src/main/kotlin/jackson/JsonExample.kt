package jackson

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

/**
 * kotlin使用jackson的方式.
 * 收获:
 *  1. kotlin使用jackson有特定的依赖包.
 *  2. jackson可以格式化字符串显示样式.
 *  3. 如果解析后的信息为对象形式,则不能使用asText获取文本信息,结果为空,而应该使用toString方法.
 *  // {"name":"list_name","age":"list_age"}
 *
 * @author YC
 * Created by 2018/6/6 22:52.
 */
fun main(args: Array<String>) {

    kotlinJackson()
}

/**
 * kotlin使用jackson
 * 注:
 *  1. kotlin中使用json反序列化不同于java,需要另外添加jackson-module-kotlin依赖.
 *
 * @author YC
 * Created by 2018/6/6 22:33.
 */
fun kotlinJackson() {
    var writeValueAsString = "{\n" +
        "  \"name\" : \"yc\",\n" +
        "  \"age\" : 25,\n" +
        "  \"lists\" : [ \"YC\", \"YangChen\" ]\n" +
        "}"
    var kotlinObjectMapper = jacksonObjectMapper()
    // 格式化json字符串
    val kotlinWrite = kotlinObjectMapper.writerWithDefaultPrettyPrinter()

    // kotlin中使用jackson实现反序列化的方式
    var kotlinReadValue = kotlinObjectMapper.readValue<User>(writeValueAsString, User::class.java)
    println("kotlin中使用jackson实现反序列化的方式:")
    println("获取User对象的name属性:\t${kotlinReadValue.name}")

    // kotlin中使用jackson实现序列化的方式
    var kotlinStringValue = kotlinWrite.writeValueAsString(kotlinReadValue)
    println("kotlin中使用jackson实现序列化的方式:")
    println(kotlinStringValue)
    println()

    // kotlin解析json信息.
    var json: String = "{\n  \"name\": \"yc\",\n  \"age\": 25,\n  \"list\": [\n    {\n      \"name\": \"list_name\",\n      \"age\": \"list_age\"\n    }\n  ],\n  \"object\": {\n    \"name\": \"object_name\"\n  }\n}"
    var kotlinJsonNode = kotlinObjectMapper.readTree(json)
    var elements = kotlinJsonNode.path("list").elements()
    println("获取节点信息为数组的情况:")
    while (elements.hasNext()) {
        println(elements.next().toString())
    }


}

/**
 * 使用java的方式照搬到kotlin中使用jackson出现了反序列化报错的问题.
 * 而解析json信息功能正常、序列化对象信息功能正常.(仅记错用)
 * 注:
 *  1. 这个问题网上搜了很久,一直找不到答案,最后发现问题出在导入的jackson依赖是java的,而kotlin有特定的jackson依赖包.
 *
 * @author YC
 * Created by 2018/6/6 22:47.
 */
fun javaJackson() {
    var json: String = "{\n  \"name\": \"yc\",\n  \"age\": 25,\n  \"list\": [\n    {\n      \"name\": \"list_name\",\n      \"age\": \"list_age\"\n    }\n  ],\n  \"object\": {\n    \"name\": \"object_name\"\n  }\n}"

    var objectMapper: ObjectMapper = ObjectMapper()
    var readTree = objectMapper.readTree(json)

    // 解析json字符串value为单一值时.
    var name = readTree.path("name").asText()
    println(name)

    // 解析json字符串value为数组时.
    var elements = readTree.path("list").elements()
    while (elements.hasNext()) {
        var toString = elements.next()
        println(toString)
    }

    // 解析json字符串value为对象时.
    var asText = readTree.path("object").path("name").asText()
    println(asText)

    // json -> 对象 (反序列化)
    var lists = listOf<String>("YC", "YangChen")
    var user = User("yc", 25, lists)
    var writeValueAsString = objectMapper.writeValueAsString(user)
    println(writeValueAsString)

    // kotlin中使用json序列化. -> 失败报错!
    /*var readValue = objectMapper.readValue<User1>(writeValueAsString, User1::class.java)
    println(readValue.name)*/
}

class User(var name: String, var age: Int, var lists: List<String>)