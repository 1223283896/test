package com.blade.ssm.service.impl;

import com.blade.ssm.dao.PositionDao;
import com.blade.ssm.model.Position;
import com.blade.ssm.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//@Service("positionService")
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionDao positionDao;

    public List<Position> findPositions(Map<String, Object> map) {
        return positionDao.findPositions(map);
    }

    public Integer getCount(Map<String, Object> map) {
        return positionDao.getCount(map);
    }

    public Integer addPosition(Position position) {
        return positionDao.addPosition(position);
    }

    public Integer updatePosition(Position position) {
        return positionDao.updatePosition(position);
    }

    public Integer deletePosition(Integer id) {
        return positionDao.deletePosition(id);
    }
}
