package cn.ezra.dao;

import cn.ezra.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


public interface DeptDao {
     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}
