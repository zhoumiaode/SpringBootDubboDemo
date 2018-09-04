package com.example.demo.provider1.mapper;

import com.dubbo.demo.api.domain.Girls;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ProjectName: SpringBootDubboDemo
 * @Package: com.example.demo.provider1.mapper
 * @ClassName: DemoMapper
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/09/03 17:17
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/09/03 17:17
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public interface DemoMapper {
    @Select("select * from girls")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    public List<Girls> getList();
}
