package cn.tanjianff.sampleemail.dbEntity;

/**
 * Created by tanjian on 16/10/30.
 * 账号密码实体表,明文Base64编码存放
 */

public class accountRec {
    private String classfy;
    private String account;
    private String passwd;


    public accountRec(){

    }

    public accountRec(String classfy,String account, String passwd) {
        this.classfy=classfy;
        this.account = account;
        this.passwd = passwd;
    }

    public String getClassfy() {
        return classfy;
    }

    public void setClassfy(String classfy) {
        this.classfy = classfy;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
