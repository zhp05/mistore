package cn.edu.sdu.service;

import cn.edu.sdu.entity.Collect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CollectService {

    void addCollect(int user_id,int product_id);

    List<Collect> getCollect(int user_id);

    int findCollect(int user_id,int product_id);

    void deleteCollect(int user_id, int product_id);
}
