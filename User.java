/**
 * @ClassName User
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/10/24  21:06
 * @Veresion 1.0
 */
public class User {
    String name;
    String mobilePhone;
    String officePhone;

    public User(String name, String mobilePhone, String officePhone) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.officePhone = officePhone;
    }
    public String toString(){
        return String.format(" 姓名："+name +" 手机号码："+mobilePhone+" 办公室电话： "+officePhone);
    }
}
