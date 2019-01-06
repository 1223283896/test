package com.blade.ssm.dao;

import com.blade.ssm.model.Employee;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface EmployeeDao {
    public int save(Employee employee);

    public int saveBatch(List list);

    public int update(Employee employee);

    public int updateIgnoreNull(Employee employee);

    public int updateBatch(List list);

    public int delete(Employee employee);

    public int deleteBatch(List list);

    public int deleteByPK(Long id);

    public int deleteAll();

    public long count();

    public Employee findByPK(Long id);

    public List find(Map<String, Object> paramMap, PageBounds pageBounds);
}
