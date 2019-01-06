package com.blade.ssm.dao;

import com.blade.ssm.model.Post;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface PostDao {
    public int save(Post Post);

    public int saveBatch(List list);

    public int update(Post Post);

    public int updateIgnoreNull(Post post);

    public int updateBatch(List list);

    public int delete(Post post);

    public int deleteBatch(List list);

    public int deleteByPK(Long id);

    public int deleteAll();

    public long count();

    public Post findByPK(Long id);

    public List find(Map<String, Object> paramMap, PageBounds pageBounds);
}
