package entity;

import java.sql.Date;

/**
 * Created by xmfy on 2018/1/30.
 */
public class Collects {
    private int id;
    private String account;
    private String bookId;
    private Date collectTime;

    public Collects(int id, String account, String bookId, Date collectTime) {
        this.id = id;
        this.account = account;
        this.bookId = bookId;
        this.collectTime = collectTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public String toString() {
        return "Collects{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", bookId='" + bookId + '\'' +
                ", collectTime=" + collectTime +
                '}';
    }
}
