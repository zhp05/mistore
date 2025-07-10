package cn.edu.sdu.service.impl;

import cn.edu.sdu.dao.CollectDao;
import cn.edu.sdu.entity.Collect;
import cn.edu.sdu.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("collectService")
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectDao collectDao;

    @Override
    public void addCollect(int user_id, int product_id) {
        collectDao.addCollect(user_id,product_id);
    }

    @Override
    public List<Collect> getCollect(int user_id) {
        return collectDao.getCollect(user_id);
    }

    @Override
    public int findCollect(int user_id, int product_id) {
        return collectDao.findCollect(user_id,product_id);
    }

    @Override
    public void deleteCollect(int user_id, int product_id) {
        collectDao.deleteCollect(user_id,product_id);
    }
}
