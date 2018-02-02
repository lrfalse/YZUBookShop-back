package entity;

import java.sql.Date;

/**
 * Created by xmfy on 2018/2/1.
 */
public class Cart {
    private int id;
    private String seller;
    private int bookId;
    private float price;
    private String buyer;
    private Date createTime;

    public Cart() {
    }

    public Cart(int id, String seller, int bookId, float price, String buyer, Date createTime) {
        this.id = id;
        this.seller = seller;
        this.bookId = bookId;
        this.price = price;
        this.buyer = buyer;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", seller='" + seller + '\'' +
                ", bookId=" + bookId +
                ", price=" + price +
                ", buyer='" + buyer + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
