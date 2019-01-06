package com.blade.ssm.dao;

import com.blade.ssm.model.Admin;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public interface AdminDao {
    // 插入数据
    public int save(Admin admin);
    public int saveBatch(List list);

    // 更新数据
    public int update(Admin admin);
    public int updateIgnoreNull(Admin admin);
    public int updateBatch(List list);

    // 删除数据
    public int delete(Admin admin);
    public int deleteBatch(List list);
    public int deleteByPK(Long id);
    public int deleteAll();

    // 查询数据
    public long count();
    public Admin findByPK(Long id);
    public List find(HashMap<String, Object> paramMap, PageBounds pageBounds);

}
