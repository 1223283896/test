package com.blade.ssm.dao;

import com.blade.ssm.model.Department;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

import java.util.List;
import java.util.Map;

public interface DepartmentDao {

    public int save(Department department);

    public int saveBatch(List list);

    public int update(Department department);

    public int updateIgnoreNull(Department department);

    public int updateBatch(List list);

    public int delete(Department department);

    public int deleteBatch(List list);

    public int deleteByPK(Long id);

    public int deleteAll();

    public long count();

    public Department findByPK(Long id);

    public List find(Map<String, Object> paramMap, PageBounds pageBounds);

}
