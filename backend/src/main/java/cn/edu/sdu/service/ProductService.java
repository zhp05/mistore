package cn.edu.sdu.service;

import cn.edu.sdu.entity.Category;
import cn.edu.sdu.entity.Product;
import cn.edu.sdu.entity.Product_picture;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProductService {

    List<Category> getCategory();

    List<Product> getAllProduct();

    List getCategory_id();

    List<Product> getProductByCategory(int categoryID,int currentPage,int pageSize);

    List<Product> getProductByCategoryName(String categoryName);

    Product getProductByID(int product_id);

    List<Product_picture> getDetailsPicture(int product_id);

    List<Product> getProductBySearch(String search);
}
