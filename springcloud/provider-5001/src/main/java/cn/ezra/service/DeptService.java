package cn.ezra.service;


import cn.ezra.entities.Dept;

import java.util.List;

public interface DeptService
{
	boolean add(Dept dept);

	Dept get(Long id);

	List<Dept> list();
}
