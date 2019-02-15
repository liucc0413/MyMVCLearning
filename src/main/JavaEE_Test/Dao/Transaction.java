package Dao;

import FiveTeen.Validation.MinMax;
import FiveTeen.Validation.Phone;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

public class Transaction {
    @Max(value = 100, message = "错误,大于100")
    @Min(value = 10,message = "错误,小于10")
    private int productId;

    @Digits(integer =1,fraction = 20)
    private Long userId;

    @NotNull
    @Past
    private Date date;

    @DecimalMin(value = "1.0",message = "price小于1.0")
    private Double price;

    @NotNull
    @Size(min = 1,max = 10,message = "name长度不符合1~10范围")
    private String name;


    @NotBlank(message = "note字符长度为0")
    private String note;//检查null,不检查""," "

    @NotNull(message = "note2字符长度为空")
    private String note2;//不检查null,"".只检查对象

    @NotNull(message = "note21字符长度为空")
    private String note21;

    @NotEmpty(message = "note3字符长度为空")
    private String note3;//检查null,不检查""," "

    @Range(min = 1, max =10,message = "note31字符长度为空")
    private String note31;
    @AssertTrue(message = "值不为true")
    private Boolean isFist;

    @Pattern(regexp = "[a-z]{2}",message = "的类型值为1-7中的2个类型")
    private String regexp;

    @NotNull
    private Integer ceshi1;

    @Phone
    private String phone;


    @MinMax
    private Integer minmax;

    public void  test(@Valid @MinMax Integer wo) {
        System.out.println(wo.toString());
    }

    @MinMax
    public void test2(Integer wo2) {
        System.out.println(wo2.toString());
    }
    public Integer getMinmax() {
        return minmax;
    }

    public void setMinmax(Integer minmax) {
        this.minmax = minmax;
    }

    public Boolean getFist() {
        return isFist;
    }

    public void setFist(Boolean fist) {
        isFist = fist;
    }

    public String getRegexp() {
        return regexp;
    }

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public Integer getCeshi1() {
        return ceshi1;
    }

    public void setCeshi1(Integer ceshi1) {
        this.ceshi1 = ceshi1;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "productId=" + productId +
                ", userId=" + userId +
                ", date=" + date +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", note2='" + note2 + '\'' +
                ", note21='" + note21 + '\'' +
                ", note3='" + note3 + '\'' +
                ", note31='" + note31 + '\'' +
                ", isFist=" + isFist +
                '}';
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getNote21() {
        return note21;
    }

    public void setNote21(String note21) {
        this.note21 = note21;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getNote31() {
        return note31;
    }

    public void setNote31(String note31) {
        this.note31 = note31;
    }

    public boolean isFist() {
        return isFist;
    }

    public void setFist(boolean fist) {
        isFist = fist;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
