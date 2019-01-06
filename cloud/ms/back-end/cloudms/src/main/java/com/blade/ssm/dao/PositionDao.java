package com.blade.ssm.dao;

import com.blade.ssm.model.Position;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Repository
@Service
public interface PositionDao {

    public List<Position> findPositions(Map<String, Object> map);

    public Integer getCount(Map<String, Object> map);

    public Integer addPosition(Position position);

    public Integer updatePosition(Position position);

    public Integer deletePosition(Integer id);

}
