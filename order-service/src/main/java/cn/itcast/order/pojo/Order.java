package cn.itcast.order.pojo;



import cn.itcast.pojo.Clients;
import lombok.Data;

@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;

    private Clients user;
}