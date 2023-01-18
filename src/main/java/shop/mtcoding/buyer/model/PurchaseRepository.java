package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseRepository {
    public int insert(@Param("userId") int userId, @Param("productId") int productId);

    public List<Product> findAll();

    public Product findById(int id);

    public int updateById(@Param("id") int id, @Param("qty") int qty);

    public int deleteById(int id);
}
